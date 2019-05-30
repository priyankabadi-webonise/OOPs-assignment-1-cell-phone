# OOPs-assignment-1--cell-phone

In this program the user can choose a phone according to the it's type and model and perform some common operations. It will display very first on screen option for selecting the type(eg. Android or Apple) and inturn it will diplay list of models to select like samsung note, iphone s2,oppo f1 etc.where after selecting the model it will display to user the information about the selected phone.then it continue to diplay options to perform call, send mms, send sms operations. 


It is created using the classes called "CellPhone" and "NewPhone".where CellPhone is an Abstract class providing one abstract method "make_call".Here the NewPhone extends the CellPhone class to inheret its properties and to define abstract method.The NewPhone class have methods for the displaying the features about selected phone.


In main method switch case statement is used to track the user choice and NewPhone class used to create object according to selected phone model.

example 1


webonise@webonise-desktop:~$ java Phone

Choose mobile model

1.Android 

2.Apple

3.Nothing

1

following are the Android phone choose any one

1.samsung galaxy

2.oppo f1

3.oppo f3

4.samsung note1

5.one-plus

6.nothing


4


_____Features______

play store available

potrait mode

32 mp camera dual

sim slot: dual

Memmory card slot: available



choose operation to perform 


1.make call

2.send SMS

3.send MMS

4.exit

1


please select the SIM No.to call..

1.SIM 1

2.SIM 2

2


call made... by sim2





example 2



webonise@webonise-desktop:~$ java Phone

Choose mobile model


1.Android 

2.Apple

3.Nothing

2
following are the Apple company phones choose any one


1.iphone s2

2.iphone s3

3.iphone s6

4.iphone s8

5.iphone X

6.nothing


4


_____Features______
apple store available

16 mp camera

potrait mode

sim slot: dual

Memmory card slot: available



choose operation to perform
 

1.make call

2.send SMS

3.send MMS

4.exit

2
enter your sms

hello

******this was your sms*******

hello

************



webonise@webonise-desktop:~$ 


# OOPs-assignment-1--cell-phone
