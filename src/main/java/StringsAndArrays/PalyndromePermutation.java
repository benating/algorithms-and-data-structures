package StringsAndArrays;

import java.util.HashSet;

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
}
