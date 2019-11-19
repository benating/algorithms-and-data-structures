package StringsAndArrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringRotationTest {
    StringRotation stringRotation = new StringRotation();

    @Test
    void validTest1() {
        String input = "waterbottle";

        for (String rotatedString : generateStringRotations(input)) {
            System.out.println(String.format("Testing string: %s", rotatedString));

            assert (stringRotation.solution(input, rotatedString));
            assert (stringRotation.chrisSolution(input, rotatedString));
            assert (stringRotation.chrisSolution(input, rotatedString));
        }
    }

    @Test
    void invalidTest1() {
        assert (!stringRotation.solution("waterbottle", "xrbottlewat"));
        assert (!stringRotation.chrisSolution("waterbottle", "xrbottlewat"));
        assert (!stringRotation.chrisSolution2("waterbottle", "xrbottlewat"));
    }

    private List<String> generateStringRotations(String s1) {
        List<String> rotations = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            String left = s1.substring(0, i + 1);
            String right = s1.substring(i + 1);
            String rotatedString = right + left;
            rotations.add(rotatedString);
        }

        return rotations;
    }
}
