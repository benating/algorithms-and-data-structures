package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class URLifyTest {

  @Test
  void testBasicStringWithSpaces() {
    assert (new URLify().solution(("Hello World  ").toCharArray(), 11)
        .equals("Hello%20World"));
  }

  @Test
  void testStandardStringWithSpaces() {
    assert (new URLify().solution(("Mr John Smith    ").toCharArray(), 13)
        .equals("Mr%20John%20Smith"));
  }

  @Test
  void testLongStringWithSpaces() {
    assert (new URLify().solution(("May the force be with you          ").toCharArray(), 25)
        .equals("May%20the%20force%20be%20with%20you"));
  }
}
