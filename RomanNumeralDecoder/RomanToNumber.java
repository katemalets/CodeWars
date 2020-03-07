package code.wars.java.RomanNumeralDecoder;

public class RomanToNumber {
    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public int romanToDecimal(String romanNumber) {
        int digitNumber = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int s1 = value(romanNumber.charAt(i));
            if (i + 1 < romanNumber.length()) {
                int s2 = value(romanNumber.charAt(i + 1));
                if (s1 >= s2) {
                    digitNumber += s1;
                } else {
                    digitNumber = digitNumber + s2 - s1;
                    i++;
                }
            } else {
                digitNumber += s1;
                i++;
            }
        }
        return digitNumber;
    }
}
