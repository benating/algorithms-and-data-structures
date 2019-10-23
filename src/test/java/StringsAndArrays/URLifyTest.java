package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class URLifyTest {

  @Test
  void testBasicStringWithSpaces() {
    assert (new URLify().solution("Hello World  ", 11)
        .equals("Hello%20World"));
  }

  @Test
  void testStandardStringWithSpaces() {
    assert (new URLify().solution("Mr John Smith    ", 13)
        .equals("Mr%20John%20Smith"));
  }
}
