package StringsAndArrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Describir que significa que 2 Strings sean permutaciones la una de la otra
// Hay una solucion que es en O(N Log N) y hay otra que es en O(N)
// Que caracteristicas tendria un String que es una permutacion de un palindromo?
// Dos Permutaciones tienen la misma longitud pero en diferente orden, haria alguna diferencia ordenarlos?

public class CheckPermutation {

    public boolean hashMapSolution(String s1, String s2) {
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L != s2L) return false;

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Map<Character, Integer> checker = new HashMap<>();

        for (int i = 0; i < s1L; i++) {
            char c1 = s1Chars[i];
            char c2 = s2Chars[i];
            insertCharToHashMap(checker, c1, 1);
            insertCharToHashMap(checker, c2, -1);
        }

        int sum = checker.values().stream().reduce(0, Integer::sum);
        return sum == 0;
    }

    void insertCharToHashMap(Map<Character, Integer> hashMap, char c, int value) {
        if (hashMap.containsKey(c)) {
            int newVal = hashMap.get(c) + value;
            hashMap.put(c, newVal);
        } else {
            hashMap.put(c, value);
        }
    }

    public boolean arraySolution(String s1, String s2) {
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L != s2L) return false;
        int[] checker = new int[128];

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        // we know that ASCII chars are from 0 to 127
        for (char s1Char : s1Chars) {
            checker[s1Char]++;
        }

        for (char s2Char : s2Chars) {
            checker[s2Char]--;
            if (checker[s2Char] < 0) return false;
        }
        return true;
    }

    public boolean sortingSolution(String s1, String s2) {
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L != s2L) return false;
        String s1Sorted = sortString(s1); // O(s1 log s1)
        String s2Sorted = sortString(s2); // O(s2 log s2)
        return s1Sorted.equals(s2Sorted);
    }

    // Runtime O(N log N)
    static String sortString(String string) {
        char temp[] = string.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}