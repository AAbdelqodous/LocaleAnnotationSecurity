package q48;

public class Line {
    private Point3D p1;
    private Point3D p2;

    public Line(Point3D p1, Point3D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point3D getP1() {
        return p1;
    }

    public Point3D getP2() {
        return p2;
    }

    public String toString() {
        return String.format("(%d, %d, %d) to (%d, %d, %d)",
                p1.getX(), p1.getY(), p1.getZ(),
                p2.getX(), p2.getY(), p2.getZ());
    }
}
