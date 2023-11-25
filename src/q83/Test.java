package q83;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 11, 4);
        var formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        System.out.println(formatter.format(date).equals(date.format(formatter)));
        System.out.println(formatter.format(date));
        System.out.println(date.format(formatter));
    }
}
