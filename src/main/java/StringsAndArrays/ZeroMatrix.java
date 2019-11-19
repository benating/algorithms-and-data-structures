package StringsAndArrays;

import java.util.*;

public class ZeroMatrix {

  // O(N^2) time complexity, where N = size of col or row which ever is bigger.
  // O(MN) space complexity, where M = size of row and N = size of col.
  public Integer[][] chrisSolution(Integer[][] matrix) {
    Integer[][] copy = matrix;
    List<Integer[]> zeroPoints = new ArrayList<>();

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row][col] == 0) {
          zeroPoints.add(new Integer[]{row, col});
        }
      }
    }

    for (Integer[] point : zeroPoints) {
      makeRowAndColZero(matrix, point[0], point[1]);
    }

    return copy;
  }

  private void makeRowAndColZero(Integer[][] matrix, int row, int col) {
    for (int i = 0; i < matrix[row].length; i++) {
      matrix[row][i] = 0;
    }

    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }

    return;
  }

  public Integer[][] solution(Integer[][] matrix) {

    HashMap<String, ArrayList> cordinates = getZeroCoordinates(matrix);
    ArrayList<Integer> rows = cordinates.get("rows");
    ArrayList<Integer> columns = cordinates.get("columns");
//        System.out.println("rows " + rows);
//        System.out.println("columns " + columns);

    for (int i = 0; i < matrix.length; i++) {
      Integer[] currentRow = matrix[i];
      if (rows.contains(i)) {
        Integer[] newRow = new Integer[currentRow.length];
        Arrays.fill(newRow, 0);
        matrix[i] = newRow;
      } else {
        columns.forEach(x -> {
          currentRow[x] = 0;
        });
      }
    }

    return matrix;
  }

  HashMap<String, ArrayList> getZeroCoordinates(Integer[][] matrix) {
    HashMap<String, ArrayList> coordinates = new HashMap<>();
    ArrayList rows = new ArrayList<Integer>();
    ArrayList columns = new ArrayList<Integer>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        Integer current = matrix[i][j];
        if (current == 0) {
          rows.add(i);
          columns.add(j);
        }
      }
    }

    coordinates.put("rows", rows);
    coordinates.put("columns", columns);
    return coordinates;
  }
}
