import java.lang.*;
import java.util.*;

abstract class CellPhone{
	Scanner scan=new Scanner(System.in);
	String message;
	protected String type_of_phone;
	abstract void make_call();				//make_call function abstract so that to check for dual sim or single sim call
	public void make_sms(){					//make_sms function 
		System.out.println("enter your sms");
		message=scan.nextLine();
		System.out.println("******this was your sms*******\n"+message+"\n************\n\n");
	}
	public void make_mms(){					// make_mms function
		System.out.println("enter your mms");
		message=scan.nextLine();
		System.out.println("******this was your mms*******\n"+message+"\n************\n\n");
	}
}
class NewPhone extends CellPhone{                               // derives CellPhone properties
	String SIM_slot,Memory_slot;
	String feature1,feature2,feature3 = " ";
	public NewPhone(String type,String sim_slot,String memory_slot,String Feature1,String Feature2,String Feature3){
		type_of_phone=type;
		SIM_slot=sim_slot;
		Memory_slot=memory_slot;
		feature1=Feature1;
		feature2=Feature2;
		feature3=Feature3;
	}
	public NewPhone(String type,String sim_slot,String memory_slot,String Feature1,String Feature2){
		type_of_phone=type;
		SIM_slot=sim_slot;
		Memory_slot=memory_slot;
		feature1=Feature1;
		feature2=Feature2;
	}
	
	public void make_call(){				//defination of make_call function call are made according to sim slot selection
//if single slot than call is made directly		
		if(SIM_slot.equals("single")){
			System.out.println("\n\ncall made...");
		}
//ask for sim card selection to make call 
		if(SIM_slot.equals("dual")){
			System.out.println("\n\nplease select the SIM No.to call..\n1.SIM 1\n2.SIM 2");
			int sim=scan.nextInt();
			System.out.println("\n\ncall made... by sim"+sim);
			
		}
	}
	// displaying the features
	public void display_features(){
		System.out.println("\n\n_____Features______\n"+feature1+"\n"+feature2+"\n"+feature3); 
		System.out.println("sim slot: "+SIM_slot+"\nMemmory card slot: "+Memory_slot+"\n\n");
	}
	// class constractor set features of phone according to model selected
	
}

class ButtonPhone extends CellPhone{
	String SIM_slot;
	String feature1 = " none ";
	public void make_call(){
		System.out.println("calling in progress....");
	}
	public ButtonPhone(String slot,String feature){
		SIM_slot = slot;
		feature1 = feature;
	}
	public ButtonPhone(String slot){
		SIM_slot = slot;
	}
	public void display_features(){
		System.out.println("\n\n_____Features______\n"+feature1); 
		System.out.println("sim slot: "+SIM_slot);
	}

}

public class Phone{
	public static void main(String[] args){
		int model_of_phone=6,type_of_phone;
		int operation_selected=0;
		Scanner scan=new Scanner(System.in);
// selecting category of mobile 
		System.out.println("Choose mobile model\n1.Android \n2.Apple\n3.Button Phones\n4.nothing");
		type_of_phone=scan.nextInt();
// options for android phones
		if(type_of_phone==1){
			System.out.println("following are the Android phone choose any one");
			System.out.println("1.samsung galaxy\n2.oppo f1\n3.oppo f3\n4.samsung note1\n5.one-plus\n6.nothing");
			model_of_phone=scan.nextInt();
		}
//options for iphones
		else if(type_of_phone==2){
			System.out.println("following are the Apple company phones choose any one");
			System.out.println("1.iphone s2\n2.iphone s3\n3.iphone s6\n4.iphone s8\n5.iphone X\n6.nothing");
			model_of_phone=scan.nextInt();
		}
		else if(type_of_phone==3){
			System.out.println("following are the Button phones choose any one");
			System.out.println("1.Reliance LG RD2030\n2.Nokia Asha\n3.nothing");
			model_of_phone=scan.nextInt();
		}
		else
			System.exit(0);
// creating newPhone object according to model selected
		NewPhone n=null;
		ButtonPhone n1=null;
		switch(model_of_phone){
			case 1:if(type_of_phone==1){
					n=new NewPhone("Samsung galaxy","dual","available","play store available","sansung pay");
					
				}
				else if(type_of_phone==2){
					n=new NewPhone("IPhone s2","single","not available","apple store available","2 mp camera ");
					
				}
				else{
					n1=new ButtonPhone("None");
				}
				break;
			case 2:if(type_of_phone==1){
					n=new NewPhone("oppo f1","dual","available","play store available","16 mp camera");
					
				}
				else if(type_of_phone==2){
					n=new NewPhone("IPhone s3","single","available","apple store available","4 mp camera ");
					
				}
				else{
					n1=new ButtonPhone("single","camera 0.3 mp");
				}
				break;
			case 3:if(type_of_phone==1){
					n=new NewPhone("oppo f3","dual","available","play store available","with selfe expert","16 mp camera");
					
				}
				else if(type_of_phone==2){
					n=new NewPhone("IPhone s6","dual","available","apple store available","8 mp camera");
					
				}
				else{
					break;
				}
				break;
			case 4:if(type_of_phone==1){
					n=new NewPhone("samsung note","dual","available","play store available","potrait mode","32 mp camera dual");
					
				}
				else if(type_of_phone==2){
					n=new NewPhone("IPhone s8","dual","available","apple store available","16 mp camera","potrait mode");
				
				}
				else{
					break;
				}
				break;
			case 5:if(type_of_phone==1){
					n=new NewPhone("oneplus","dual","available","play store available","google pay","32 mp camera dual");
					
				}
				else if(type_of_phone==2){
					n=new NewPhone("IPhone X","dual","available","apple store available","32 mp camera better camera","large size");
					
				}
				else{
					break;
				}
				break;
			default:System.exit(0);
				break;
		}
		if(type_of_phone==3){
					n1.display_features();//display features
					System.out.println("choose operation to perform \n1.make call\n2.send SMS\n3.exit");
					operation_selected=scan.nextInt();//option to select operation to perform
				}
				else{
					n.display_features();//display features
					System.out.println("choose operation to perform \n1.make call\n2.send SMS\n3.send MMS\n4.exit");
					operation_selected=scan.nextInt();//option to select operation to perform
				}
		
					
		
		switch(operation_selected){
			case 1:
				if(type_of_phone==3){
					n1.make_call();// make_call function
					break;
				}
				else{
					n.make_call();// make_call function
					break;
				}
			case 2:
				if(type_of_phone==3){
					n1.make_sms();//make_sms function
					break;
				}
				else{
					n.make_sms();//make_sms function
					break;
				}
			case 3:
			if(type_of_phone==3){
				break;
			}
			else{
				n.make_mms();//make_mms function
				break;
			}
			default:System.exit(0);
		}
		
		
		
		
	}
} 

