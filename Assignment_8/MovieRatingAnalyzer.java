import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movie {
    private String title;
    private String rating;
    private double ratingScore;

    public Movie(String title, String rating, double ratingScore) {
        this.title = title;
        this.rating = rating;
        this.ratingScore = ratingScore;
    }

    public String getRating() {
        return rating;
    }

    public double getRatingScore() {
        return ratingScore;
    }
}

public class MovieRatingsAnalyzer {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie1", "PG", 3.5));
        movies.add(new Movie("Movie2", "PG-13", 4.2));
        movies.add(new Movie("Movie3", "R", 3.9));
        movies.add(new Movie("Movie4", "PG", 4.5));
        movies.add(new Movie("Movie5", "PG-13", 3.8));

        Map<String, Integer> categoryCounts = new HashMap<>();
        Map<String, Double> categoryTotalRatings = new HashMap<>();

        for (Movie movie : movies) {
            String rating = movie.getRating();
            double ratingScore = movie.getRatingScore();

            categoryCounts.put(rating, categoryCounts.getOrDefault(rating, 0) + 1);
            categoryTotalRatings.put(rating, categoryTotalRatings.getOrDefault(rating, 0.0) + ratingScore);
        }

        System.out.println("Category Counts:");
        for (Map.Entry<String, Integer> entry : categoryCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nAverage Ratings:");
        for (Map.Entry<String, Double> entry : categoryTotalRatings.entrySet()) {
            String category = entry.getKey();
            int count = categoryCounts.get(category);
            double totalRating = entry.getValue();
            double averageRating = totalRating / count;
            System.out.println(category + ": " + averageRating);
        }
    }
}
