package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    CheckPermutation checkPermutation = new CheckPermutation();
    String valid1 = "ABC";
    String valid2 = "CBA";
    String invalid2 = "ABZ";

    // Test Sorting solution first
    @Test
    void sortingSolutionCorrect() {
        assert(checkPermutation.sortingSolution(valid1, valid2));
    }

    @Test
    void sortingSolutionIncorrect() {
        assert(!checkPermutation.sortingSolution(valid1, invalid2));
    }

    // Array Solution tests
    @Test
    void arraySolutionCorrect() {
        assert(checkPermutation.arraySolution(valid1, valid2));
    }

    @Test
    void arraySolutionIncorrect() {
        assert(!checkPermutation.arraySolution(valid1, invalid2));
    }

    // HashMap
    @Test
    void hashMapCorrectSolution() {
        assert(checkPermutation.hashMapSolution(valid1, valid2));
    }

    @Test
    void hashMapIncorrectSolution() {
        assert(checkPermutation.hashMapSolution(valid1, invalid2));
    }
}
