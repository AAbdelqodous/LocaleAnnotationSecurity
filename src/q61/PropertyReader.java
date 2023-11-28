package q61;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class PropertyReader {
    @SuppressWarnings({"deprecated", "removal"})
    public static String get(final String key){
        PrivilegedAction pa = () -> System.getProperty(key);
        return AccessController.doPrivileged(pa).toString();
    }
}
