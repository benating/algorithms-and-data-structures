package StringsAndArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PalyndromePermutation {

  public boolean solution(String input) {
    // todo: check if is a palyndrome
    // todo: re-arrange string in many possible ways checking if it can be a palyndrome
    return false;
  }

  public boolean solutionChris(String input) {
    /*
     * The hard rule for a string to be a permutation of a palindrome
     * is that the characters in the string must be balanced.
     * There are two cases to consider:
     * 1. Strings with EVEN length (Then there are no stray characters i.e the string is fully balanced)
     * 2. Strings with ODD length (Then there should be exactly one stray character)
     * Runtime complexity O(n)
     * */
    HashSet<Character> characterLookup = new HashSet();
    int inputLength = input.length();

    for (char character : input.toCharArray()) {
      char lowercase = Character.toLowerCase(character);

      // Contains is an O(1) operation
      if (characterLookup.contains(lowercase)) {
        characterLookup.remove(lowercase); // Remove from Hashset is an O(1) operation
      } else if (lowercase == ' ') {
        // Ignore white spaces, this means the 'actual' length should also be updated
        inputLength -= 1;
      } else {
        characterLookup.add(lowercase);
      }
    }

    return inputLength % 2 == 0 ? characterLookup.size() == 0 : characterLookup.size() == 1;
  }

    public boolean diegoSolution(String input) {

        String tightString = input.replace(" ", "").toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        PalyndromePermutation.diegoPermute(tightString, 0, tightString.length() - 1, list);
        List<String> filtered = list.stream().filter(PalyndromePermutation::diegoSsPalindrome).distinct().collect(Collectors.toList());
//        filtered.forEach(x -> System.out.println(x));
        return filtered.size() > 0;
    }

    public static boolean diegoSsPalindrome(String input) {
        String tightString = input.replace(" ", "").toLowerCase();
        int length = tightString.length();
        boolean isEven = length % 2 == 0;
        if (isEven) {
            int middle = tightString.length() / 2;
            String firstHalf = tightString.substring(0, middle - 1);
            String secondHalf = tightString.substring(middle + 1, length);
            String secondReversed = reverseString(secondHalf);
            return firstHalf.equals(secondReversed);
        }
        int middle = length / 2;
        String firstHalf = tightString.substring(0, middle);
        String secondHalf = tightString.substring(middle + 1, length);
        String secondReversed = reverseString(secondHalf);
        return firstHalf.equals(secondReversed);
    }

    public static void diegoPermute(String s, int l, int r, ArrayList<String> list) {
        if (l == r) {
            list.add(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = diegoSwapChars(s, l, r);
                diegoPermute(s, l + 1, r, list);
                s = diegoSwapChars(s, l, i);
            }
        }
    };

    public static String diegoSwapChars(String string, int i, int j) {
        char[] chars = string.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
