package StringsAndArrays;

public class URLify {

  public String solution(char[] input, int trueLength) {
    int inputLength = input.length;

    // Replacing characters in place
    while (trueLength > 0){
      if(input[trueLength - 1] == ' ') {
        input[inputLength - 1] = '0';
        input[inputLength - 2] = '2';
        input[inputLength - 3] = '%';
        inputLength-=3;
      } else {
        input[inputLength - 1] = input[trueLength - 1];
        inputLength--;
      }
      trueLength--;
    }

    System.out.println(String.valueOf(input));
    return String.valueOf(input);
  }
}
