import java.util.Date;

/** __Adapted From__: `Project-Chapter11.doc`, provided as part of coursework; 2022-11-04
 * _Project-Chapter11_: Triangle Class; 22FA-CSC501B-OL-14927 (Graduate Programming Practicum)
 * _Date_: 2022-11-04
 * _Author_: Jared Robbins
 * _NETID_: jlrob
 * _Description_: A program that tests the implementation of a 'Triangle()' object, which extends the
 * 'GeometricObject()' superclass. 'Triangle()' has given properties of: side length, color, and filled(bool).
 * The program receives no user input, but outputs the area, perimeter, color, and filled(bool) value
 * of 'Triangle()' based on its property values. */

public class Exercise11_01 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is "
                + triangle.getPerimeter());
        System.out.println(triangle);
    }
}
class GeometricObject {
    // Copy it from the book -> **[Jared Robbins; 2022-04-11]: in-line comment given by instructor **
    // (Source: Y. Daniel Liang. "Introduction to Java Programming and Data Structures, 12th Edition". Pearson, 2019); 2022-11-04
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Construct a default geometric object [(author, source)]
    public GeometricObject() {
        dateCreated = new Date();
    }
    // Construct a geometric object w/ specified color and filled value [(author, source)]
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    // Return color [(author, source)]
    public String getColor() {
        return color;
    }
    // Set a new color[(author, source)]
    public void setColor(String color) {
        this.color = color;
    }
    // Return filled. Since filled is boolean, its getter method is named 'isFilled' [(author, source)]
    public boolean isFilled() {
        return filled;
    }
    // Set a new 'filled' [(author, source)]
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // Get 'dateCreated' [(author, source)]
    public Date getDateCreated() {
        return dateCreated;
    }
    // Return a string representation of this object [(author, source)]
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
class Triangle extends GeometricObject {
    // Implement it -> **[Jared Robbins: 2022-11-04]: in-line comment given by instructor **
    // three sides of the 'triangle' (mine)
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}; // no-arg constructor (mine)
    public Triangle(double side1, double side2, double side3) {
        // constructs Triangle () object with class variables (mine)
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // getters && setters for class variables (mine)
    public double getSide1() {
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }
    public void setSide1(double newSide1) {
        this.side1 = newSide1;
    }
    public void setSide2(double newSide2) {
        this.side2 = newSide2;
    }
    public void setSide3(double newSide3) {
        this.side3 = newSide3;
    }
    // class methods (mine)
    public double getArea() {
        // Adapted from: "Exercise 2.19".(Source: Y. Daniel Liang. "Introduction to Java Programming and Data Structures, 12th Edition". Pearson, 2019); 2022-11-04
        return (this.side1 + this.side2 + this.side3) / 2;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        // (Source: "Project-Chapter11.doc", provided as part of coursework); 2022-11-04
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}