package code.wars.java.RomanNumeralDecoder;

public class Solution {

    public void findSolution(String romanDate){
        int digitalDate = 0;
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        System.out.println(romanDate);
        for (int i = 0; i < romanDate.length(); i++) {
            char element = romanDate.charAt(i);
            if (element == 'I'){
                digitalDate += I;
            }
            if (element == 'V'){
                digitalDate += V;
            }
            if (element == 'X'){
                digitalDate += X;
            }
            if (element == 'L'){
                digitalDate += L;
            }
            if (element == 'C'){
                digitalDate += C;
            }
            if (element == 'D'){
                digitalDate += D;
            }
            if (element == 'M'){
                digitalDate += M;
            }
        }
        System.out.println(digitalDate);
    }
}
