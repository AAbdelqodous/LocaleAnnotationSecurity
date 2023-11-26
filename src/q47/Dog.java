package q47;

public class Dog {
    private String name;
    private Collar collar;

    Dog(String name, Collar collar) {
        this.name = name;
        this.collar = collar; //Line n3
//        this.collar = collar.copy();
    }

    public String getName() {
        return name;
    }

    public Collar getCollar() {
        return collar; //Line n4
//        return collar.copy();
    }

    public String toString() {
        return "Dog[" + name + ", Collar{" + collar.getMaterial() + ", " + collar.getColor() + "}]";
    }
}
