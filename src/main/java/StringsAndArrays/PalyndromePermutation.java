package StringsAndArrays;
import static Utils.Utils.reverseString;

/*
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
that is the same forwards and backwards. A permutation is a rearrangement of letters.The palindrome does not need to
be limited to just dictionary words.

Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)
 */

public class PalyndromePermutation {
    boolean isPalyndrome = false;

    public boolean solution(String string) {
        String flattened = string.replace(" ", "").toLowerCase();
        isPalyndrome = false;
        generatePermutations(flattened, "");
        return isPalyndrome;
//        return checkPalyndrome(flattened);
    }

    public void generatePermutations(String string, String ans) {
        int length = string.length();
        if (length == 0) {
            if (checkPalyndrome(ans)) {
                isPalyndrome = true;
            }
            // System.out.println(ans + ""); <- prints all permutations
            return;
        }
        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            String ros = string.substring(0, i) + string.substring(i + 1);
            generatePermutations(ros, ans + c);
        }
    }

    public boolean checkPalyndrome(String string) {
        int length = string.length();
        boolean isEvenLength = length % 2 == 0;
        String firstHalf = string.substring(0, length / 2);
        if (isEvenLength) {
            String secondHalf = string.substring((length / 2), length);
            secondHalf = reverseString(secondHalf);
            return firstHalf.equals(secondHalf);
        } else {
            String secondHalf = string.substring((length / 2) + 1, length);
            secondHalf = reverseString(secondHalf);
            return firstHalf.equals(secondHalf);
        }
    }
}