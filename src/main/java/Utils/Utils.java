package Utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        return stringBuilder.reverse().toString();
    }

    public static ArrayList<Character> stringToCharArrayList(String string) {
        ArrayList<Character> chars = new ArrayList<>();

        for (char ch: string.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }
}
