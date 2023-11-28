package q65;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

public class Attacker {
    private final List<Integer> attackCoordinates = new ArrayList<>(List.of(100, 276, 190));
    @SuppressWarnings({"deprecated", "removal"})
    public final List<Integer> getCoord() {
        PrivilegedAction<List<Integer>> pa = () -> {
            /*Do some processing and update attack co-ordinates. */
            return attackCoordinates;
        };

        return AccessController.doPrivileged(pa);
    }
}
