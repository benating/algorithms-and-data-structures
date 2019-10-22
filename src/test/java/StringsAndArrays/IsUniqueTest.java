package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    @Test
    void testEmptyString() {
        String input = "";
        assert (new IsUnique().solution(input) == true);
    }

    @Test
    void testBasicNonUnique() {
        String input = "aab";
        assert (new IsUnique().solution(input) == false);
    }

    @Test
    void testBasicUnique() {
        String input = "abc";
        assert (new IsUnique().solution(input) == true);
    }

    @Test
    void testLongNonUniqueString() {
        String input = "qwertyuiopasdfghjklzxcvbnmm";
        assert (new IsUnique().solution(input) == false);
    }

    @Test
    void testLongUniqueString() {
        String input = "qwertyuiopasdfghjklzxcvbnm";
        assert (new IsUnique().solution(input) == true);
    }
}