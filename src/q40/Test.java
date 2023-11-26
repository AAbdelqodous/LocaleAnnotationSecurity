package q40;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(combine(List.of(1, 2), List.of(3, 4)));
    }

    @SafeVarargs
    private static List<Integer> combine(List<Integer>... list) {
        return Arrays.stream(list)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
