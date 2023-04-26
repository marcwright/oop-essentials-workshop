---
title: Creating Classes
type: Lab
duration: "1:00"
creator:
    name: Drew Mahrt
    city: NYC

---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Creating Classes Lab

## Introduction

> **Instructor Note**: This is a pair-programming activity.

In this lab, you'll apply your knowledge of classes to build a Java program that utilizes an `Animal` class, complete with properties, getters, and setters. After completing the class, you'll instantiate your `Animal` object and use getters and setters to display its properties.

## Exercise

#### Requirements

- Create an `Animal` class with the following `private` properties: `numLegs`, `topSpeed`, `isEndangered`, and `name`.
- Complete the constructor for the `Animal` class.
- Create all getters and setters for the `Animal` properties.
- Instantiate an `Animal` object and display some of its properties.
- Use the setter methods to modify some of the animal's properties and show the modified animal.
- Add at least one additional constructor to create the animal without having to set properties individually.


**Bonus**: Include additional methods in your `Animal` class that return a formatted `String` using the class properties.
**Bonus**: Utilize an interface to create an interchangeable behavior (Strategy Pattern) that returns a String to make the various `Animal` implementations speak.  Create implementations for "Meow", "Bark", and "Growl" **Hint:** Implement the behavior requirements at the Animal level so you only have to write the code in the superclass.  Make the program output a cat that "Meows" then "Growls.  Have a Dog that "Growls" then "Barks" by utilizing composition and strategy during program execution.

#### Starter Code

You'll need to complete the constructor, getters, and setters in the provided `Animal.java` file. `Main.java` contains comments guiding you on the code you need to write.

#### Deliverable

Your program should return the text below, following the requirements above:

```
The Elephant has a top speed of 25 mph.
The Lion has a top speed of 50 mph.
The Cat has a top speed of 30 mph. 
The Cat Meows.
The Cat Growls.
The Dog has a top speed of 40 mph.
The Dog Growls.
The Dog Barks.
```

#### Test Your Code

* Test if your text views contain the proper text.
* Test if your `Animal` constructor works correctly with proper parameters.
* Test your `Animal` class getters.
* Test your `Animal` class setters.

## Additional Resources

- [Oracle: Defining a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Oracle: Instantiating a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)
