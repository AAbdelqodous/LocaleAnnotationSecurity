package q81;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        var df1 = new DecimalFormat("###,##,#");
        var df2 = new DecimalFormat("000,00,0");
        System.out.println(df1.format(87654));
        System.out.println(df2.format(87654));
        System.out.println(df1.format(87654).equals(df2.format(87654)));
        System.out.println(df1.format(1));
        System.out.println(df2.format(1));
        System.out.println(df1.format(1).equals(df2.format(1)));
        System.out.println(df1.format(1234567));
        System.out.println(df2.format(1234567));
        System.out.println(df1.format(1234567).equals(df2.format(1234567)));
        System.out.println(df1.format(123456));
        System.out.println(df2.format(123456));
        System.out.println(df1.format(123456).equals(df2.format(123456)));
    }
}
