public class TestVoidMethod {
    public static void main(String[] args) {
        // display string "The grade is "
        System.out.print("The grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(59.5));
    }

    // when called and given a 'double' value, score - execute the following:
    public static char getGrade(double score) {
        if (score >= 90.0) {
            // return char 'A' if score is >= 90
            return 'A';
        } else if (score >= 80.0) {
            // return char 'B' if score is >= 80
            return 'B';
        } else if (score >= 70.0) {
            // return char 'C' if score is >= 70
            return 'C';
        } else if (score >= 60.0) {
            // return char 'D' if score is >= 60
            return 'D';
        } else {
            // return char 'F' if score is less than 60
            return 'F';
        }
    }// same program as before, but with a "value-returning method", instead of the
     // method executing the print method, the method here returns a value to 'main'
     // where the method call was part of the print method
}