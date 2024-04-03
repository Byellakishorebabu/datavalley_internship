import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookReview {
    private String title;
    private int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {

    public static void main(String[] args) {
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview("Book1", 4));
        reviews.add(new BookReview("Book2", 8));
        reviews.add(new BookReview("Book3", 6));
        reviews.add(new BookReview("Book4", 2));
        reviews.add(new BookReview("Book5", 10));

        int[] ratingRanges = {1, 5, 6, 10};
        Map<String, Integer> rangeCounts = new HashMap<>();
        rangeCounts.put("1-5 stars", 0);
        rangeCounts.put("6-10 stars", 0);

        int positiveReviews = 0;
        int neutralReviews = 0;
        int negativeReviews = 0;

        for (BookReview review : reviews) {
            int rating = review.getRating();
            if (rating >= ratingRanges[0] && rating <= ratingRanges[1]) {
                rangeCounts.put("1-5 stars", rangeCounts.get("1-5 stars") + 1);
            } else if (rating >= ratingRanges[2] && rating <= ratingRanges[3]) {
                rangeCounts.put("6-10 stars", rangeCounts.get("6-10 stars") + 1);
            }

            if (rating >= 8) {
                positiveReviews++;
            } else if (rating >= 4) {
                neutralReviews++;
            } else {
                negativeReviews++;
            }
        }

        System.out.println("Books reviewed within specified rating ranges:");
        for (Map.Entry<String, Integer> entry : rangeCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nCounts of books with positive, neutral, and negative reviews:");
        System.out.println("Positive reviews: " + positiveReviews);
        System.out.println("Neutral reviews: " + neutralReviews);
        System.out.println("Negative reviews: " + negativeReviews);
    }
}
