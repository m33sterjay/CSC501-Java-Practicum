import java.time.Instant;
import java.time.LocalDate;

public class MyDate {
    private int year = LocalDate.now().getYear();
    private int month = LocalDate.now().getMonthValue();
    private int day = LocalDate.now().getDayOfMonth();

    // constructors
    public MyDate() {}
    public MyDate(double milliseconds) {
        Instant.now().toEpochMilli()
    }


}
