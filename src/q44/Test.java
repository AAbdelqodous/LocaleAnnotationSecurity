package q44;

public class Test {
    public static void main(String[] args) {
        for(int i = 10; i <= Integer.MAX_VALUE ; i = Math.multiplyExact(i, 10)){ // i = i * 10) {
            System.out.println(i);
        }
    }
}
