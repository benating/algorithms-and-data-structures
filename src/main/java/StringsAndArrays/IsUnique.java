package StringsAndArrays;

import java.util.Hashtable;

public class IsUnique {

    public boolean solution(String input) {
        Hashtable<Character, Boolean> chars = new Hashtable<Character, Boolean>();

        if (input.length() == 0) return true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (chars.get(c) == null ) {
                chars.put(c, true);
            } else {
                return false;
            }

        }
        return true;
    }
}