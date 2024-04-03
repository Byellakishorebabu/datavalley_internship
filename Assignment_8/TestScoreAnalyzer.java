import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestScoreAnalyzer {

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(75);
        scores.add(85);
        scores.add(90);
        scores.add(60);
        scores.add(70);

        double average = calculateAverage(scores);
        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;

        for (int score : scores) {
            if (score > average) {
                aboveAverage++;
            } else if (score == average) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

        System.out.println("Number of students who scored above the average: " + aboveAverage);
        System.out.println("Number of students who scored at the average: " + atAverage);
        System.out.println("Number of students who scored below the average: " + belowAverage);

        Collections.sort(scores);
        double median;
        if (scores.size() % 2 == 0) {
            median = (scores.get(scores.size() / 2 - 1) + scores.get(scores.size() / 2)) / 2.0;
        } else {
            median = scores.get(scores.size() / 2);
        }

        System.out.println("Median score: " + median);
    }

    private static double calculateAverage(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }
}
