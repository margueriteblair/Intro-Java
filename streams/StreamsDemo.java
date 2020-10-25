package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        movies.stream()
        .map(movie -> movie.getTitle()) //map is good for changing each var without ending the stream
        .forEach(name -> System.out.println(name));

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream.flatMap(list -> list.stream())
        .forEach(n -> System.out.println(n));
        //flattened a stream of objects
    }




}