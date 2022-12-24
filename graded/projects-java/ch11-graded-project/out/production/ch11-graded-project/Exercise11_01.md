# Project-Chapter 11: The Triangle Class
**Description**
* A program that tests the implementation of a 'Triangle()' object, which extends the
* 'GeometricObject()' superclass. 'Triangle()' has given properties of: side length, color, and filled(bool).
* The program receives no user input, but outputs the area, perimeter, color, and filled(bool) value
* of 'Triangle()' based on its property values.

**Objective**
* Draw the UML diagram that involves the classes __Triangle__ and __GeometricObject__. 
* Implement the class.
* Write a test program that creates a __Triangle__ object with :
  * _sides_ 1, 1.5, 1, 
  * _color_ yellow and 
  * _filled_ true; and, 
  * **displays**: 
    * the **area**, 
    * **perimeter**, 
    * **color**; and,
    * **filled(bool)**

## UML Diagram

Superclass: __GeometricObject__
---
- _color_: String
- _filled_: boolean
- _dateCreated_: Date
---
+ __GeometricObject()__ <!-- no-arg constructor -->
+ __GeometricObject(_color_: String, _filled_: boolean)__ <!-- constructor takes 'color', and 'filled' args -->
+ __getColor()__: String
+ __setColor(_color_: String)__: void
+ __isFilled()__: boolean
+ __setFilled(_filled_: boolean)__: void
+ __getDateCreated()__: __Date__
+ __toString()__: String
---
Class: __Triangle__ *extends* __GeometricObject__
---
- _side1_: double
- _side2_: double
- _side3_: double
---
+ __Triangle()__ <!-- no-arg constructor -->
+ __Triangle(_side1_: double, _side2_: double, _side3_: double)__ <!-- constructor takes 'side1...3' args -->
+ __getSide1()__: double
+ __getSide2()__: double
+ __getSide3()__: double
+ __setSide1(_newSide1_: double)__: void
+ __setSide2(_newSide2_: double)__: void
+ __setSide3(_newSide3_: double)__: void
+ __getArea()__: double
+ __getPerimeter()__: double
+ __toString()__: String