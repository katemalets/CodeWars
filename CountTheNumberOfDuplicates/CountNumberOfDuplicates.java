package code.wars.java.CountTheNumberOfDuplicates;

public class CountNumberOfDuplicates {
    public static void main(String[] args) {
        String string = "abcda";
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char firstElement = string.charAt(i);
            System.out.print(firstElement + " ");
            for (int j = 1; j < string.length(); j++) {
                char secondElement = string.charAt(j);
               // String.valueOf(firstElement).compareToIgnoreCase(String.valueOf(secondElement));
                if(Character.toLowerCase(firstElement) == Character.toLowerCase(secondElement)){
                    counter++;
                }
            }
        }
        System.out.println("\nThe number of repetitions : " + counter);
    }
}
