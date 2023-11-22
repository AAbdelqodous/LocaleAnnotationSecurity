package q27;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Writer {
    String name() default "Cristie";
    int value() default 10;
}
