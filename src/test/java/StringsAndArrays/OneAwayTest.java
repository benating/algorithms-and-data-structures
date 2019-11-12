package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class OneAwayTest {
    OneAway oneAway = new OneAway();

    @Test
    void validTest0() {
        assert (oneAway.diegoSolution("pale", "pale"));
    }

    @Test
    void validTest1() {
        assert (oneAway.diegoSolution("pale", "ple"));
    }

    @Test
    void validTest2() {
        assert (oneAway.diegoSolution("pales", "pale"));
    }

    @Test
    void validTest3() {
        assert (oneAway.diegoSolution("pale", "bale"));
    }

    @Test
    void invalidTest0() {
        assert (!oneAway.diegoSolution("pale", "bake"));
    }

    @Test
    void invalidTest1() {
        assert (!oneAway.diegoSolution("pale", "long string"));
    }

    @Test
    void invalidTest2() {
        assert (!oneAway.diegoSolution("pale", "xy"));
    }

    @Test
    void invalidTest3() {
        assert (!oneAway.diegoSolution("pale", "bal"));
    }

    @Test
    void invalidTest4() {
        assert (!oneAway.diegoSolution("pale", "paleee"));
    }
}
