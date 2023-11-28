package q74;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        var loc = new Locale("en", "US");
        var nf = NumberFormat.getCurrencyInstance(loc);
        System.out.printf("Amount %s is in %s", nf.format(10), nf.getCurrency());
    }
}
