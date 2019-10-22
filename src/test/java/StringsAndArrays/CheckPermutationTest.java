package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    @Test
    void testEmptyString() {
        assert (new CheckPermutation().solution("", "") );
    }

    @Test
    void testPermutationCorrect() {
        String s1 = "taco";
        String s2 = "cat";
        assert(new CheckPermutation().solution(s1, s2));
    }

    @Test
    void testPermutationInCorrect() {
        String s1 = "taco";
        String s2 = "";
        assert(!new CheckPermutation().solution(s1, s2));
    }

    @Test
    void testReallyLongPermutation() {
        String s1 = "asdfhsfjkshfkjshfjwquiyerwqiuyrwiuqyriwqriowqyrioweqyrdoggoasljdfhsalfjslahklashfjs";
        String s2 = "doggo";
        assert(new CheckPermutation().solution(s1, s2));
    }
}
