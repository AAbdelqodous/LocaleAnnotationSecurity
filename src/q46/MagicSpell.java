package q46;

import java.util.Random;

public class MagicSpell {
    private final String [] spells = {"ACCIO", "LUMOS", "ALOHOMORA"}; //Line n2

    public MagicSpell() {} //Line n3

    public void cast() { //Line n4
        System.out.println(spells[new Random().nextInt(3)]);
    }
}
