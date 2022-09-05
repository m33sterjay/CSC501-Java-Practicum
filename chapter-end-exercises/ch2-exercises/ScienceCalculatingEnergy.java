import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.10
public class ScienceCalculatingEnergy {
/** A program that computes energy needed to heat water based on input values and a given formula
 * User inputs:
    * Amount of water in kg
    * Initial and final temperatures of water 
 */// Formula to compute energy need: Q(energy) = M(mass) * C(specific heat capacity of water) * T(emp(change);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for amount of water in kg, store as double: waterInKilos
        System.out.print("Enter weight of water in kg (ex. 25.0): ");
        double waterInKilos = input.nextDouble();
        // Prompt user for initial and final water temperature, store as double: initialTemp , finalTemp
        System.out.print("Enter initial and final temperatures for water (ex. 35 65): ");
        double initialTemp = input.nextDouble();
        double finalTemp = input.nextDouble();
        // Compute energy needed for temperature change, store as double: energyNeeded
            // double energyNeeded = waterInKilos * (finalTemp - initialTemp) * 4184;
        double energyNeeded = waterInKilos * (finalTemp - initialTemp) * 4184;
        // Display results
            // "The energy needed is ()"
        System.out.println("The energy needed is " + energyNeeded + " J/kg");
    }
}