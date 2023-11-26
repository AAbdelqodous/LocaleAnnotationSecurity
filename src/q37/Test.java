package q37;
//Line n3
public class Test {
    //Line n4
    @SuppressWarnings({"deprecation"}) //SuppressWarnings annotation has one 'value' attribute of String [] type,
    // and it doesn't provide any default value.
    public static void main(String[] args) {
        System.out.println(Util.add(10));
        System.out.println(Util.add(10, 20));
        System.out.println(Util.add(10, 20, 30));
    }
}
