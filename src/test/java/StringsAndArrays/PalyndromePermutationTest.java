package StringsAndArrays;

import org.junit.jupiter.api.Test;

import static StringsAndArrays.PalyndromePermutation.reverseString;

public class PalyndromePermutationTest {
    PalyndromePermutation palyndromePermutation = new PalyndromePermutation();
    @Test
    void validTest() {
        assert (palyndromePermutation.diegoSolution("Tact Coa"));
    }

    @Test
    void validTest2() {
        assert (palyndromePermutation.diegoSolution("Never odd or even"));
    }

    @Test
    void reverseStringTest() {
        assert (reverseString("cat").equals("tac"));
    }
}
