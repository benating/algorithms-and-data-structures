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
            {7,4,1},
            {8,2,6},
            {9,6,3}
    };

    @Test
    void validTest() {
        Integer[][] solution = rotateMatrix.solutionChris(exampleMatrix);
        printMatrix(solution);

        assert (Arrays.deepEquals(solution, exampleResponse));
    }
    
    private void printMatrix(Object[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }
}
