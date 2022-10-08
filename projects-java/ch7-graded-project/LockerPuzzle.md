    public static void enterStudents(boolean[] lockers) {
        // loop, studentNumber = 1 , studentNumber <= lockers.length , studentNumber++
        for (int studentNumber = 1; studentNumber < lockers.length; studentNumber++) {
            // loop, lockerNumber = studentNumber , lockerNumber <= lockers.length , lockerNumber += studentNumber
            for (int lockerNumber = studentNumber; lockerNumber < lockers.length; lockerNumber += studentNumber) {
                // (lockers[lockerNumber] == true) ? lockers[lockerNumber] = false : lockers[lockerNumber] = true;
                if (lockers[lockerNumber] == true) {
                    lockers[lockerNumber] = false;
                } else {
                    lockers[lockerNumber] = true;
                }
            }
        }
        //System.out.prinln(java.util.Arrays.toString(lockers));
        //return lockers;
    }


    public class LockerPuzzle {
    public static void main(String[] args) {
        // initialize array of lockers, boolean[] lockers = new boolean[100]
        boolean[] lockers = new boolean[100];
        // all lockers begin in 'closed' state, java.util.Arrays.fill(lockers, false)
        java.util.Arrays.fill(lockers, false);
        System.out.println(java.util.Arrays.toString(lockers));
        
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }