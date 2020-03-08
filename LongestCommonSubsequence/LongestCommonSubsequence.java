package code.wars.java.LongestCommonSubsequence;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(longestSubsequence("anothertest", "notatest"));
    }

    public static String longestSubsequence(String firstString, String secondString) {
        String result = "";
        for (int i = 0; i < Math.max(firstString.length(),secondString.length()); i++) {
            for (int j = 0; j < Math.min(firstString.length(),secondString.length()); j++) {
                if (firstString.charAt(i) == secondString.charAt(j)){
                    result += firstString.charAt(i);
                }
            }
        }
        return result;
    }
}
