package StringsAndArrays;

import java.util.Arrays;

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

  public void solution(char[] str, Integer trueLength) {
    int spaceCount = 0, index;

    for (int i = 0; i < trueLength; i++) {
      if(str[i] == ' ') spaceCount++;
    }

    index = trueLength + (spaceCount * 2);
    if (trueLength < str.length) str[trueLength] = '\0'; // end array

    for (int i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index = index - 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }
    System.out.println(str);
  }
}
