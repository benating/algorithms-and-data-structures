package StringsAndArrays;
import java.util.HashMap;

public class CheckPermutation {
    public boolean solution (String s1, String s2) {
        if (s1.length() == 0) return true;
        if (s2.length() == 0) return false;
        HashMap chars = new HashMap<Character, Boolean>();
        for (int i = 0; i < s2.length() ; i++) {
            char x = s2.charAt(i);
            chars.put(x, true);
        }
        for (int i = 0; i < s1.length(); i++) {
            char current = s1.charAt(i);
            if (chars.get(current) != null) {
                chars.replace(current, false);
            }
        }
        return true;
    }
}
