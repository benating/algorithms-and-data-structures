package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class PalyndromePermutationTest {
    String validString = "Tact Coa";
    PalyndromePermutation palyndromePermutation = new PalyndromePermutation();
    @Test
    void validTest() {
        assert (palyndromePermutation.solution(validString));
    }

    @Test
    void invalidTest() {
        assert (palyndromePermutation.solution("abc DEF"));
    }
}
