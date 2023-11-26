package q50;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        var list = Arrays.asList(
                LocalDate.of(2023, Month.DECEMBER, 25),
                LocalDate.of(2024, Month.JANUARY, 26)
        );
    }
}
