package q31;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(ChessRules.class)
public @interface ChessRule {
    String name() default "Pawn";
    String[] moves();
}
