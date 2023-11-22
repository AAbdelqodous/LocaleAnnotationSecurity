package q16;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault( new Locale("fr", "IT"));
        System.out.println(Locale.getDefault());
        var loc = new Locale("en", "US"); //new Locale("en", "CA");
        System.out.println(loc);
        var rb = ResourceBundle.getBundle("q16.MyResourceBundle", loc);
        System.out.println(rb.getObject("surprise"));
    }
}
