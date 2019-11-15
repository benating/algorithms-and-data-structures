package StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ZeroMatrixTest {
    ZeroMatrix zeroMatrix = new ZeroMatrix();

    @Test
    void validTest1() {
        Integer[][] exampleMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,0},
        };

        Integer[][] exampleResponse = {
                {1,2,0},
                {4,5,0},
                {0,0,0},
        };

        Integer[][] solution = zeroMatrix.solution(exampleMatrix);

        for (Integer[]e : solution) {
            System.out.println(Arrays.toString(e));
        }

        assert (Arrays.deepEquals(solution, exampleResponse));
    }

    @Test
    void validTest2() {
        Integer[][] exampleMatrix = {
                {1,2,3, 10},
                {4,5,6},
                {7,8,0, 9},
        };

        Integer[][] exampleResponse = {
                {1,2,0, 10},
                {4,5,0},
                {0,0,0, 0},
        };

        Integer[][] solution = zeroMatrix.solution(exampleMatrix);

        for (Integer[]e : solution) {
            System.out.println(Arrays.toString(e));
        }

        assert (Arrays.deepEquals(solution, exampleResponse));
    }

}
