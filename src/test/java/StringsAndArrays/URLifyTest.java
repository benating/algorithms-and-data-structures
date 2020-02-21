package StringsAndArrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class URLifyTest {
  URLify urlIfy = new URLify();
  /*
   * Chris's test cases start
   * */
  @Test
  void testBasicStringWithSpaces() {
    assert (new URLify().solutionChris(("Hello World  ").toCharArray(), 11)
        .equals("Hello%20World"));
  }

  @Test
  void testStandardStringWithSpaces() {
    assert (new URLify().solutionChris(("Mr John Smith    ").toCharArray(), 13)
        .equals("Mr%20John%20Smith"));
  }

  @Test
  void testLongStringWithSpaces() {
    assert (new URLify().solutionChris(("May the force be with you          ").toCharArray(), 25)
        .equals("May%20the%20force%20be%20with%20you"));
  }
  /*
   * Chris's test cases end
   * */

  @Test
  void testCorrectSolution() {
    char[] test = "Mr John Smith    ".toCharArray();
    urlIfy.solution(test, 13);
    String output = new String(test);

    assertEquals("Mr%20John%20Smith", output);
  }
}
