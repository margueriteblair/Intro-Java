package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("b", 10),
            new Movie("a", 15),
            new Movie("c", 20),
            new Movie("c", 30)

        );

        Optional<Integer> sum = movies.stream()
        .map(m -> m.getLikes())
        .reduce((a, b) -> a + b);

        System.out.println(sum.orElse(0));
    }




}