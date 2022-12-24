package main;

/** QuadraticEquations:
 * ax^2 + bx + c = 0 */
public class QuadraticEquations {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public QuadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double discriminant = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return discriminant;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            double root1 = (-b + Math.sqrt(this.getDiscriminant())) / (2 * a); // (+) positive
            return root1;
        } else
            return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            double root2 = (-b - Math.sqrt(this.getDiscriminant())) / (2 * a); // (-) negative
            return root2;
        } else
            return 0;
    }
}