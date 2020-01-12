package StringsAndArrays;
import java.util.ArrayList;

public class RotateMatrix {
    /*
    If we assume all the elements in the matrix are the same length
     */
    Integer[][] solution(Integer[][] matrix) {
        int length = matrix[0].length;
        ArrayList<Integer[]> holder = new ArrayList<>();
        for (int i = length; i > 0; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j < length + 1; j++) {
                int n = matrix[j - 1][i - 1];
                list.add(n);
            }
            holder.add(list.toArray(new Integer[list.size()]));
        }
        Integer[][] converted = holder.toArray(new Integer[length][length]);
        return converted;
    }

    Integer[][] solutionChris(Integer[][] matrix) {
        int length = matrix.length;

        for (int row = 0; row < length / 2; row++) {
            for (int col = row; col < length - row - 1; col++) {
                // length - row - 1 is the row offset, this is fixed in the inner loop.
                int rowOffset = length - row - 1;
                // length - col - 1 is the col offset, this is the changing variable in the inner loop.
                int colOffset = length - col - 1;

                // Store top in temp
                int temp = matrix[row][col];
                // left to top
                matrix[row][col] = matrix[colOffset][row];
                // btm to left
                matrix[colOffset][row] = matrix[rowOffset][colOffset];
                // right to btm
                matrix[rowOffset][colOffset] = matrix[col][rowOffset];
                // top to right
                matrix[col][colOffset] = temp;

                // Debugging code
                // System.out.println("top: " + matrix[row][col]);
                // System.out.println("right: " + matrix[col][rowOffset]);
                // System.out.println("btm: " + matrix[rowOffset][colOffset]);
                // System.out.println("left: " + matrix[colOffset][row]);
            }
        }

        return matrix;
    }
}
