package q29;

public class Tes {
    public static void main(String[] args) {
        var arr = Boat.class.getDeclaredAnnotationsByType(Speed.class);
        System.out.println(arr[0].value());
    }
}
