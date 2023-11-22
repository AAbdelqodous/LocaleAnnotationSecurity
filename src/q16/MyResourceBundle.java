package q16;

import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {
    /**
     * Returns an array in which each item is a pair of objects in an
     * {@code Object} array. The first element of each pair is
     * the key, which must be a {@code String}, and the second
     * element is the value associated with that key.  See the class
     * description for details.
     *
     * @return an array of an {@code Object} array representing a
     * key-value pair.
     */
    @Override
    protected Object[][] getContents() {
        Object [][] arr = {{"surprise", "SURPRISE!"}};
        return arr;
    }
}
