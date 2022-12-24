package main;

import java.util.Scanner;

public class runQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Value for a: ");
        double inputA = input.nextDouble();
        System.out.print("Value for b: ");
        double inputB = input.nextDouble();
        System.out.print("Value for c: ");
        double inputC = input.nextDouble();
        input.close();

        QuadraticEquations solution = new QuadraticEquations(inputA, inputB, inputC);
        if (solution.getDiscriminant() >= 0) {
            solution.getRoot1();
            solution.getRoot2();
            if (solution.getRoot1() != 0 && solution.getRoot2() != 0) {
                System.out.printf("Root 1: %f", solution.getRoot1());
                System.out.printf("Root 2: %f", solution.getRoot2());
            }
        } else if (solution.getDiscriminant() == 0) {
            if (solution.getRoot1() != 0) {
                System.out.printf("Root 1: %f", solution.getRoot1());
            } else if (solution.getRoot2() != 0) {
                System.out.printf("Root 2: %f", solution.getRoot2());
            } else
                ;
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
