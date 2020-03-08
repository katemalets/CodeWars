package code.wars.java.SeriesSum;

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n){
        double sum = 1.00;
        double three = 3.00;
        double one = 1.00;
        for (int i = 0; i < n; i++) {
            sum = sum + 1 / (three * i + one);
        }
        sum = sum - 1;
        sum = Math.round(sum * 100)/100.0d; //round for #.##
        String result = Double.toString(sum);
        return result;
    }
}
