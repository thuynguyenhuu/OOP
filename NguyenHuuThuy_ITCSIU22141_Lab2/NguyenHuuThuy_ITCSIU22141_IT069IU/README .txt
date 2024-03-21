README 


Question 1:

How to compile and run the code:
+ Open folder src
+ Open folder Question 1
+ Open folder Ex1: MarksManager and MarksManagerUse
+ Compile

Example:
+ Enter the number of students: 5
+ Enter mark for student 1, 2, 3, 4, 5: 20, 35, 75, 100, 44
+ 20.0  35.0  75.0  100.0  44.0
+ The mean mark is: 54.8
+ Change the mark of the student number: 1
+ Mark: 30
+ 30.0  35.0  75.0  100.0  44.0


Question 2.1:

Compiling and executing the following code on the MarksManagerUse is no result.


Question 2.2:

A solution to the above problem: 

+ In MarksManager class:

private float[] marks;  ->  public float[] marks;

public void showMarks(float[] marks)  ->  public void showMarks()

public void addMarks(float[] marks)  ->  public void addMarks()

+ In MarksManager class:

add  mManager.initialize();  in between  MarksManager mManager = new MarksManager();  and  mManager.addMarks();  to initialize the marks array first.

How to compile and run the code:
+ Open folder src
+ Open folder Question 2
+ Open folder Ex2: MarksManager and MarksManagerUse
+ Compile

Example:
+ + Enter the number of students: 2
+ Enter mark for student 1: 55
+ Enter mark for student 2: 60
+ 30.0  60.0


Question 2.3:

Compiling and executing the following code on the MarksManagerUse is no result.


Question 2.4:

+ In MarksManager class:

public void showMarks(float[] marks)  ->  public void showMarks()

public void addMarks(float[] marks)  ->  public void addMarks()

+ In MarksManager class:

add  mManager.initialize();  in between  MarksManager mManager = new MarksManager();  and  mManager.addMarks();  to initialize the marks array first.

How to compile and run the code:
+ Open folder src
+ Open folder Question 2
+ Open folder Ex3: MarksManager and MarksManagerUse
+ Compile

Example:
+ + Enter the number of students: 2
+ Enter mark for student 1: 55
+ Enter mark for student 2: 60
+ 30.0  60.0
