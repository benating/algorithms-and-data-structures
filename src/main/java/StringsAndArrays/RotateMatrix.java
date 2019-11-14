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
}
