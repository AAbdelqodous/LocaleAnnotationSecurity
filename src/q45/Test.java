package q45;

public class Test {
    public static void main(String[] args) {
        System.out.println(divide(5.0f, 2.0f));
        System.out.println(divide(1.0f, 0.0f));
        System.out.println(divide(0.0f, 0.0f));
    }

    public static int divide (float f1, float f2) {
        float res = f1 / f2;
        if(Float.isInfinite(res)) {
            throw new ArithmeticException("INFINITE");
        }
        if(Float.isNaN(res)) {
            throw new ArithmeticException("NaN");
        }
        return (int)res;
    }
}
