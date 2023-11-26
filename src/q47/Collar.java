package q47;

public class Collar {
    private String material; //Line n1
    private String color; //Line n2

    Collar(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final Collar copy() {
        return new Collar(this.material, this.color);
    }
}
