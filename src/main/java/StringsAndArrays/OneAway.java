package StringsAndArrays;

import java.util.HashMap;

public class OneAway {

  /**
   * Not sure if this catches every case lol This is STRICTLY checking for only 1 edit. Time
   * complexity O(n) where n is the longer string? Space complexity O(1)? Since no buffer needed.
   */
  public boolean chrisSolution(String s1, String s2) {
    if (s1.length() == s2.length()) {
      return checkEqualLength(s1, s2);
    } else if (s1.length() - s2.length() == 1) {
      return checkUnequalLength(s1, s2);
    } else if (s2.length() - s1.length() == 1) {
      return checkUnequalLength(s2, s1);
    }

    // If the above 3 cases don't pass that means more than 1 edit is definitely made.
    return false;
  }

  /**
   * If they 2 strings are same length and they are one edit away then only one character should be
   * different and this is done by replacement.
   */
  private boolean checkEqualLength(String s1, String s2) {
    int numberOfDifferentChars = 0;

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        numberOfDifferentChars++;
      }

      if (numberOfDifferentChars > 1) {
        return false;
      }
    }

    return true;
  }

  /**
   * If strings are unequal length by offset of 1 this means either insert or delete could have
   * happened. We have to check if the longer string has been DISPLACED by 1 character in respect to
   * the short string.
   */
  private boolean checkUnequalLength(String longStr, String shortStr) {
    int shortStrPointer = 0, longStrPointer = 0;
    int numberOfDifferentChars = 0;

    while (longStrPointer < longStr.length()) {
      if (longStr.charAt(longStrPointer) != shortStr.charAt(shortStrPointer)) {
        numberOfDifferentChars++;
        longStrPointer++;
      } else {
        longStrPointer++;
        shortStrPointer++;
      }

      if (numberOfDifferentChars > 1) {
        return false;
      }

      // To handle case where insertion is at the end.
      if (shortStrPointer == longStr.length() - 1) {
        return true;
      }
    }

    return true;
  }

  /*
  Diego Solution
   */
  boolean diegoSolution(String s1, String s2) {

    if (s1.equals(s2)) {
      return true;
    }

    char[] s1Chars = s1.toCharArray();
    int s1Length = s1Chars.length;
    char[] s2Chars = s2.toCharArray();
    int s2Length = s2Chars.length;

    if ((s2Length < s1Length && s2Length + 1 != s1Length)) {
      return false;
    }
    if ((s2Length > s1Length && s2Length - 1 != s1Length)) {
      return false;
    }

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
