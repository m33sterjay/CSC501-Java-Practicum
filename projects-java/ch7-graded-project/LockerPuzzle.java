/** LockerPuzzle */
public class LockerPuzzle {

    public static void main(String[] args) {
        // initialize array of lockers, boolean[] lockers = new boolean[100]
        boolean[] lockers = new boolean[100];
        // all lockers begin in 'closed' state, java.util.Arrays.fill(lockers, false)
        java.util.Arrays.fill(lockers, false);
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
