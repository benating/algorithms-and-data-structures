package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {
    StringCompression stringCompression = new StringCompression();

    String valid = "aabcccccaaa";
    String validAnswer = "a2b1c5a3";

    @Test
    void validTest0() {
        assert (stringCompression.diegoSolution(valid).equals(validAnswer));
        assert (stringCompression.chrisSolution(valid).equals(validAnswer));
    }

    @Test
    void validTest1() {
        assert (stringCompression.diegoSolution("aaaaaabbbbbbbcccccccabc").equals("a6b7c7a1b1c1"));
        assert (stringCompression.chrisSolution("aaaaaabbbbbbbcccccccabc").equals("a6b7c7a1b1c1"));
    }

    @Test
    void validTest2() {
        assert (stringCompression.diegoSolution("abc").equals("a1b1c1"));
        assert (stringCompression.chrisSolution("abc").equals("abc"));
    }

    @Test
    void validTest3() {
        assert (stringCompression.diegoSolution("a").equals("a1"));
        assert (stringCompression.chrisSolution("a").equals("a"));
    }
}
