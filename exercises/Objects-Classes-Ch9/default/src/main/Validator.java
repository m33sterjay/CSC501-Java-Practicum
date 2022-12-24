package main;
import java.util.regex.Pattern;

public class Validator {
    /*
     * The regex below matches against:
     * - a-z characters of the alphabet lower case
     * - A-Z characters of the alphabet upper case
     * - 0-9 numbers
     */
    private static final String regex = "^[a-zA-Z0-9]+$";

    /** A Valid name is:
     * - between 6 and 12 characters long
     * - Alphanumeric: letters and numbers only
     *
     * @param name
     *            Username to be validated against
     * @return Whether username is valid or not */
    public static boolean validateUserName(String name) {
        if (name == null)
            return false;
        if (name.length() < 6 || name.length() > 12)
            return false;
        // initializes the regex pattern, gives it the username, and returns true or false if they match
        return Pattern.compile(regex).matcher(name).matches();
    }
    /** Prepare test inputs to the code (if any are required).
     * Call the code (unit) to be tested.
     * Verify what it does (behavior) and the result it returns. */

    /** If Arrays or List indexes are involved, test the smallest and largest allowable indexes to catch ArrayIndexOutOfBoundsException.
     * If there is any possibility that a reference type (non-primitive type) may be null, test for it.
     * If large numbers and mathematics are involved, consider testing around the maximum size of Java’s primitives number types. */
}

/** To make a useful generalization, the key to making your code testable is to separate it into two kinds of software entities such as
 * classes or methods.
 * 
 * The first is what I will call a “Doer.” The job of a doer is to talk to some platform or 3rd party library/framework code and hide it
 * from the rest of the application code.
 * 
 * Doers should have basic methods such as setColor(...), showMessage(...), or saveData(...) and may report success or failure if
 * appropriate. They should contain as little logic as possible, for reasons that will become clear in a moment. */

 /** The second kind is what I like to call a "Decision Maker." Decision makers are broadly meant to accomplish two tasks:
  * 
  * Encapsulate (contain) the various kinds of logical instructions which you will come across in most kinds of applications.
  * Coordinate the flow of data and events to and between one or more doers (explained soon).
  * 
  * Perhaps more importantly is what they must not do:
  * 
  * They must try not to contain dependencies to platform APIs or 3rd party libraries/frameworks.
  * They must not make (instantiate) the doers that they depend on.
  * Optionally, they should not know or depend on concrete class names. */