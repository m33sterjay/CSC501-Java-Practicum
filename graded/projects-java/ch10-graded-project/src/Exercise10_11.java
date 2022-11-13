import org.jetbrains.annotations.NotNull;

/** __Adapted From__: `Project-Chapter10.doc`, provided as part of coursework; 2022-11-12
 * _Project-Chapter10_: The 'Circle2D' Class; 22FA-CSC501B-OL-14927 (Graduate Programming Practicum)
 * _Date_: 2022-11-12
 * _Author_: Jared Robbins
 * _NETID_: jlrob
 * _Description_: A program that tests the implementation of a 'Circle2D' class, with no user input.
 * Program compares relative positioning of specified instances of the 'Circle2D' class to determine if
 * an instance contains the origin (midpoint) of another, if an instance is contained within another instance
 * or if two instances overlap each other.
 * The program determines this with methods built in to Circle2D and then outputs the results. */
public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
class Circle2D {
    private double x = 0;
    private double y = 0;
    private double radius = 1;
    public Circle2D() {}
    public Circle2D(double newX, double newY, double newRadius) {
        this.x = newX;
        this.y = newY;
        this.radius = newRadius;
    }
    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getRadius() {return this.radius;}
    public double getArea() {return (radius * radius) * Math.PI;}
    public double getPerimeter() {return 2 * Math.PI * radius;}
    public boolean contains(double x, double y) {
        double distance = Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2);
        return Math.sqrt(distance) <= radius;
    }
    public boolean contains(@NotNull Circle2D circle) {
        double distance = Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2);
        if (Math.sqrt(distance) <= this.radius) {
            return circle.radius < this.radius - Math.sqrt(distance);
        } else return false;
    }
    public boolean overlaps(@NotNull Circle2D circle) {
        double distance = Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2);
        return distance > circle.radius + this.radius;
    }
}