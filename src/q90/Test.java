package q90;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
        var dateFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu"); //Line n1
        System.out.println(dateFormatter.parse("10-5-2019")); //Line n2
        var currFormatter = NumberFormat.getCurrencyInstance(Locale.US); //Line n3
        System.out.println(currFormatter.parse("$7.00")); //Line n4
    }
}
