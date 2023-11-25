package q82;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        var date = LocalDate.of(1987, 9, 1);
        var str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }
}
