package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class PalyndromePermutationTest {
    PalyndromePermutation palyndromePermutation = new PalyndromePermutation();

    @Test
    void sortedOddLength() {
        String s = "ABA";
        assert (palyndromePermutation.solution(s));
    }

    @Test
    void sortedOddLengthNotPalyndrome() {
        String s = "ABC";
        assert (!palyndromePermutation.solution(s));
    }

    @Test
    void sortedOddLength2() {
        String s = "AABAA";
        assert (palyndromePermutation.solution(s));
    }

    @Test
    void sortedEvenLength() {
        String s = "AABBAA";
        assert (palyndromePermutation.solution(s));
    }

    @Test
    void sortedString() {
        String s = "Taco cat";
        assert (palyndromePermutation.solution(s));
    }

    @Test
    void notSortedString() {
        String s = "Tact Coa";
        assert (palyndromePermutation.solution(s));
    }
}
