import java.util.Arrays;

public class Hypothesis extends Dice {

    public static double actualAverage;

    public static void mean() {
        int[] a = Arrays.copyOf(middle(), middle().length);
        double avg;
        avg = 0;
        for (int i = 0; i < a.length; i++)
            avg += (double) a[i] / a.length;
        actualAverage = avg;
    }

    public static void checkDeviationPercentage() {
        mean();
        double expectedAverage = 3.5;
        double possibleDeviation = (expectedAverage * deviationPercentage) / 100;
        double min = actualAverage - possibleDeviation;
        double max = actualAverage + possibleDeviation;
        double actualDeviation = (expectedAverage - actualAverage) / (expectedAverage / 100);

        if (actualAverage >= min && actualAverage <= max) {
            assert true;
            System.out.println("Within acceptable deviation: " + actualAverage + " deviation: " + actualDeviation + "%");
        } else {
            System.out.println("Not within acceptable deviation: " + actualAverage + " deviation: " + actualDeviation + "%");
            assert false;
        }
    }
}






