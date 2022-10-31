import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.8
public class CurrentTime {
/* A program that takes the current time in GMT and displays a different time
 * based on a value input by the user */// Use method 'System.currentTimeMillis()'
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Calculate the total number of milliseconds since 1/1/1970 as given by UNIX, store as long: totalMilliseconds
                // long totalMilliseconds = System.currentTimeMillis();
            long totalMilliseconds = System.currentTimeMillis();
            // Compute total and current seconds in current minute, store as long: totalseconds , currentSeconds
                // long totalSeconds = totalMilliseconds / 1000;
            long totalSeconds = totalMilliseconds / 1000;
                // long currentSeconds = totalSeconds % 60;
            long currentSeconds = totalSeconds % 60;
            // Compute total and current minutes in current hour, store as long: totalMinutes , currentMinutes
                // long totalMinutes = totalSeconds / 60;
            long totalMinutes = totalSeconds / 60;
                // long currentMinutes = totalMinutes % 60;
            long currentMinutes = totalMinutes % 60;
            // Compute total and current hours in current day, store as long: totalHours, currentHours
                // long totalHours = totalMinutes / 60;
            long totalHours = totalMinutes / 60;
                // long currentHours = totalHours % 24;
            long currentHours = totalHours % 24;
            // Prompt user for time-zone offset, store as int: zoneOffset
            System.out.print("Input the time-zone offset to GMT (ex. 3): ");
            int zoneOffset = input.nextInt();
            // Compute current time adjusted for user input, adjust currentHours
                // currentHours += zoneOffset;
            currentHours += zoneOffset;
            // display current time with time-zone offset
                // 'The current time is "()":"()":"()'
            System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
        }
    }
}