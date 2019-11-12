package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class OneAwayTest {
    OneAway oneAway = new OneAway();

    @Test
    void validTest1() {
        assert (oneAway.solution("pale", "ple"));
    }

    @Test
    void validTest2() {
        assert (oneAway.solution("pales", "pale"));
    }

    @Test
    void validTest3() {
        assert (oneAway.solution("pale", "bale"));
    }

    @Test
    void invalidTest() {
        assert (!oneAway.solution("pale", "bake"));
    }
}
