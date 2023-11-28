package q87;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
        var date = LocalDateTime.of(2025, Month.JANUARY, 1, 10, 10);
        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter.format(date));
    }
}
