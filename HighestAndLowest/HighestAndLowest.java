package code.wars.java.HighestAndLowest;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        String[] number = numbers.split(" ");
        int tmpmin = 0;
        for(String element : number) {
            int i = Integer.parseInt(element);
            tmpmin = i;
        }
        int tmpmax = 0;
        for(String element : number) {
            int i = Integer.parseInt(element);
            tmpmax = i;
        }
        int tmp;
        for(String element : number){
            int i = Integer.parseInt(element);
            if (i > tmpmax){
                tmp = i;
                i = tmpmax;
                tmpmax = tmp;
            }
            if (i < tmpmin){
                tmp = i;
                i = tmpmin;
                tmpmin = tmp;
            }
        }
        String maximum = Integer.toString(tmpmax);
        String minimum = Integer.toString(tmpmin);
        return maximum + " " + minimum;
    }
}
