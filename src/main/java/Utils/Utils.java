package Utils;

public class Utils {
    public static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        return stringBuilder.reverse().toString();
    }
}
