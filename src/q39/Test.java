package q39;

public class Test {
    @SafeVarargs
    Test(String... strings){} // applied to variable arity constructor.
    public static void main(String[] args) {

    }
    /* @SafeVarargs
    public Test(String msg){} */ // applied to fixed arity constructor.

    /*@SafeVarargs
    public void greet(String... msg){}*/ //applied to variable arity method,
    // which is neither private nor static nor final.

    @SafeVarargs
    private void print(String... strings){} // applied to variable arity method, which is private.

    @SafeVarargs
    final Integer sum(Integer... integers){ // applied to variable arity method, which is final.
        return null;
    }
}
