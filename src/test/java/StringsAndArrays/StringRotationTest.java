package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class StringRotationTest {
    StringRotation stringRotation = new StringRotation();

    @Test
    void validTest1() {
        assert (stringRotation.solution("waterbottle", "erbottlewat"));
    }

    @Test
    void invalidTest1() {
        assert (!stringRotation.solution("waterbottle", "xrbottlewat"));
    }
}
