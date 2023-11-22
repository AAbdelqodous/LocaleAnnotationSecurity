package q30;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        var inner = new TrafficSignal();

        var tf = inner.getClass().getAnnotation(TrafficLight.class);
        Stream.of( tf.value()).forEachOrdered(System.out::println);
    }
}
