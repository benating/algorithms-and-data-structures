package StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ZeroMatrixTest {

  ZeroMatrix zeroMatrix = new ZeroMatrix();

  @Test
  void validTest1() {
    Integer[][] exampleMatrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 0},
    };

    Integer[][] exampleMatrixCopy = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 0},
    };

    Integer[][] exampleResponse = {
        {1, 2, 0},
        {4, 5, 0},
        {0, 0, 0},
    };

    Integer[][] solution = zeroMatrix.solution(exampleMatrix);
    Integer[][] chrisSolution = zeroMatrix.chrisSolution(exampleMatrixCopy);

    for (Integer[] e : chrisSolution) {
      System.out.println(Arrays.toString(e));
    }
    assert (Arrays.deepEquals(solution, exampleResponse));
    assert (Arrays.deepEquals(chrisSolution, exampleResponse));
  }

  @Test
  void validTest2() {
    Integer[][] exampleMatrix = {
        {0, 2, 3},
        {4, 5, 6},
        {7, 8, 0},
    };

    Integer[][] exampleMatrixCopy = {
        {0, 2, 3},
        {4, 5, 6},
        {7, 8, 0},
    };

    Integer[][] exampleResponse = {
        {0, 0, 0},
        {0, 5, 0},
        {0, 0, 0},
    };

    Integer[][] solution = zeroMatrix.solution(exampleMatrix);
    Integer[][] chrisSolution = zeroMatrix.chrisSolution(exampleMatrixCopy);

    for (Integer[] e : solution) {
      System.out.println(Arrays.toString(e));
    }

    assert (Arrays.deepEquals(solution, exampleResponse));
    assert (Arrays.deepEquals(chrisSolution, exampleResponse));
  }

  @Test
  void validTest3() {
    Integer[][] exampleMatrix = {
        {1, 2, 0, 10},
        {4, 5, 6},
        {7, 8, 0, 9},
    };

    Integer[][] exampleMatrixCopy = {
        {1, 2, 0, 10},
        {4, 5, 6},
        {7, 8, 0, 9},
    };
    for (Integer[] x : exampleMatrix) {
      System.out.println(Arrays.toString(x));
    }
    System.out.println("----------");

    Integer[][] exampleResponse = {
        {0, 0, 0, 0},
        {4, 5, 0},
        {0, 0, 0, 0},
    };

    Integer[][] solution = zeroMatrix.solution(exampleMatrix);
    Integer[][] chrisSolution = zeroMatrix.chrisSolution(exampleMatrixCopy);

    for (Integer[] e : solution) {
      System.out.println(Arrays.toString(e));
    }

    assert (Arrays.deepEquals(solution, exampleResponse));
    assert (Arrays.deepEquals(chrisSolution, exampleResponse));
  }

  @Test
  void validTest4() {
    Integer[][] exampleMatrix = {
        {1, 2, 3},
        {0, 5, 6},
        {7, 8, 0},
        {1, 0, 1},
    };

    Integer[][] exampleMatrixCopy = {
        {1, 2, 3},
        {0, 5, 6},
        {7, 8, 0},
        {1, 0, 1},
    };
    for (Integer[] x : exampleMatrix) {
      System.out.println(Arrays.toString(x));
    }
    System.out.println("----------");

    Integer[][] exampleResponse = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},
    };

    Integer[][] solution = zeroMatrix.solution(exampleMatrix);
    Integer[][] chrisSolution = zeroMatrix.chrisSolution(exampleMatrixCopy);

    for (Integer[] e : solution) {
      System.out.println(Arrays.toString(e));
    }

    assert (Arrays.deepEquals(solution, exampleResponse));
    assert (Arrays.deepEquals(chrisSolution, exampleResponse));
  }

}
