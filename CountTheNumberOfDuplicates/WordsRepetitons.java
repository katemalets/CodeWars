package code.wars.java.CountTheNumberOfDuplicates;

import java.util.Arrays;

public class WordsRepetitons {
    public static void main(String[] args) {
        int count = 1;
        String text = "Я, я очень люблю. Я очень люблю тостер, но ещё больше люблю тепло!";
        String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        Arrays.sort(words);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                do {
                    count++;
                    i++;
                } while(i < words.length && words[i].equals(words[i - 1]));
            }
            System.out.println("Слово \"" + words[i - 1] + "\" встречается в тексте: " + count + " раз.");
            count = 1;
        }
    }
}
