package StringsAndArrays;

import java.util.*;

public class ZeroMatrix {
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

    HashMap<String, ArrayList>getZeroCoordinates (Integer[][] matrix) {
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
