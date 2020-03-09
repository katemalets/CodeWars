package code.wars.java.CreditCardMask;

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }

    public static String maskify(String string) {
        String fourNums = "";
        String nums = "";
        String[] numbers = string.split("",string.length() - 3);
        for (String number : numbers) {
            if (number.length() == 4){
                fourNums = number;
            } else {
                nums = nums + number;
            }
        }
        return string.replaceAll(".","#") + fourNums;
    }
}
