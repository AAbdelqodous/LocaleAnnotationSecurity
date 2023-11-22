package q14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        var prop = new Properties();
        var fis = new FileInputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\Message.properties");
        prop.load(fis);
        System.out.println(prop.get("key1"));
//        System.out.println(prop.get("key2", "Good Day!")); // gives an error
        System.out.println(prop.getProperty("key3", "Good Day!"));
        System.out.println(prop.getProperty("key4"));
    }
}
