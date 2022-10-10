package src;

/** Ch7 graded project, CS501 - Jared Robbins - Locker Puzzle
 * A program that does not receive any user input, instead, it seeks to solve a given puzzle and output the correct answer.
 * PARAMETERS:
 * - A school has 100 lockers and 100 students
 * - All of the lockers begin closed on the first day of school
 * - Each student enters the school one by one
 * - The first student opens all the lockers
 * - The second student, beginning with the 2nd locker, closes every other locker
 * - The third student, beginning with the 3rd locker, 'changes' every 3rd locker
 * (if it was open, it's now closed && vice versa)
 * - The fourth student, beginning with the 4th locker, 'changes' every 4th locker
 * - The fifth student, beginning with 5th locker, 'changes' every 5th locker
 * - This pattern continues until the last student, student 100, changes the 100th locker
 * SOLVE:
 * - After all the students have passed through the building and iterated upon the lockers, answer:
 * ?? Which lockers are open ??
 * OUTPUT:
 * The program outputs a list of the lockers that are open, giving the locker 'number' and the 'state'
 * ex. Locker ( # ) is open */
public class Exercise07_23 {

    public static void main(String[] args) {
        // initialize array of lockers, boolean[] lockers = new boolean[100]
        boolean[] lockers = new boolean[100];
        // all lockers begin in 'closed' state, java.util.Arrays.fill(lockers, false)
        java.util.Arrays.fill(lockers, false);
        // send [lockers] to enterStudents() to have students iterate upon the lockers
        // send value of [lockers] to openLockers() to find the locker numbers of the open lockers
        openLockers(enterStudents(lockers));
    }

    public static boolean[] enterStudents(boolean[] lockers) {
        // all students enter the building and iterate upon lockers once
        for (int studentNumber = 1; studentNumber <= lockers.length; studentNumber++) {
            // loop through all lockers for every student
            for (int lockerNumber = studentNumber; lockerNumber <= lockers.length; lockerNumber += studentNumber) {
                // if locker state is true, change to false, otherwise change to true
                lockers[lockerNumber - 1] = (lockers[lockerNumber - 1] == true)
                        ? false
                        : true; // System.out.print(lockers[lockerNumber - 1] + " ");
            }
        } // System.out.println(java.util.Arrays.toString(lockers)); // tested first 5 values, they are what they should be
        // return [lockers] with updated values 
        return lockers;
    }

    public static void openLockers(boolean[] lockers) {
        // search through lockers
        for (int i = 0; i < lockers.length; i++) {
            // look for lockers with a value of 'true'
            final boolean key = lockers[i] == true;
            if (key) {
                // if the locker is 'open' display the locker number
                System.out.println("Locker " + i + " is open");
            }
        }
    }
}