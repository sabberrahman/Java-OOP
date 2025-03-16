
## Variables
```java
type variableName = value;

int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'A';
boolean myBool = false;
String myText = "Hello, world";

```

## Data Types

### Primitive Data Types

- `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
    
- `float`: Stores fractional numbers (6-7 decimal digits).
    
- `double`: Stores fractional numbers (15-16 decimal digits).
    

### Non-Primitive Data Types

- `String`, `Array`, `Classes`
    
- Non-primitive types are called **reference types** because they refer to objects.
    
- Primitive types always hold a value, whereas non-primitive types can be `null`.
    
- Primitive types start with a lowercase letter (e.g., `int`), while non-primitive types start with an uppercase letter (e.g., `String`, `ArrayList`).
    
- Non-primitive types can be used to call methods, whereas primitive types cannot.
    

---

## Type Casting

### Widening Casting (Automatic)

- Converts a smaller type to a larger type size.
    
- Order: `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`.

```java

int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
```

### Narrowing Casting (Manual)

- Converts a larger type to a smaller size type.
    
- Order: `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`.
    

```java
double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9

```
---


## Operators

### Ternary (Conditional) Operator

- A shorthand for `if-else` statements.
    
- Syntax: `condition ? value_if_true : value_if_false`.
    


```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```
---

### Modulus Operator

```java
float x = 5; // auto type casting will occur
int y = 2;
System.out.println(x % y); // Outputs 1
```

---

## Conditional Statements and Loops

### If-Else

```java

int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}
```
### Switch Statement


```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  default:
    System.out.println("Friday - Sunday");
}
```
### Loops

#### While Loop

```java

int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

#### Do-While Loop

## do while 

int i = 0;
do {
  System.out.println(i);
  i++;
} while (i < 5);

#### For Loop

## for

for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

#### Nested For Loop

## nested for loop

for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i);
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j);
  }
}
```
#### For-Each Loop

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String car : cars) {
  System.out.println(car);
}
```
#### Break and Continue

```java

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break; // Stops the loop when i is 4
  }
  System.out.println(i);
}

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue; // Skips the iteration when i is 4
  }
  System.out.println(i);
}
```
---

## Object-Oriented Programming (OOP)

### Classes and Objects

```java

public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```
### Static vs. Public

- **Static**: Methods/attributes belong to the class, not the object. Can be called without creating an object.
    
- **Public**: Methods/attributes must be called by creating an object.
    
- **Private**: Accessible only within the declared class.
    
- **Final**: Attributes/methods cannot be overridden/modified.
    

```java

myStaticMethod(); // Call the static method
Main myObj = new Main(); // Create an object of Main
myObj.myPublicMethod(); // Call the public method
```
### Constructors

```java

public class Main {
  int x;

  public Main(int num) {
    this.x = num;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x); // Outputs 5
  }
}
```

### Encapsulation

- Hides sensitive data by making class variables private and providing public getter and setter methods.
    

```java

public class Person {
  private String name; // Private attribute

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
### Inheritance

- Allows a class to inherit attributes and methods from another class using the `extends` keyword.
    

```java

class Vehicle {
  protected String brand = "Ford";

  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk(); // Outputs "Tuut, tuut!"
  }
}
```
### Polymorphism

- Allows methods/objects to behave differently based on the context.
    

```java

class Animal {
  void sound() {
    System.out.println("UAAAAAAAAAH");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("BARK BARK");
  }
}

class Cat extends Animal {
  void sound() {
    System.out.println("Meow, meow");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Cat()};
    for (Animal animal : animals) {
      animal.sound(); // Polymorphic behavior
    }
  }
}
```
### Abstraction

- Hides certain details and shows only essential information using abstract classes/methods.
    

```java
abstract class Animal {
  public abstract void animalSound(); // Abstract method
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
  }
}
```
### Interfaces

- Another way to achieve abstraction. Contains methods without a body.
    

```java

interface Animal {
  public void animalSound();
  public void run();
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void run() {
    System.out.println("Pig is running");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.run();
  }
}
```
---

## Arrays and ArrayLists

### Arrays

```java

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 40, 60};

for (int num : myNum) {
  System.out.println(num);
}
```
### ArrayList

- Resizable array that allows adding/removing elements.
    

```java

import java.util.ArrayList;

ArrayList<String> cars = new ArrayList<String>();
cars.add("BMW");
cars.get(0);
cars.set(0, "OPEL");
cars.remove(0);
```
---

## Exception Handling

```java

try {
  // Block of code to try
} catch (Exception e) {
  // Block of code to handle errors
}
```
---

Additional Notes

 **Method Overloading**: Multiple methods can have the same name with different parameters.
    
- **Lambda Expressions**: Short blocks of code that take parameters and return a value.
    
- **Aggregation**: Represents a HAS-A relationship between classes.
    
- **Final Methods**: Cannot be overridden in subclasses.
    
- **Static Methods**: Cannot be overridden but can be hidden.
    
- **Private Methods**: Not inherited by subclasses and cannot be overridden.
    
- **Super Keyword**: Used to refer to the immediate parent class.

