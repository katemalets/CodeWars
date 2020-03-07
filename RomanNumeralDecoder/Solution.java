package code.wars.java.RomanNumeralDecoder;

public class Solution {

    public void findSolution(String romanDate){
        int digitalDate = 0;
        String I = "1";
        String V = "5";
        String X = "10";
        String L = "50";
        String C = "100";
        String D = "500";
        String M = "1000";
        System.out.println(romanDate);
        String[] element;
        if (romanDate.matches("I")){
            digitalDate += 1;
        }
        System.out.println(digitalDate);
    }
}
