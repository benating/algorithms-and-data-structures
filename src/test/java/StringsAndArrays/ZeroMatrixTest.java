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
                {0,2,3},
                {4,5,6},
                {7,8,0},
        };

        Integer[][] exampleResponse = {
                {0,0,0},
                {0,5,0},
                {0,0,0},
        };

        Integer[][] solution = zeroMatrix.solution(exampleMatrix);

        for (Integer[]e : solution) {
            System.out.println(Arrays.toString(e));
        }

        assert (Arrays.deepEquals(solution, exampleResponse));
    }

    @Test
    void validTest3() {
        Integer[][] exampleMatrix = {
                {1,2,0, 10},
                {4,5,6},
                {7,8,0, 9},
        };
        for (Integer[] x: exampleMatrix) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("----------");

        Integer[][] exampleResponse = {
                {0,0,0, 0},
                {4,5,0},
                {0,0,0, 0},
        };

        Integer[][] solution = zeroMatrix.solution(exampleMatrix);

        for (Integer[]e : solution) {
            System.out.println(Arrays.toString(e));
        }

        assert (Arrays.deepEquals(solution, exampleResponse));
    }

    @Test
    void validTest4() {
        Integer[][] exampleMatrix = {
                {1,2,3, 10},
                {0,5,6},
                {7,8,0, 9},
        };
        for (Integer[] x: exampleMatrix) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("----------");

        Integer[][] exampleResponse = {
                {0,2,0, 10},
                {0,0,0},
                {0,0,0, 0},
        };

        Integer[][] solution = zeroMatrix.solution(exampleMatrix);

        for (Integer[]e : solution) {
            System.out.println(Arrays.toString(e));
        }

        assert (Arrays.deepEquals(solution, exampleResponse));
    }

}
