package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("b", 10),
            new Movie("a", 15),
            new Movie("c", 20),
            new Movie("c", 30)

        );

        var result = movies.stream()
        .anyMatch(m -> m.getLikes() > 20);

        var result2 = movies.stream()
        .allMatch(m -> m.getLikes() > 20);
        //returns a boolean if the condition is met or not

       

    }




}