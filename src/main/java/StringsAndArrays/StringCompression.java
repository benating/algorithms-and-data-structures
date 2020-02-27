package StringsAndArrays;

public class StringCompression {

  /**
   * Time complexity O(n) where n length of string.
   * Space complexity O(n) string builder size grows as length of string grows?
   */
  public String chrisSolution(String string) {
    int count = 1;
    StringBuilder compressedStringBuilder = new StringBuilder();

    for (int i = 1; i < string.length(); i++) {
      if (string.charAt(i) != string.charAt(i - 1)) {
        compressedStringBuilder.append(string.charAt(i - 1));
        compressedStringBuilder.append(count);
        count = 1;
      } else {
        count++;
      }
    }

    compressedStringBuilder.append(string.charAt(string.length() - 1));
    compressedStringBuilder.append(count);

    String compressedString = compressedStringBuilder.toString();
    return compressedString.length() > string.length() ? string : compressedString;
  }


  String diegoSolution(String string) {
    String[] letters = string.split("");
    int length = letters.length;

    StringBuilder result = new StringBuilder();
    int totalLetters = 0;

    for (int i = 0; i < length; i++) {
      String current = letters[i];
      int counter = 1;
      for (int j = i + 1; j < length; j++) {
        String iteration = letters[j];
        if (current.equals(iteration)) {
          counter++;
        } else {
          i = j - 1;
          break;
        }
      }

      result.append(current);
      result.append(counter);
      totalLetters += counter;
      if (totalLetters >= length) {
        break;
      }
    }
    return result.toString();
  }


  String bernardSolution(String string) {
    String result = helper( null, 0, string);
    return result.length() < string.length() ? result : string;
  }

  String helper(Character curr, int count, String left) {
    if (left.isEmpty()) {
      return "" + curr + count;
    } else if (curr == null || curr == left.charAt(0)) {
      return helper(left.charAt(0), count+1, left.substring(1));
    } else {
      return "" + curr + count + helper(null, 0, left);
    }
  }
}
