package q78;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
        var nf = NumberFormat.getIntegerInstance();
        Stream.of(nf.parse("10.49"), nf.parse("10.50"), nf.parse("10.51"))
                .map(x -> "" + x)
                .forEachOrdered(System.out::print);

        System.out.println();
        System.out.println(nf.format(-1.5).equals(nf.format(-2.5)));

        System.out.println(Stream.of(nf.format(10.50), nf.format(11.50), nf.format(10.51))
                .mapToInt(x -> Integer.parseInt(x))
                .sum());
    }
}
