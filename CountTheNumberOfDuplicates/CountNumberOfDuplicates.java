package code.wars.java.CountTheNumberOfDuplicates;

public class CountNumberOfDuplicates {
    public static void main(String[] args) {
        String string = "ILoooveyou";
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char firstElement = string.charAt(i);
            System.out.print(firstElement + " ");
            for (int j = 0; j < string.length(); j++) {
                char secondElement = string.charAt(j);
               // if (String.valueOf(firstElement).compareToIgnoreCase(String.valueOf(secondElement))){
                //    counter++;
                //}
            }
        }
        System.out.println("\nThe number of repetitions : " + counter);
    }
}
