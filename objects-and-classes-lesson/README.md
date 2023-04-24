| Title | Type | Duration | Creator |
| --- | -- | -- | --- |
| Objects and Classes | Lesson | 1:35 | Victor Grazi, NYC |


# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Objects and Classes

## Learning Objectives

At the end of this lesson, students will be able to:
- Instantiate and use an object from a class.
- Create an instance with the `new` keyword.
- Add fields and methods to a class.
- Write constructors (including ones that accept arguments).
- Work with interfaces, inheritance, and polymorphism
- Model SOLID principles in your code
- Utilize the Strategy Design Pattern

## Lesson Guide

| Timing  | Type  | Topic  |
|:-:|---|---|
| 5 min  | Opening  | Learning Objectives | 
| 10 min | Guided Practice | Class Creation |
| 10 min | Guided Practice | Class Features | 
| 10 min | Independent Practice | Calculator Class |  
| 10 min | Guided and Independent Practice | Constructors |  
| 15 min | Guided Practice | Interfaces |  
| 15 min | Guided Practice | Inheritance & Polymorphism |  
| 15 min | Guided Practice | Strategy Design Pattern |  
| 5 min  | Conclusion  | Review/Recap |  

## Opening (5 min)

In OOP, a class is a kind of template for creating **objects**. An object is an **instance** of a class — it contains all of the data fields and functionality defined in its class.

However, each object can contain its own set of values for those fields. For example, a class might define a `name` field of type `String`, but individual instances of that class might have unique values assigned to the `name` field, such as "Jeremy," "Maria," "Carlotta," and so on. 

> **Tip**: Instantiation is a large word, but it comes from the word "instance," which is a little easier to understand. Instantiation is the practice of creating instances (aka, objects) from classes.

**Think of it like so:**

We know humankind is a classification of a creature that thinks, senses, has a body, and more. But we don't think of a specific person as humankind: `HumanKind` is the class, while "Vanna White" is an **instance** of `HumanKind`. Vanna has a name, birth date, brown eyes, two ears, legs, and so on. 

----

## Guided Practice: Step-by-Step Class Creation (10 min)

Let's make this more concrete by creating a class called `HumanKind`. For now, we'll just create a shell of the class, and we can add to it as we go.

While working through this example, remember the idea of the Single Responsibility Principle.  Each class should have one purpose.  The purpose for this class is to provide the functionality that any HumanKind object needs to achieve, including storing their unique information and providing any basic functionality for the human to operate on a day-to-day basis (i.e. Eat, Work, etc).  For now, keeping it simple, the class will just model the unique human's important information.  

### Step 1

First, create the file for the `public` `HumanKind` class. 

> **Knowledge Check**: What would the file name be? It should be `HumanKind.java`.

We must create it in a directory that mimics the package name, i.e., `src/com/generalassembly/oop/intro/HumanKind.java`.  Also note that class names in Java are case-sensitive. Finally, in Java your public class name and the file it is in must match exactly.  For example, if you create a file named `humankind.java` then the class would be declared as `public class humankind`.  Since the filename is `HumanKind.java` the class will also be declared to match exactly as `public class HumanKind`.

```java
package com.generalassembly.oop.intro;

public class HumanKind {
    
}
```

### Step 2

Next, let's add a `main` method so we can execute our code. (Remember: A `main` method defines the entry point of a program.)

> **Tip**: If you hate typing, IntelliJ has a convenient shortcut for defining a `main` method: Just type `psvm` (which stands for `public static void main`) and hit the `tab` key. That's an example of an IntelliJ **live template**. Getting familiar with these will make you a speedy programmer.

```java
package com.generalassembly.oop.intro;

public class HumanKind {
    public static void main(String[] args) {
        
    }
}
```

We've now defined our `HumanKind` class. But classes are not much good until they're **instantiated**.

### Step 3

To create an instance of the `HumanKind` class, you need to call the `HumanKind` **constructor**. This is done using the `new` keyword.

Let's add that instance creation to our `main` method, then print out our instance as follows:

```java
package com.generalassembly.oop.intro;

public class HumanKind {
    public static void main(String[] args) {
        HumanKind vannaWhite = new HumanKind();    
        System.out.println(vannaWhite);
    }
}
```

Voila! We have a new instance of `HumanKind`.

**Let's analyze that:**

- `HumanKind vannaWhite` declares a variable of type `HumanKind` and names that variable `vannaWhite`. The `=` sign assigns everything on its right to the variable on its left.

   > **Tip**: Remember the Java naming convention: camel case for variable names, and classes starting with a capital letter.

- `new HumanKind()` calls the constructor, which is a method with the same name as the `HumanKind` class. Notice that, even though we didn't write a constructor method called `HumanKind()`, Java provides one by default. A constructor is called to **construct** (or create) a new instance of a class using that class as a template. This process is known as instantiation: We're **instantiating** a new object (i.e., creating a new instance of the class).

So in plain English, this statement is saying, "Declare a new variable named `vannaWhite` of type `HumanKind` and assign it a new instance of the class `HumanKind`."

```java
HumanKind vannaWhite = new HumanKind();
```

### Step 4 

Finally, to run our program on IntelliJ, notice the little green arrow on the margin, to the left of our `main` method:

![](resources/execute-main.png)

Give that arrow a left click, then click on "Run HumanKind.main()." That will compile and execute our code and produce output similar to this:

![](resources/execute-main-output.png)

----

## Guided Practice: Class Features (10 min)

Now that we've looked at an example of a class, let's break down its different pieces and take a look at what exactly they're doing.

So far, we've seen how to define the shell of a class. But we'll start to realize the value of a class when we add **members** to it. Members of a class include:
- Fields
- Methods
- Inner classes

Let's look at fields and methods.

### Fields

**Fields** are variables associated with each instance of a class.

> **Knowledge Check**: What are some fields our `HumanKind` class might have? Take a few minutes to create three fields for our `HumanKind` class.

<details>
<summary>Possible Solution</summary>

```java
public class HumanKind {
    private int id;
    private String name;
    private String address;
}
```

</details>

#### Instance vs. Class Variables

Most fields are called **instance variables** because they're contained within an instance of a class. Two different instances of the same class might have completely different values for their instance variables.

You'll frequently hear the fields of an object referred to as its **state**. State essentially describes the object and defines what distinguishes it from any other object of the same class.

For example, if our `HumanKind` class has an `age` field, then `vannaWhite.age` might be 62, while `patSajak.age` might be 72.

> **Information:** How neat is that syntax? `vannaWhite.age` references the `age` field of the object referred to by the `vannaWhite` variable.

Not all fields are instance variables. If a field is declared `static`, then it's called a **class variable**. A class variable shares its value among all instances of that class. Additionally, you don't need to have access to an instance to access a class variable. If the value of a class variable changes for one instance, it changes for all instances. We'll see examples of this shortly, along with why it's useful.

There's one rule you'll need to remember starting today: Make fields in a class `private`, then provide **accessor** (also called **getter**) and **mutator** (also called **setter**) methods for those fields. This is known as **encapsulation**: You never expose the structure of a class to anything outside of it.

### Methods

Methods provide the functionality for objects instantiated from a class. We call a method when we want our object to do or change something. 

> **Knowledge Check**: What methods might we add to the `HumanKind` class? 

<details>
<summary>Possible Solution</summary>

We might have a `setAddress()` method that alters the `address` field's value.

```java
public class HumanKind {
    private String address;
    
    public void setAddress(String address) {
        this.address = address;
    }    
}
```

</details>

Let's study that structure:

1. As with any class member, we start the method declaration with its **visibility**. In this case, it's `public`.
1. Next, we declare the **return type**. In this case, it's a `String`.
1. Finally, we enclose the arguments in parentheses. They represent the values one must supply when calling the method.

We refer to the method name and arguments collectively as the **method signature**.

To call a method, specify the method name followed by parentheses and, inside the parentheses, enclose the values represented by the arguments in the method declaration. If a return value is required, you should assign that return value to a variable or use it in an expression — otherwise, it's lost.

> **Knowledge Check**: How would we call our `setAddress()` method above?

<details>
<summary>Possible Solution</summary>
  
```java
HumanKind.setAddress("123 Main St, Burbank, CA");
```

</details>

> **Tip**: In IntelliJ, if you don't remember the names of the parameters for a particular method, type the method where you want to use it, put your cursor between the parentheses and hit `ctrl+P`. This will show a neat display of the parameters and types.

![](resources/ctrl-p.png)

#### Instance vs. Static Methods

##### Instance Methods

Like fields, methods may or may not be static. Static methods are also known as **class methods**, while non-static methods are known as **instance methods**. 

The implementation of an instance method has access to every field and method declared in the class, no matter the visibility. It can also create its own variables, but these are lost once the method returns.

##### Static Methods

Most of the methods and fields we've defined so far have been instance methods, which require an instance to invoke.

However, Java also provides **static** (aka, **class**) methods that don't require an instance — they just execute on a class. These methods get the `static` keyword before the return type.

Some common examples of static methods are those in the `Math` class: 

```java
System.out.println(a + "**" + b + "=" + (Math.pow(4, 2))); 
// displays 4**2=16.0 (Java has no exponent operator, so we invent ** just for display purposes)
``` 

If a method doesn't access any of the instance fields or methods from the class in which it's defined, consider making it static.

----

## Independent Practice: `Calculator` Class (10 min)

We've covered a lot of ground, so let's do an exercise.

Create a class called `Calculator` and add the `sum` method. Then, add a `main` method to perform the following sums and print out the result:

```java
10 + 20
3.14 + 2.718
1.414 + 3.14
```

<details>
<summary>Solution</summary>
    
```java
package com.generalassembly.oop.intro;

public class Calculator {
    public static double sum(double first, double second) {
        double sum = first + second;
        return sum;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println(sum(10, 20));
        System.out.println(sum(3.14, 2.718));
        System.out.println(sum(1.414, 3.14));
    }
}
```

</details>  

----

## Constructors (10 min)

Oftentimes, it may be convenient to pass some data into a new class after construction.

### Default Constructor

If we don't define a constructor for a class, Java supplies one implicitly. We saw that in our initial implementation of the `HumanKind` class earlier. 

> **Tip**: If you're not doing anything in the constructor, it's totally fine — and a good practice — to just use the default constructor that Java provides and not explicitly declare any constructors at all in your object class.

## Constructors without arguments (No-Argument Constructors)

When you want to instantiate an object, by default a constructor is leveraged.  If you are making no changes at instantiation, then, as stated above, you don't need any constructors.  However, if your class must set some default value or utilize some sort of instantiation method (i.e. read from a configuration file or create a connection to a database or API) for use throughout the entire class, you might explicitly declare the default, no-argument constructor:

```java
public class HumanKind {
    private int id;
    private String name;
    private String address;

    public HumanKind() {
        //open a connection
        //set a common value from a config file
        //etc.
    }
}
```  

In this manner, you've created some additional default functionality for the instantiation of the object.

### Additional Constructor Information

Here are some basic rules for writing our own constructors:

1. A constructor must exactly match the class name in which it's contained.
1. A constructor has no return type.
1. A constructor may not be static.
1. Constructors can be overloaded
1. If you declare an explicit constructor and you need the default no-argument constructor, then you must also explicitly declare the no-argument constructor.

## Constructors With Arguments (Explicit Constructors)

Remember the constructor method we discussed earlier? The one with the same name as the class that gets called whenever a new instance is created? We can pass arguments to that to speed up our process.  We can do this by creating an explicit constructor with parameters, just like any other method can take parameters.

Let's imagine we want to add some fields, as well as some getters and setters:

```java
public class HumanKind {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
```

Now, because all members of our class will have an ID, name, and address, we might do the following for each instance of `HumanKind`:

```java
HumanKind vannaWhite = new HumanKind();
vannaWhite.setId(123);
vannaWhite.setName("Vanna White");
vannaWhite.setAddress("123 Main St, Burbank, CA");

HumanKind patSajak = new HumanKind();
patSajak.setId(456);
patSajak.setName("Pat Sajak");
patSajak.setAddress("456 Elm St, New York, NY");
```

Those are a lot of lines to repeat for each operation. But there's a better way to do it (examined next in the Independent practice).

## Independent Practice: `HumanKind` Class

Add a constructor to our `HumanKind` class that accepts three arguments for the initial values of `id` (`int`), `name` (`String`), and `address` (`String`).  In the constructor, set the local class variables for each field to the appropriate incoming value for the field based on the passed-in parameter values.

When completed, using the explicit constructor, we can now save a few lines of code (and make it clearer along the way) by entering:

```java
HumanKind vannaWhite = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
HumanKind patSajak = new HumanKind(456, "Pat Sajak", "123 Main St, Burbank, CA");
```

<details>
<summary>Solution</summary>
  
```java
package com.generalassembly.oop.intro;

public class HumanKind {
    private int id;
    private String name;
    private String address;

    public HumanKind(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
``` 

</details>

---  

>**Thought Experiment:** As you learn and develop your skills you'll start to see how you might compose objects from other objects to maintain SOLID principles and keep your classes simple and easy to maintain, as well as make your systems useable.  For example, storing the `Address` as a String is not ideal.  Instead of using a String, what might you do instead?  Can you envision how you would then use the field for the Address as a custom type instead of a String?

## Interfaces (10 min)

Interfaces are another structure used in OOP to define objects.  The purpose of an interface is to allow the ability to guarantee some operations while allowing for interchangeability of objects.  

For example, think of a remote control device.  Your television and/or other media devices like a Blu-Ray player all likely have a remote.  However, you can purchase a `generic` remote to run all of your devices? Why does this work?  Because each remote is a unique implementation of the `RemoteInterface`.  Likely, the `RemoteInterface` has some common contractual requirements, such as:

1. Ability to power on/off the device
1. Ability to change volume up/down
1. Ability to change channel up/down
1. Ability to input channel numbers

To make a working `remote`, a company must `implement` all of these capabilities.  A more advanced remote might have the ability to also switch inputs or even navigate settings with a scroll or laser pointer capability.  However, all remotes **must** have the core functionality, and, therefore, all devices can **expect** that any remote would be able to leverage those capabilities.

This is how interfaces work in code. For example, consider the `HumanKind` class we've been working on.  What is one thing all humans must do?  Perhaps you thought of things like `eat` or `sleep`.  

This is a great start. You can't be a living human if you don't have the ability to eat and drink and sleep.  How you eat, what you eat/drink, when and how long you sleep is irrelevant. The fact is you **must** be able to do these things.  We will examine how we can leverage SOLID code later to cover this functionality for a `HumanKind` object.

Additionally, there are other things that have properties similar to a human, such as a Pet with a name.  In order for an object to have a `name`, the object **must** implement getters and setters (mutators and accessors) for the `getName()` and `setName()` methods.  How the object stores this property is also irrelevant (which means you can do some really cool things under the hood using abstraction).  

### Guided Practice: Creating an interface

For purposes of learning, let's examine a simple interface called `IsNamedObject` that makes a contract that ensures any class the implements that `IsNamedObject` interface has getters and setters defined.

#### Create the Interface  

In the folder where the `HumanKind` class is created, create a new `interface` to define the `IsNamedObject` contract in a file named `IsNamedObject.java`:

```java
package com.generalassembly.oop.intro;

public interface IsNamedObject {
    String getName();
    void setName(String name);
}
```  

Note that the properties in this interface do not have the `public` accessibility operator.  This is because all properties in an interface are public by default.

#### Implement the Interface

Now that the interface is defined, change the `HumanKind` class to implement the interface.

Since the properties are already defined, the only work you have to do is use the `implements` keyword to show implementation as per object inheritance in java:

```java
public class HumanKind implements IsNamedObject  {
    //...the rest of the code is unchanged

}
```  

>**Note:** if the methods were not implemented, you would get a compile-time error.  You can see this if you change the name of the `getName()` method to something like `getTheName()`.  You'll see an error similar to `The type HumanKind must implement the inherited abstract method IsNamedObject.getName()` if you try to compile.  When the contract is defined, all objects that are of that type **must** exactly implement the contract.

## Inheritance and Polymorphism  (15 min)  

Now that you've learned about using interfaces, let's take a look at Polymorphism.

In the inheritance and polymorphism of objects in Java, you can use a less-specific type to implement common code.  This is often refered to as `coding to the interface`.  All `named` objects are defined in the interface to have methods of `getName()` and `setName().  Therefore, you can create an array of objects that are all implementing the `IsNamedObject` interface and use them interchangeably.  

For example, consider the problem that you can't have an array of type `String` that holds objects that are of type `Integer` (`int`).  While you can store 32 as "32", the values are not necessarily the same because the string "32" is not the same thing as the number 32.

Try this in any main method:

```java
String[] myStrings = new String[10];
myStrings[0] = "any string";
myStrings[1] = 32;
```  

What happens?  You get an error because the number 32 is not a string.  Sure, you can convert this simple example and 32 as "32" will likely be OK, but this is not good code.  You also can't convert a String to an integer:

```java
int[] myInts = new int[10];
myInts[0] = 32;
myInts[1] = "This is not possible";
```  

You can create an object that holds a String and an int.  In fact, this is what `HumanKind` is doing, with an int ID and a String name, and then you can create an array of HumanKind objects:

```java
HumanKind[] myPeople = new HumanKind[2];
myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
myPeople[1] = new HumanKind(456, "Pat Sajak", "123 Main St, Burbank, CA");

for (HumanKind human : myPeople) {
    System.out.println(human.getName());
}
```  

This is a good practice, but it is still going to fall short in a system where you need to have any interchangeable named objects.

For example, consider a `Pet` class:

```java
package com.generalassembly.oop.intro;

public class Pet implements IsNamedObject {
    private String name;

    public Pet(){

    }
    public Pet(String petName){
        this.name = petName;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String petName) {
        name = petName;
    }
}
```  

This `Pet` object also has a name, but you can't create an array of HumanKind and Pet interchanged, just like you can't do String and int:

```java
HumanKind[] myPeople = new HumanKind[2];
myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
myPeople[1] = new Pet("Spot");
``` 

The error is the same as before, with type mismatch `cannot convert from `Pet` to `HumanKind`.

But what if **all** you care about is the name of all of the objects in your system?

Using Polymorphism, you can leverage the interface as the type!

```java
IsNamedObject[] namedObjects = new IsNamedObject[2];
namedObjects[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
namedObjects[1] = new Pet("Spot");
for (IsNamedObject namedObject : namedObjects) {
    System.out.println(namedObject.getName());
}
```  

Once you utilize polymorphism, you have type interchangeability at the simplest level of the interface, and this gives you great power in OOP.

>**Note:** There is more to learn here.  Consider doing more research on how to utilize casting and object type checking to see how you can leverage the underlying object to get back to more specific properties that are not named as part of the interface.

## Design Patterns (15 min)  

With OOP, there are a number of problems that are common in just about every implemented solution.  For this reason, a group of people got together and created a number of `Design Patterns`. This group of people is known as the `Gang of Four` as there were four of them, and they defined a number of patterns to help with common OOP concerns.

As an OOP developer, you should learn about these patterns, but you should also remember that sometimes a pattern can be overkill so you should implement them when it makes sense and don't over-architect every solution you create for the sake of following patterns.  

Some of the more common patterns are:

- Singleton
- Strategy
- Iterator
- Factory
- Adaptor
- Chain-of-command

You can find out more [here](https://www.gofpatterns.com/)    

### The Strategy Design Pattern   

Earlier we talked about the fact that all `HumanKind` objects should be able to eat.  We could easily create a method that models the behavior of eating.  We could then set it as a string such as "Eating pasta" or "Eating tacos".  What about "Eating Tacos with my hands" vs "Eating pasta with a fork" versus "Eating Rice with chopsticks"?  These are getting more complex.  Also, it's the same thing, just with variations: `eating X with Y`. 

Let's step away from eating and go back to the `HumanKind` to make this more practical.  What about a common method `PerformWork`.  For Vanna, `PerformWork` means to turn the letters.  For Pat, `PerformWork` means to read the clues and recite the wheel values, etc (essentially `moderate` the game). 

Once again, this could be done with a simple string.  In the real world, however, this would likely be operational functionality.  For example, `GetData` with implementations `GetDataFromDatabase` and `GetDataFromAPI`.  Both need to return a list of the object that is being fetched, however one goes to the database, and one calls to an API.  The Database object needs to open a connection and query.  The API object needs to know the target URL Endpoint, pass a token, and then just return the results.

#### Implement the Strategy Pattern to have HumanKind objects PerformWork

To make this simple, consider that the "data" being queried is just an ArrayList of Strings.  The common PerformWork functionality just needs to do this:

```java
ArrayList<String> PerformWork();
```  

To make this work, start by creating an interface that can be used to enforce the method as above in a file named `PerformWorkBehavior.java`:

```java
package com.generalassembly.oop.intro;
import java.util.ArrayList;

public interface PerformWorkBehavior {
    
    ArrayList<String> DoWork();
}
```  

This interface will allow the `HumanKind` class to have the ability to do their job.  

Where this can be a bit different is now the `HumanKind` also needs the requirement to enforce that they have a `Work Behavior`.  To do this, define another interface to enforce getters and setters of the `PerformWorkBehavior` type.  

>**Hint:** if this is confusing, just remember that this is no different than if you were asked to have getters and setters of type `String`. In this case, however, the type is the `PerformWorkBehavior`.

Create a file named `IsWorker.java` and place the following code in it to define the `IsWorker` interface.

```java
package com.generalassembly.oop.intro;

public interface IsWorker {
    PerformWorkBehavior getWorkBehavior();
    void setWorkBehavior(PerformWorkBehavior theWork);
}
```  

Next, implement the interface on the `HumanKind` class by adding the interface, adding the new backing object as a variable, and implementing the getter and setter methods:

```java
public class HumanKind implements IsNamedObject, IsWorker  {
    private int id;
    private String name;
    private String address;
    private PerformWorkBehavior workBehavior;
    
    //... same code as before with no changes here

    //additional code to implement the interface before the end of the class:
        public PerformWorkBehavior getWorkBehavior() {
        return this.workBehavior;
    }

    public void setWorkBehavior(PerformWorkBehavior theWork) {
        this.workBehavior = theWork;
    }
}
```

Now that the code is in place, you need a couple of interchangeable behaviors that can be implemented by `HumanKind` objects.  For additional practice, also consider making the behavior a parameter for another constructor that could be set at instantiation.

Create two new behaviors in separate classes named the same as the class with `.java` at the end of the file:

```java
package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class LetterTurningWorker implements PerformWorkBehavior {

    @Override
    public ArrayList<String> DoWork() {
        ArrayList<String> result = new ArrayList<String>();
        result.add("Find the appropriate letters");
        result.add("Expose the letter to the contestants");

        return result;
    }
}
```  

and

```java
package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class ModeratingWorker implements PerformWorkBehavior {

    @Override
    public ArrayList<String> DoWork() {
        ArrayList<String> result = new ArrayList<String>();
        result.add("Ask to spin the wheel");
        result.add("Read the result of the spin");
        result.add("Ask for a letter");
        result.add("Reveal the result by saying there are N instances of the letter or no instances of the letter");
        return result;
    }
}
```  

With both behaviors created, it is now possible to utilize them in the program.

Create a new program with a main method for the program to utilize the behaviors:

```java
package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class WheelOfFortuneGame {
    public static void main(String[] args) {
        HumanKind[] myPeople = new HumanKind[2];
        myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
        myPeople[1] = new HumanKind(456, "Pat Sajak", "123 Main St, Burbank, CA");

        myPeople[0].setWorkBehavior(new LetterTurningWorker());
        myPeople[1].setWorkBehavior(new ModeratingWorker());
        for (HumanKind human : myPeople) {
            System.out.println(human.getName());

            ArrayList<String> workResults = human.getWorkBehavior().DoWork();
            
            for (String workAction : workResults) {
                System.out.printf("Performed Work: %s\n", workAction);
            }
        }
        
        //and now something happens so vanna has to run the game:
        myPeople[0].setWorkBehavior(new ModeratingWorker());
        System.out.println(myPeople[0].getName());
        ArrayList<String> newWorkResults = myPeople[0].getWorkBehavior().DoWork();
            
        for (String workAction : newWorkResults) {
            System.out.printf("Performed Work: %s\n", workAction);
        }
    }
}
```  

Note that with the work action being interchangable, Vanna (or Pat) can switch how they interact with their work without having to write new classes!  

This simulates what it might be like to have one behavior to get data from an API and one from a Database.  In one run, the worker can get the results from the database, and without changing any code other than the work behavior instance, the worker can then fetch data from the API endpoint!

## Conclusion (5 min)

There's a lot to know about creating classes and objects, isn't there?

With a partner, discuss the following prompts:

* Explain the difference between:
    * Classes and objects (instances).
    * Class variables and instance variables.
    * Static and non-static methods.
    
* Define:
    * Constructors
    * Instances
    * Properties

* Utilize:
    * Polymorphism
    * Design Patterns

* Remember:
    * Solid Principles