import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		try (
        Scanner input = new Scanner(System.in)) {
            //prompt the user for input
            System.out.print("Enter an integer for seconds: ");
            int seconds = input.nextInt();
            int minutes = seconds / 60; //find minutes in seconds
            int remainingSeconds = seconds % 60; //seconds remaining *integers always round down*
            System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds"); //(user input) of seconds is (so many) minutes and (so many) seconds
        }

	}

}
