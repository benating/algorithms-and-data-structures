package StringsAndArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrixTest {

    private RotateMatrix rotateMatrix  = new RotateMatrix();

    Integer[][] exampleMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };

    Integer[][] exampleResponse = {
            {3,6,9},
            {2,5,8},
            {1,4,7}
    };

    @Test
    void validTest() {
        Object[] solution = rotateMatrix.solution(exampleMatrix);
        System.out.println(solution);

        assert (Arrays.deepEquals(solution, exampleResponse));
    }
}
