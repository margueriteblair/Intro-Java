package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        //you can create a stream from an array
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
        .forEach(n -> System.out.println(n));

        Stream.of(1, 2, 3, 4);
        var streeeam = Stream.generate(() -> Math.random());
        streeeam
        .limit(7)
        .forEach(n -> System.out.println(n));
    }
}