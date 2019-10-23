package StringsAndArrays;

public class URLify {

  public String solution(String input, int trueLength) {
    int inputLength = input.length();
    StringBuilder outputBuilder = new StringBuilder(input);

    while (trueLength > 0){
      if(input.charAt(trueLength - 1) == ' ') {
        outputBuilder.setCharAt(inputLength - 1, '0');
        outputBuilder.setCharAt(inputLength - 2, '2');
        outputBuilder.setCharAt(inputLength - 3,'%');
        inputLength-=3;
      } else {
        outputBuilder.setCharAt(inputLength - 1, input.charAt(trueLength - 1));
        inputLength--;
      }
      trueLength--;
    }

    System.out.println(outputBuilder.toString());
    return outputBuilder.toString();
  }
}
