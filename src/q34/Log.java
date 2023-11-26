package q34;

@FunctionalInterface
public interface Log {
    void log(String s);
    @Deprecated(since = "9", forRemoval = false)
    default void print(String s){
        System.out.println(s);
    }
}
