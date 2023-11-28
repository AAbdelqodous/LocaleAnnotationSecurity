package q89;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        var date = LocalDate.now();
        System.out.println("Date: " +date);
        var time = LocalTime.now();
        System.out.println("time: " +time);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println("dateTime: " +dateTime);
        var zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " +zonedDateTime);
//        System.out.println(date.format(DateTimeFormatter.ofPattern("'It''s' dd-mm-yyyy")));
//        System.out.println(time.format(DateTimeFormatter.ofPattern("'It''s' dd-mm-yyyy")));
//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("'It's' dd-mm-yyyy")));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("'It''s' dd-mm-yyyy")));
    }
}
