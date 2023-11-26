package q48;

public class Test {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(0, 0, 0); //Line n1
        Point3D p2 = new Point3D(1, 1, 1); //Line n2

        Line line = new Line(p1, p2); //Line n3
        System.out.println(line); //Line X

//        p1.setX(10); //Line n4
        System.out.println(line); //Line Y

//        line.getP2().setX(-10); //Line n5
        System.out.println(line); //Line Z
    }
}
