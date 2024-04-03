import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RestaurantRating {
    private String name;
    private double rating;

    public RestaurantRating(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}

public class RestaurantRatingAnalyzer {

    public static void main(String[] args) {
        List<RestaurantRating> ratings = new ArrayList<>();
        ratings.add(new RestaurantRating("Restaurant1", 4.5));
        ratings.add(new RestaurantRating("Restaurant2", 8.2));
        ratings.add(new RestaurantRating("Restaurant3", 6.7));
        ratings.add(new RestaurantRating("Restaurant4", 3.9));
        ratings.add(new RestaurantRating("Restaurant5", 9.8));

        int[] ratingRanges = {1, 5, 6, 10};
        Map<String, Integer> rangeCounts = new HashMap<>();
        Map<String, Double> rangeTotalRatings = new HashMap<>();

        rangeCounts.put("1-5", 0);
        rangeCounts.put("6-10", 0);

        rangeTotalRatings.put("1-5", 0.0);
        rangeTotalRatings.put("6-10", 0.0);

        for (RestaurantRating rating : ratings) {
            double r = rating.getRating();
            if (r >= ratingRanges[0] && r <= ratingRanges[1]) {
                rangeCounts.put("1-5", rangeCounts.get("1-5") + 1);
                rangeTotalRatings.put("1-5", rangeTotalRatings.get("1-5") + r);
            } else if (r >= ratingRanges[2] && r <= ratingRanges[3]) {
                rangeCounts.put("6-10", rangeCounts.get("6-10") + 1);
                rangeTotalRatings.put("6-10", rangeTotalRatings.get("6-10") + r);
            }
        }

        System.out.println("Number of restaurants rated within specific ranges:");
        for (Map.Entry<String, Integer> entry : rangeCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nAverage rating for each range:");
        for (Map.Entry<String, Double> entry : rangeTotalRatings.entrySet()) {
            String range = entry.getKey();
            double totalRating = entry.getValue();
            int count = rangeCounts.get(range);
            double averageRating = count == 0 ? 0 : totalRating / count;
            System.out.println(range + ": " + averageRating);
        }
    }
}
