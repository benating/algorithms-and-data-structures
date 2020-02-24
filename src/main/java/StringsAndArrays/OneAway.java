package StringsAndArrays;

import Utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;

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
  boolean solution(String s1, String s2) {
    int s1Length = s1.length();
    int s2Length = s2.length();

    // should also perform checks to see if the strings lengths are in the valid "range"
    if (s1Length == s2Length) {
      return oneReplaceAway(s1, s2);
    } else if (s1Length > s2Length) {
      return oneInsertAway(s1, s2);
    } else if (s2Length > s1Length) {
      return oneInsertAway(s2, s1);
    }
    return false;
  }

  private boolean oneReplaceAway(String s1, String s2) {
    boolean difference = false;
    for (int i = 0; i < s1.length(); i++) {
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);
        if (c1 != c2) {
          if ( difference) return false;
          difference = true;
        };

    }
    return true;
  }

  private boolean oneInsertAway(String s1, String s2) {
    ArrayList<Character> s1Chars = Utils.stringToCharArrayList(s1);
    ArrayList<Character> s2Chars = Utils.stringToCharArrayList(s2);
    boolean difference = false;

    for (int i = 0; i < s2.length(); i++) {
      char c1 = s1Chars.get(i);
      char c2 = s2Chars.get(i);

      if (c1 != c2) {
        if (difference) return false;
        s1Chars.remove(i);
        i--;
        difference = true;
      }
    }
    return true;
  }
}
