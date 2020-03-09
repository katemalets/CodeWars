package code.wars.java.PerimeterOfSquares;

import java.math.BigInteger;

public class PerimetrOfSquares {
    public static void main(String[] args) {
        System.out.println(perimeter(7));
    }

    public static int perimeter(int n) {
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            //1 + 1 + 2 + 3 + 5 + 8
            tmp += (i - 1) * i;
        }
        return tmp * (n - 1);
    }
}
