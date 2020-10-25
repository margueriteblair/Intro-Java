package streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        var countLikedMovies = movies.stream()
        .filter(movie -> movie.getLikes() > 15)
        .count();

        System.out.println(countLikedMovies);
    
    }




}