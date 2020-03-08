package code.wars.java.ComplementaryDNA;

public class DnaStrandIntVersion {

    public static void main(String[] args) {
        System.out.println("Complemented version : " + makeComplement("ACCGTATGC"));
    }

    public static String makeComplement(String dna) {
        System.out.println("Original version : " + dna);
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }
        return new String(chars);
    }

    private static char getComplement(char c) {
        switch(c) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }
}
