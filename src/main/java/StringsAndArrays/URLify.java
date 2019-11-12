package StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class URLify {

  public String solutionChris(char[] input, int trueLength) {
    int inputLength = input.length;

    // Replacing characters IN PLACE, O(n) run time complexity
    while (trueLength > 0) {
      if (input[trueLength - 1] == ' ') {
        input[inputLength - 1] = '0';
        input[inputLength - 2] = '2';
        input[inputLength - 3] = '%';
        inputLength -= 3;
      } else {
        input[inputLength - 1] = input[trueLength - 1];
        inputLength--;
      }
      trueLength--;
    }

    System.out.println(String.valueOf(input));
    return String.valueOf(input);
  }

  public String solution(String string, Integer length) {

    String[] split = string.split(" ");
    ArrayList<String> withUrl = Arrays.stream(split).map(word -> word.concat("%20"))
        .collect(Collectors.toCollection(ArrayList::new));
    withUrl.set(split.length - 1, split[split.length - 1]);

    StringBuilder result = new StringBuilder();
    withUrl.forEach(result::append);

    return result.toString();
  }
}
