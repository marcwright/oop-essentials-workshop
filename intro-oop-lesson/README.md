| Title | Type | Duration | Creator |
| --- | -- | -- | --- |
| Intro to Object-Oriented Programming | Lesson | 0:40 | Victor Grazi, NYC |

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Intro to Object-Oriented Programming

## Learning Objectives

At the end of this lesson, students will be able to:
- Define the four principles of object-oriented programming.
- Explain how classes and objects factor into object-oriented programming.

## Lesson Guide

| Timing  | Type  | Topic  |
|:-:|---|---|
| 5 min  | Opening  | Learning Objectives |
| 10 min  | Introduction  | The Four Principles of OOP |
| 10 min  | SOLID | The Five SOLID Principles |  
| 10 min  | Demo  | Classes and Modifiers |
| 5 min  | Conclusion  | Review/Recap |

## Opening (5 min)

**Object-oriented programming** (OOP) is a concept that was first introduced in the 1960s with the advent of the Simula programming language and became popular some 25 years later with C++.

Whereas earlier languages were **procedural** in nature, object-oriented programming introduced the concept of **objects** — compartments of data and functionality that could easily retain and modify their own instance data.

-----

## The Four Principles of OOP (10 min)

The four pillars of object-oriented programming are:

* Abstraction
* Polymorphism
* Inheritance
* Encapsulation

> Why are they ordered like that? Because it spells "A PIE." If you like pie and acronyms, this might help you remember these four concepts!

### Abstraction

The idea behind abstraction is that the average person doesn't need to know the inner workings of something in order to use it successfully. For example, you don't have to be a mechanic to drive a car.

### Encapsulation

Encapsulation is related to abstraction but goes a step further. Not only does the average user not need to have access to the inner workings of something in order to use it, if they do have access, it may actually be harmful.

You could technically start your car with a screwdriver or directly with electricity, but you really shouldn't — you might hurt yourself or damage your car. Likewise, your users don't always need direct access to sensitive parts of your code.

![](https://res.cloudinary.com/briezh/image/upload/v1560812857/bike-brakes_pvfblg.jpg)

> Image credit goes to [this article](https://dev.to/charanrajgolla/beginners-guide---object-oriented-programming), which we highly recommend reading if this course feels a bit too fast paced.

### Inheritance

Inheritance allows classes to "inherit" code from one another. The base class is called the **parent** and the inheritor or beneficiary class is called the **child**. It's just one more way of keeping our code shorter and simpler.

The most frequent use of inheritance is for deriving classes using existing classes, which provides reusability. The existing classes remain unchanged. By promoting reusability in our code, the development time of software is reduced.

### Polymorphism

Polymorphism simply means "many forms." It refers to the fact that a method could have multiple implementations, either differing between a parent and a child class (method overriding) or depending on the type and number of arguments (method overloading).

----

## Classes and Modifiers (10 min)

Before object-oriented programming came along, programming languages like C sported a feature called `struct` — a way of defining a common format to allocate blocks of consistent data types.
 
For example:

```java
struct Person { 
    double birthdate;
    int id; 
    char name[50];
} 
```

That would basically allow you to carve out memory for all of the structure's variables (e.g., `birthdate`, `id`, `name`) simply by assigning a new `struct`.

Now that we have data as a `struct`, why not add **functionality** to that structure (e.g., derive a person's age given today's date) and include that functionality inside the `struct` itself? That's exactly what a **class** is — a data structure with functions or methods.

> In our example of deriving a person's age given today's date, we might create a method called `getCurrentAge()` or something similar.

### Defining a Class

We've already seen several examples of classes. They all conform to this common pattern:

```java
public class MyClass {
    // guts of the class
}
```

In this example, `public` refers to the class visibility. Top-level classes can only be `public` or default (unspecified). "Top level" means they're not inner classes, which we'll define later in this lesson.

`public` classes can be referenced by any other class, and this is the most common class visibility. A file may contain **no more than one** `public` class. The rule is that every top-level `public` Java class must reside in a file that exactly matches the file name (minus the `.java` file type). 

#### Default Classes

Default classes don't specify an access modifier. For example:

```java
class MyDefaultClass {}
```

They can be accessed in the current file, as well as by other classes in the same package. For this reason, the default visibility level is called "package" or "package-private."

Package and public are the only access levels available for top-level classes. But as we'll see, inner classes can also be `protected` or `private`.

#### Access Levels

The access levels — going from most to least restrictive — are:

```
private --> package --> protected --> public
```

`private`, `protected`, and `public` are all **access modifiers**, which means you specifically add them in so you can change the access (or protection) level away from the default we described above.

This nifty table from [Oracle's docs on access control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) shows what's unique about each level:

![](https://res.cloudinary.com/briezh/image/upload/v1560810976/Screen_Shot_2019-06-17_at_3.35.38_PM_fq9ffm.png)

----

## SOLID Design Principles

The `A PIE` acronym above was used to talk about the tenets of OOP.  There are also a few principles that help to write better code.  These principles are known as the SOLID Design Principles. As you grow in your skills as a developer, you will learn to engage these principles in your daily work.

>**Note:** It is important to call out that SOLID design is a great approach to writing usable code that is easier to work with.  That being said, your organization will ultimately decide how strict they want you to be on all of the principles.

### S is for the `Single Responsibility` Principle`

The Single Responsibility principle states that every class you write should have one, and only one responsibility.

For example, if you wanted to write classes to model financial transactions, you would create a class that handles a loan and a class that handles an account.  You would not create a class that has to take care of all of the responsibilities of a loan and an account.

### O is for `Open-Closed` Principle

The Open-Closed principle means that your classes are open for extension and closed for modification.  In other words, once a class has been created, you should not change the general operation of the class.  When you need to make changes, you utilize the hierarchical inheritance that is part of OOP to create new classes or behaviors that can `extend` the original functionality without changing anything.

For example, in the `Account` class above, you typically have methods like `Deposit` and `Withdraw`.  You don't want to go back and create a new type of account at the base level that also lets you do something like `earn interest` because not every account will earn interest.  Additionally, some accounts will earn interest in different ways.  Because of this, you might have an extension that is a new class which inherits from the base account class to be an `interest-earning-account`.  In this manner, the base account object is not modified but it is extended to allow for additional functionality.

### L is for `Liskov Substitution` Principle

The `Liskov Substitution` principle is one of the more difficult examples to understand and implement.  The tenet here is that you can interchange a more-specific object for a base object without causing any error in functionality.

For example, in the base account above, there is no ability to earn interest.  In the extension mentioned, your account can now earn interest.  

If code is called that `requires` and interest-earning account, not every account will work in that scenario.  The programs you write should therefore be agnostic to whether the account can earn interest or not.

>**Thought Exercise: Think about and answer the following questions**: 

1) Does it matter if your account earns interest or not when you make a deposit or withdrawal?
1) Can a program be written that calculates the monthly statement regardless of the underlying account earning interest or not?  
1) How might you approach this principle by utilizing inheritance?

>**End Thought Exercise**

### I is for `Interface Segregation` Principle

The `Interface Segregation` Principle states that you should create your interfaces with the Single Responsibility Principle and the Liskov Substitution Principle in mind.  In this manner, you will create smaller interfaces that allow your implementing classes to be limited to the small range of abilities defined in the interface.

For example, a program responsible for displaying the current balance of an account doesn't care how that account balance was calculated. The only responsibility for that program is to display the current value.  The calculation of that amount should be handled with a different interface.  

>**Note:** Smaller interfaces allow for much more flexible implementing classes but it does not limit you to only the ability of an interface.  

With OOP in Java (and other OOP languages except C#), if you want an object to have `multiple inheritance`, or the ability to act like multiple objects, you simply implement multiple interfaces.  

In the example above, this means you can have one class that only implements the DisplayBalance interface and another that implements interfaces for DisplayBalance and CalculateBalance.

### D is for `Dependency Inversion` Principle

The final SOLID principle is `Dependency Inversion`.  In this principle, you learn how to allow for `Dependency Injection`.  The idea is based on the tenet of `Inversion of Control.`  Using IoC or DI, you gain the ability to compose more powerful objects via polymorphism that aren't locked in to one single use, while also maintaining the other principles.

For example, change the idea above to allow for inversion of control on how the interest is earned.  Now create an interface that is based on the behavior of `earning interest`.  When you do this, you can then have implementing classes that are all able to "calculate" earned interest with the same method call but return values appropriate to their functionality, such as `NoInterest` or `PercentageBasedInterest`.  


### More about SOLID

First of all, it's ok if you are not yet a master of all of the SOLID principles.  It is expected that some of the SOLID concepts take some time and practical examples to fully understand.

For this reason, the next lesson will continue to build on our knowledge of SOLID as we cover the use of objects via classes, interfaces, and inheritance.  

## Conclusion (5 min)

Object-oriented programming is the practice of using classes and objects to make code modular (encapsulated) and often reusable. A class can be thought of as a blueprint for a building or a pattern for a dress. There's one blueprint, but you can build many buildings with it. There's one dress pattern, but you can manufacture many dresses with it.

> **Knowledge Check**: 

1) Can you define each of the four OOP pillars?  What is an example of each?
    - Abstraction
    - Polymorphism
    - Inheritance
    - Encapsulation

1) If asked, would you be able to define and give an example of each of the five SOLID design principles?
    - Single Responsibility Principle (S)
    - Open-Closed Principle (O)
    - Liskov-Substitution Principle (L)
    - Interface Segregation (I)
    - Dependency Inversion (D)

## Additional Resources

* [Oracle Docs: Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
* [OOP for Beginners](https://dev.to/charanrajgolla/beginners-guide---object-oriented-programming)
* [Four Principles of OOP](https://medium.com/@cancerian0684/what-are-four-basic-principles-of-object-oriented-programming-645af8b43727)
