package q48;

import java.awt.Point;

public class Point3D extends Point implements Cloneable{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public final Point3D clone() {
        Point3D p = null;
        p = (Point3D)super.clone();
        return p;
    }
}
