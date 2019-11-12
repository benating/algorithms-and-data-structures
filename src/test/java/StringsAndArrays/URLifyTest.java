package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class URLifyTest {

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
    assert (new URLify().solution("Mr John Smith", 13).equals("Mr%20John%20Smith"));
  }

  @Test
  void testCorrectSolution2() {
    assert (new URLify().solution("Mr John Smith     ", 13).equals("Mr%20John%20Smith"));
  }

  @Test
  void incorrectSolution() {
    assert (!new URLify().solution("Mr John Smith", 13).equals("Mr%20John%20Smith%20"));
  }

  @Test
  void incorrectSolution2() {
    assert (!new URLify().solution("Mr John Smith     ", 13).equals("Mr%20John%20Smith      "));
  }
}
