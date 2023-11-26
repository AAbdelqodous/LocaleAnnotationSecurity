package q47;

public class Test {
    public static void main(String[] args) {
        Collar collar = new Collar("Leather", "Brown"); //Line n5
        Dog d1 = new Dog("Hunter", collar);
        String s1 = d1.toString();
        System.out.println("s1: " +s1);
        collar.setColor("Blue"); //Line n6
        String s2 = d1.toString();
        System.out.println("s2: " +s2);
        d1.getCollar().setColor("Red"); //Line n7
        String s3 = d1.toString();
        System.out.println("s3: " +s3);
        System.out.println(s1.equals(s2) + ":" + s2.equals(s3));
    }
}
