package code.wars.java.ConvertStringToCamelCase;

public class StringConverting {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth_warrior"));
    }

    public static String toCamelCase(String string){
        string = string.replaceAll("-"," ").replaceAll("_"," ");
        return string;
    }
}
