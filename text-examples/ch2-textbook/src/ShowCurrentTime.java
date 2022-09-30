
public class ShowCurrentTime {

	public static void main(String[] args) {
        //obtaion total milliseconds since UNIX epoch = Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        //find total number of seconds
        long totalSeconds = totalMilliseconds / 1000; //1000 milliseconds per second
        //find the current number of seconds in the minute
        long currentSeconds = totalSeconds % 60; //because integers round down in java, so we find the remainder to know how many seconds over the last full minute we are
        //find total number of minutes
        long totalMinutes = totalSeconds / 60;
        //find the current number of minutes in the hour
        long currentMinutes = totalMinutes % 60; //integers round down, remainder tells minutes over last full hour
        //find total number of hours
        long totalHours = totalMinutes / 60;
        //find the current hour in the day
        long currentHour = totalHours % 24; //same concept as minutes and hours
        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT");

	}

}
