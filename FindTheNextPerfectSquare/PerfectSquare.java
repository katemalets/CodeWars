package code.wars.java.FindTheNextPerfectSquare;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(169));
    }

    public static long findNextSquare(long sq) {
        long tmp = sq / 2;
        long result = -1;
        for (int i = 0; i < tmp; i++) {
            if (i * i == sq){
                result = (i + 1) * (i + 1);
            }
        }
        return result;
    }
}
