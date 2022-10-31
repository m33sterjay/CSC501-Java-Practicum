public class TestVoidMethod {
    public static void main(String[] args) {
        // display string "The grade is "
        System.out.print("The grade is ");
        // call method printGrade, with an input of 78.5
        printGrade(78.5);
        // display "The grade is "
        System.out.print("The grade is ");
        // call method printGrade, with an input of 59.5
        printGrade(59.5);
    }
    // when called and given a 'double' value, score - execute the following:
    public static void printGrade(double score) {
        
        if (score >= 90.0) {
            //display char 'A' if score is >= 90
            System.out.println('A');
        } else if (score >= 80.0) {
            // display char 'B' if score is >= 80
            System.out.println('B');
        } else if (score >= 70.0) {
            // display char 'C' if score is >= 70
            System.out.println('C');
        } else if (score >= 60.0) {
            // display char 'D' if score is >= 60
            System.out.println('D');
        } else {
            // display char 'F' if score is less than 60
            System.out.println('F');
        }
    }// since this method is "void", it doesn't 'return' a value, it just performs an action
}
