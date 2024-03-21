README

Question 1:

a. Implement the constructor “public Point (int x)”  

- Open folder src
- Open folder Question 1
- Open folder src
- Open file Point.java
- adding "this.x = x;"


b. Give examples to show the difference between count1 and count2

- Open folder src
- Open folder Question 1
- Open files Point.java, ThreeDPoint.java and Test.java
- Compile

Result:
The difference between count1 and count2
Ctor of Point
Ctor of Point
count1: 2
p1.count2: 1
p2.count2: 1

* count1 is a static variable that is shared among all instances. It is incremented twice( Point(1) and Point(2) ), result: 2.
* count2 is an instance variable which has its own copy in each instances ( p1 and p2 ), result: 1.


c. Implement the constructor “public ThreeDPoint (int x, int y, int z)” 

- Open folder src
- Open folder Question 1
- Open file ThreeDPoint.java
- adding "super(x);"
- adding "this.y = y;"
- adding "this.z = z;"


d. What is the output after calling  
“ThreeDPoint b = new ThreeDPoint (1,2,3);”  

- Open folder src
- Open folder Question 1
- Open files Point.java, ThreeDPoint.java and Test.java
- Compile

Result: 
Ctor of Point
Ctor of ThreeDPoint


Question 2:

How to compile and run my code:

- Open folder src
- Open folder Question 2
- Open files Employee.java, FixedPaidEmployee.java, HourlyEmployee.java, Sales.java and Pay.java (main class)
- Compile