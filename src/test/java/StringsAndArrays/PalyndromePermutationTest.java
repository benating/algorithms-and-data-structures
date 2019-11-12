package StringsAndArrays;

import org.junit.jupiter.api.Test;

import static StringsAndArrays.PalyndromePermutation.reverseString;

public class PalyndromePermutationTest {
    PalyndromePermutation palyndromePermutation = new PalyndromePermutation();
    String validString = "Tact Coa";
    @Test
    void validTest() {
        assert (palyndromePermutation.diegoSolution(validString));
    }

    @Test
    void validTest2() {
        assert (palyndromePermutation.diegoSolution("Never odd or even"));
    }

    @Test
    void reverseStringTest() {
        assert (reverseString("cat").equals("tac"));
    }

    /*
     * Chris's test cases start
     * */
    @Test
    void testValidStringWithSpaces1() {
        assert (palyndromePermutation.solutionChris(validString));
    }

    @Test
    void testValidStringWithSpaces2() {
        assert (palyndromePermutation.solutionChris("RT O or"));
    }

    @Test
    void testValidStringWithSpaces3() {
        assert (palyndromePermutation.solutionChris("Mr Owl ate my metal worm"));
    }

    @Test
    void testValidString2() {
        assert (palyndromePermutation.solutionChris("aabb"));
    }

    @Test
    void testValidString3() {
        assert (palyndromePermutation.solutionChris("kakay"));
    }

    @Test
    void testInvalidString() {
        assert (!palyndromePermutation.solutionChris("abc DEF"));
    }

    @Test
    void testInvalidString2() {
        assert (!palyndromePermutation.solutionChris("You misspelled Palindrome mate"));
    }
    /*
     * Chris's test cases end
     * */
}
