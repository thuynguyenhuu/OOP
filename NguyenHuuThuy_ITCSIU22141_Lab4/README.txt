README 


Task 1: Understand and use inheritance

1. - Animal.java is the superclass.
   - Cat.java is the subclass.
   - The Cat.java class extends the Animal.java class, which means that the Cat.java class inherits the fields and methods of the Animal.java class.

2. - The Cat.java class cannot directly access the fields it inherits from Animal. Because the fields "private String name;" and "private int numLegs;" in the Animal.java class are declared as "private". The "private access modifier restricts access to these fields only within the same class, which is Animal.java class.
   - 

6. - Abyssinian.java class should extend to Cat.java class, because Abyssinian.java class belongs to the particular breed of cat.


3, 4, 5, 7, 8, 9.

- Open folder src
- Open folder Task1
- Open files Animal.java, Cat.java, Abyssinian.java and Abyssinian.java
- Compile and Run.


Task 2: Understand polymorphism

1. An inheritance hierarchy drawing:
   
   C
  / \
 D   B
  \ /
   A


2.

a. B myObj = new A();
Allowed.

b. B myObj = new C();
Not allowed.

c. C myObj = new A();
Not allowed.

d. A myObj = new B();
Not allowed.

e. D myObj = new B();
Not allowed.


Task 3: The ArrayBag class

1. The fields of the ArrayBag class:

private Object[] items;  (The array used to store the items in the bag)

private int numItems;  (The number of items in the bag)

public static final int DEFAULT_MAX_SIZE = 50;  (A constant representing the default maximum size of the bag)


2, 3, 4.

- Open folder src
- Open folder Task3
- Open file ArrayBag


5. In light of the rules of polymorphism, an Object reference can refer to an object of any class, and a cast reassures the compiler that the assignment will be valid.