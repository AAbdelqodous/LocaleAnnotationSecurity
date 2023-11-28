package q79;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
        var nf = NumberFormat.getPercentInstance(Locale.US);
        Stream.of(nf.parse("10%"), nf.parse("20%"), nf.parse("30%"))
                .map(x -> nf.format(x))
                .map(x -> x.substring(0, 2))
                .mapToInt(x -> Integer.parseInt(x))
                .average()
                .stream()
                .forEach(System.out::print);
    }
}
