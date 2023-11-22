package q38;

public class StringUtil {
    /**
     * @deprecated This method has been deprecated,
     * use rev(String) method instead
     */
    @Deprecated(since = "11", forRemoval = true)
    public static String reverse(String str) {
        return str.chars() //IntStream
                .mapToObj(c -> (char)c) //Convert int to char
                .reduce("", (s1,s2) -> s2+s1, (s1,s2) -> s2+s1);

    }

    public static String rev(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
