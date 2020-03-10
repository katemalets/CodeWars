package code.wars.java.PerimeterOfSquares;

import java.math.BigInteger;

public class PerimetrOfSquares {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(30)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int newN = n.intValue();
        int firstElement = 1;
        int secondElement = 1;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < newN; i++) {
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
            result += firstElement;
        }
        BigInteger res = BigInteger.valueOf((result + 1) * 4);
        return res;
    }
}
