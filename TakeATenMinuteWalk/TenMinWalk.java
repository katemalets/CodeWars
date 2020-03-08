package code.wars.java.TakeATenMinuteWalk;

public class TenMinWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','k','n','s','n','s','n','s','n','s'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {
        int result = walk.length;
        if (result != 10){
            return false;
        }
        for (int i = 1; i < result; i++) {
            if (walk[i] == walk[i - 1]){
                return false;
            }
        }
        return true;
    }
}
