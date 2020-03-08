package code.wars.java.Isograms;

import java.util.Arrays;

public class Isograms {
    public static void main(String[] args) {
        System.out.println("Is sting an isogram?\n" + isIsogram("AdfaaFGJ"));
    }
    public static boolean isIsogram(String string){
        String newString = string.toLowerCase();
        char[] elements = newString.toCharArray();
        Arrays.sort(elements);
        System.out.println(elements);
        for (int i = 1; i < newString.length(); i++) {
            if(elements[i] == elements[i - 1])
                return false;
        }
        return true;
    }
}
