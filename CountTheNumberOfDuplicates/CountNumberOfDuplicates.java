package code.wars.java.CountTheNumberOfDuplicates;

import java.util.Arrays;

public class CountNumberOfDuplicates {
    public static void main(String[] args) {
        String string = "abaccbcada";
        char[] elements = string.toCharArray();
        Arrays.sort(elements);
        System.out.println(elements);
        int counter = 0;
        for (int i = 1; i < string.length(); i++) {
            if (elements[i] == elements[i - 1]){
                counter++;
            }
        }
        System.out.println("\nThe number of repetitions : " + counter);
    }
}
/*
for (int i = 0; i < string.length(); i++) {
            char firstElement = string.charAt(i);
            for (int j = 1; j < string.length(); j++) {
                char secondElement = string.charAt(j);
               // String.valueOf(firstElement).compareToIgnoreCase(String.valueOf(secondElement));
                if(Character.toLowerCase(firstElement) == Character.toLowerCase(secondElement)){
                    counter++;
                }
            }
        }
 */
