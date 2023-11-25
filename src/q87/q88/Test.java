package q87.q88;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {
    public static void main(String[] args) {
        var date = LocalDateTime.of(2023, Month.NOVEMBER, 25, 13, 36);
        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(date));
    }
}
