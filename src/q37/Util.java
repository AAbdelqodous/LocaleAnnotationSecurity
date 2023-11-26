package q37;
//Line n1
public class Util {
    /**
     * @deprecated This method has been deprecated,
     * use add(int...) method instead
     */
    @Deprecated(since = "10")
    //Line n2
    public static int add (int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int... nums) {
        var sum = 0;
        for(int i : nums)
            sum += i;
        return sum;
    }
}