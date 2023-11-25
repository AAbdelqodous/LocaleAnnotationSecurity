package q87;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
        var nf = NumberFormat.getIntegerInstance();
        Stream.of(nf.parse("10.49"), nf.parse("10.50"), nf.parse("10.51"))
                .map(x -> "" + x)
                .forEachOrdered(System.out::print);
    }
}
