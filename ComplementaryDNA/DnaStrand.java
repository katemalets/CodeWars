package code.wars.java.ComplementaryDNA;

public class DnaStrand {
    public static void main(String[] args) {
        System.out.println("Complemented DNA : " + makeComplement("ACcCGTA"));
    }
    public static String makeComplement(String dna){
        String newDna = dna.toUpperCase();
        System.out.println("Original DNA : " + newDna);
        String result = newDna.replace("A","t").replace("T","a").replace("C","g").replace("G","c");
        return result.toUpperCase();
    }
}
