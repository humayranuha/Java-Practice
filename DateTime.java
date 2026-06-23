import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = myDateTime.format(formatted);

        System.out.println("Date: " + myDate);
        System.out.println("Time: " + myTime);
        System.out.println("Date and Time: " + myDateTime);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}