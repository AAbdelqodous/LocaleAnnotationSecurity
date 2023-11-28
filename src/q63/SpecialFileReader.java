package q63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

public class SpecialFileReader {
    @SuppressWarnings({"deprecated", "removal"})
    public static final List<String> read() {
        final Path path = Path.of("C:", "test", "Test.java");
        PrivilegedAction<List<String>> pa = () -> {
            List<String> list = null;
            try {
                list =  Files.readAllLines(path);
            } catch(IOException ex) {
                System.out.println("IOException");
            }
            return list;
        };
        return AccessController.doPrivileged(pa, AccessController.getContext());
    }
}
