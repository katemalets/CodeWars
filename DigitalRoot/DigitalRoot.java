package code.wars.java.DigitalRoot;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println("The result : " + digitalRoot(36296));
    }

    public static int digitalRoot(int yourNumber){
        int sum = 0;
        while (yourNumber > 0 || sum > 9) {
            if (yourNumber == 0) {
                yourNumber = sum;
                sum = 0;
            }
            sum += yourNumber % 10;
            yourNumber /= 10;
        }
        return sum;
    }
}