package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class PalyndromePermutationTest {

  String validString = "Tact Coa";
  PalyndromePermutation palyndromePermutation = new PalyndromePermutation();

  /*
   * Chris's test cases start
   * */
  @Test
  void testValidStringWithSpaces1() {
    assert (palyndromePermutation.solutionChris(validString));
  }

  @Test
  void testValidStringWithSpaces2() {
    assert (palyndromePermutation.solutionChris("RT O or"));
  }

  @Test
  void testValidStringWithSpaces3() {
    assert (palyndromePermutation.solutionChris("Mr Owl ate my metal worm"));
  }

  @Test
  void testValidString2() {
    assert (palyndromePermutation.solutionChris("aabb"));
  }

  @Test
  void testValidString3() {
    assert (palyndromePermutation.solutionChris("kakay"));
  }

  @Test
  void testInvalidString() {
    assert (!palyndromePermutation.solutionChris("abc DEF"));
  }

  @Test
  void testInvalidString2() {
    assert (!palyndromePermutation.solutionChris("You misspelled Palindrome mate"));
  }
  /*
   * Chris's test cases end
   * */

  @Test
  void validTest() {
    assert (palyndromePermutation.solution(validString));
  }

  @Test
  void invalidTest() {
    assert (palyndromePermutation.solution("abc DEF"));
  }
}
