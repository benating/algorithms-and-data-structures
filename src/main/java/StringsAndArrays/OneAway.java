package StringsAndArrays;

import java.util.HashMap;

public class OneAway {


    /*
    Diego Solution
     */
    boolean diegoSolution(String s1, String s2) {

        if (s1.equals(s2)) return true;

        char[] s1Chars = s1.toCharArray();
        int s1Length = s1Chars.length;
        char[] s2Chars = s2.toCharArray();
        int s2Length = s2Chars.length;

        if ((s2Length < s1Length && s2Length +1 != s1Length)) return false;
        if ((s2Length > s1Length && s2Length -1 != s1Length)) return false;

        HashMap<Character, Integer> letters = diegoGenerateLettersMap(s1Chars);

        // reduce the counter of each letter based
        for (int i = 0; i < s2Length; i++) {
            char current = s2Chars[i];
            if (letters.get(current) == null) {
                letters.put(current, 0);
            } else {
                int value = letters.get(current);
                letters.put(current, value - 1);
            }
        }

        // gets the count of how many different letters
        Integer difference = letters.values().stream().reduce(Integer::sum).get();
        return difference < 2 && difference > -2;
    }

    HashMap<Character, Integer> diegoGenerateLettersMap(char[] chars) {
        HashMap<Character, Integer> letters = new HashMap();

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (letters.get(current) == null) {
                letters.put(current, 1);
            } else {
                int value = letters.get(current);
                letters.put(current, value + 1);
            }
        }
        return letters;
    }
}
