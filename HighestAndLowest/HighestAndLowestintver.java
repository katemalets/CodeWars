package code.wars.java.HighestAndLowest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class HighestAndLowestintver {
    public static void main(String[] args) {
        System.out.println(HighAndLow("56 9 -6 4 6 2 78"));
    }

    public static String HighAndLow(String numbers) {
        IntSummaryStatistics summary = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
        return String.format("%d %d", summary.getMax(), summary.getMin());
    }
}
