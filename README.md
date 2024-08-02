# Java Basics

Welcome to the Java Basics repository! This repository contains all the foundational concepts you need to get started with Java programming.

## Table of Contents

1. [Introduction](#introduction)
2. [Data Types](#data-types)
3. [Setup and Environment](#setup-and-environment)
4. [Operations and Expressions](#operations-and-expressions)
5. [String Class and Printing](#string-class-and-printing)
6. [Conditional Statement](#conditional-statement)
7. [Loops](#loops)
8. [Arrays](#arrays)
9. [Methods](#methods)  
10. [Principles of OPP](#principles_of_oop)


## Introduction
This section provides you with how to take the input and how to print the output on the console.


## Data Types

An overview of the different data types in Java, including primitives (int, char, boolean, etc.) and reference types (arrays, strings, etc.).

## Setup and Environment

Overview of the JDK, JRE, and JVM.

## Operations and Expressions

- Arithmetic operator and expressions
- Increment / decrement operators and expressions
- Bitwise operators

## String Class and Printing

To understand about the String objects, methods of the String class, and regular expressions.

## Conditional Statement

Understand the various control structures in Java such as if-else statements, switch cases, loops (for, while, do-while), and break/continue statements.


## Loops
- Loops are repeating statements.
- There are four types of loops.
- In loops, the steps are repeated till the given condition is reached.

### while
- The steps are executed if the condition is true.
- The condition is checked first and the process is followed.
- It is a pre-tested loop.
- If the condition is false, then the process is never executed.

### do-while
- First, the process is followed and then the condition is checked.
- It is a post-tested loop.
- If the condition is false, then the process is executed at least once.
- Both loops work for the same purpose.
- But do-while loop is more suitable than while loop.

### for
- For loop is a counter-controlled loop.
- It is the most frequently used loop.
- Syntax: for(initialization; condition; updation)

### Nested loops
- For loop inside a for loop is an example of a nested loop.
- The above one is used commonly.
- The working of the body is more than one dimensional.
- Nesting of any two types of loops can be done.
- Nested for loop may create the dimensional loops.

Example program for nested for loop.

## Arrays
### 1D Array
- Array is a collection of similar data elements.
- In Java, the array size is given after creating the new object.
- As `int A[] = new int[x];`
- Where `A[]` is the reference and `int[x]` is the object.
- Where the object is created in the heap.
- And the reference is either in the stack or heap.
- Location of characters in an array can be accessed by using their index.
- Every array in Java has length as its property which can be accessed by using `array-name.length`.
- For loops are most frequently used for arrays.
- Using for loop all the elements in the arrays can be accessed.
- Java has introduced for each loop for accessing arrays in version Java 1.5 or Java 5.

### 2D Array
- Two-dimensional arrays are suitable for matrices and tabular forms.
- Syntax for creating a two-dimensional array in Java is: `int A[][] = new int[3][4];`
- It is also known as array of arrays or collection of arrays.
- The object is created in heap but the reference may or may not be created in heap.
- `Array_name.length` gives the number of rows.
- `Array_name[index].length` gives the number of columns.

## Methods
### What are methods
- Methods are members of classes which provide functionality for classes.
- We can write our own methods in the classes.
- The functions performing on the data are known as methods.
- When a method returns a value then the method itself takes the value.
- A method will have its own copy of variable.

### Passing object as parameters
- To call a method from the main method it needs to be made static.
- When the method is called the value of actual parameters are copied in formal parameters which is the only parameter passing method in Java.
- The address of the object in formal and actual parameters is the same.
- String cannot be modified as it is immutable.
- A method can also return an object.

### Parameter passing in Java
- Whoever is calling a method is called a caller or a method call.
- The method which is called by a caller is known as the called method.
- The parameters/arguments passed in the calling method are called actual parameters.
- The parameters of a called method are called formal parameters.
- Formal parameters are nothing but input into a method where the return type is known as output to a method.
- The contents of actual parameters are copied in formal parameters which is the only method of parameter passing in Java.
- Passing of objects also follows the same method.
- Parameter passing for primitive data types the values are copied in formal parameters, whereas in parameter passing of objects the reference of the object ID is copied in formal parameters.
- In short, the primitive data types are passed by value and the objects are passed by reference.

### Method overloading
- Method overloading means writing more than one method having the same names but different parameter lists or data types.
- Compiler will call the corresponding method depending upon the parameter list.

### Variable arguments
- It is nothing but writing a single method which can run for a number of parameters of the same data types.
- For example: `void show(int ...x)`
- Where `...` represents the variable arguments.
- It is similar to ellipsis in C/C++.
- The parameters passed are converted into an array.
- The parameters can be directly passed using an anonymous array.
- Variable argument should always be the last parameter.
- `Printf` is based on variable arguments in version 1.7 Java.

### Command line arguments
- Java programs can utilize command line arguments.
- DOS file is used for command line arguments.
- There are different commands like:
  - `cls`: to clear the screen.
  - `dir`: to display the contents of the disk.
  - `cd windows`: to change the directory.

- `C:\Windows> dir v*.*`
- The above is a command line in which `dir` is the command and `v*.*` is an argument.


## Principles of OPP
### Principles	of	Object-Oriented	programming	are	
### 1.Abstraction.
  - Abstraction	means	hiding	internal	details	and	showing	the	required	
things
  - For Example
Consider a man driving a car, while driving he focus on using of steering, gear,
accelerator etc.
He does not require to know the inner mechanism of the car.	

### 2.Encapsulation.	
- Encapsulation	is	the	process	of	grouping	data	in	a	single	section.
- For	Example		
Complete	television	is	single	box	where	all	the	mechanism	are	hidden	inside	the	
box	all	are	capsuled

### 3.Inheritance.
- Inheritance	means	designing	an	object	or	a	class	by	re-using	the	
properties	of	the	existing	class	and	object.
- Inheritance	is	same	as	specialization.	
- For	Example		
A	old	style	television	(idiot	box)	is	transformed	with	extra	features	into	slim	and	
smart	television	where	it	re-used	the	properties	of	old	television.

### 4.Polymorphism.
- Polymorphism	is	a	concept	in	which	we	can	execute	a	single	
operation	in	different	ways.
- polymorphism	is	same	as	generalization.

## Class VS Object
- Object	is	deEined	in	terms	of	its	properties	and	behaviour.
- Operation	of	behaviours	will	affect	the	properties.	
- Anything	in	the	world	can	be	deEined	in	the	terms	of	properties	and	
behaviour.	
- For	a	single	class	wee	can	have	many	objects.	
- Multiple	number	of	objects	can	be	created	by	one	single	class		

## Data Hiding

- Usually	data	is	hidden	and	the	operations	are	made	visible	and	
operations	or	methods	are	performed	over	the	data	
 
- For	example	
Actual	operation	of	the	television	is	performed	in	the	circuitry	which	is	done	by	
pressing	a	button.so	the	circuitry	is	data	and	operations	are	methods	where	the	
data	is	hidden	inside	the	box.

### Types of Proper:es
- Read	and	writable	property.	
- getLength()	method	will	allow	us	to	read	the	property	and	
setLength()	method	will	allow	us	to	write	the	property	.	
- Read	only	property.	
- When	there	is	no	modiEication	to	the	property	then	read	only	
property	is	used.		
- Write	only	property.	
- Only	set	method	is	used	for	writing	the	property	where	no	get	
method	is	used.	

### Constructors
- 	A	method	is	required	for	Initialization	of	properties	at	the	time	of	
construction	of	an	object,	this	method	is	known	as	constructor.	
- Constructor	is	a	method	of	class	called	when	an	object	is	created.	
- Every	class	will	have	a	default	constructor	provided	by	java	compiler.	
- Constructor	will	not	have	any	return	type.		
- There	are	two	types	of	constructors		
  - 1.	parameterized	
  - 2.	Non-parameterized.	
- Non-parameterized	constructors	is	a	replacement	for	default	
constructors.	
- Constructors	can	be	overloaded.


**Note:** This documentation is from the `Java-study-note` branch.
