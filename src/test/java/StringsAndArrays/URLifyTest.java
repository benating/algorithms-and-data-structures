package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class URLifyTest {

    @Test
    void testCorrectSolution() {
        assert (new URLify().solution("Mr John Smith", 13).equals("Mr%20John%20Smith"));
    }

    @Test
    void testCorrectSolution2() {
        assert (new URLify().solution("Mr John Smith     ", 13).equals("Mr%20John%20Smith"));
    }

    @Test
    void incorrectSolution() {
        assert (!new URLify().solution("Mr John Smith", 13).equals("Mr%20John%20Smith%20"));
    }

    @Test
    void incorrectSolution2() {
        assert (!new URLify().solution("Mr John Smith     ", 13).equals("Mr%20John%20Smith      "));
    }
}
