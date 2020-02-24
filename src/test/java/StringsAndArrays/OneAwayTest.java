package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class OneAwayTest {

  OneAway oneAway = new OneAway();

  @Test
  void oneReplaceAway1() {
    assert (oneAway.solution("pale", "bale"));
  }

  @Test
  void oneReplaceAway2() {
    assert (oneAway.solution("pale", "palx"));
  }

  @Test
  void oneReplaceAway3() {
    assert (!oneAway.solution("pale", "pxlx"));
  }

  @Test
  void oneInsertAway1() {
    assert (oneAway.solution("pale", "pal"));
  }

  @Test
  void oneInsertAway2() {
    assert (oneAway.solution("pale", "ale"));
  }

  @Test
  void oneInsertAway3() {
    assert (oneAway.solution("apple", "aple"));
  }

  @Test
  void oneInsertAway4() {
    assert (!oneAway.solution("apple", "able"));
  }

  @Test
  void oneRemoveAway1() {
    assert (oneAway.solution("pal", "pale"));
  }

  @Test
  void oneRemoveAway2() {
    assert (oneAway.solution("ale", "pale"));
  }

  @Test
  void oneRemoveAway3() {
    assert (oneAway.solution("aple", "apple"));
  }

  @Test
  void oneRemoveAway4() {
    assert (!oneAway.solution("able", "apple"));
  }


  @Test
  void validTest0() {
    assert (oneAway.solution("pale", "pale"));
    assert (oneAway.chrisSolution("pale", "pale"));
  }

  @Test
  void validTest1() {
    assert (oneAway.solution("pale", "ple"));
    assert (oneAway.chrisSolution("pale", "ple"));
  }

  @Test
  void validTest2() {
    assert (oneAway.solution("pales", "pale"));
    assert (oneAway.chrisSolution("pales", "pale"));
  }

  @Test
  void validTest3() {
    assert (oneAway.solution("pale", "bale"));
    assert (oneAway.chrisSolution("pale", "bale"));
  }

  @Test
  void invalidTest0() {
    assert (!oneAway.solution("pale", "bake"));
    assert (!oneAway.chrisSolution("pale", "bake"));
  }

  @Test
  void invalidTest1() {
    assert (!oneAway.solution("pale", "long string"));
    assert (!oneAway.chrisSolution("pale", "long string"));
  }

  @Test
  void invalidTest2() {
    assert (!oneAway.solution("pale", "xy"));
    assert (!oneAway.chrisSolution("pale", "xy"));
  }

  @Test
  void invalidTest3() {
    assert (!oneAway.solution("pale", "bal"));
    assert (!oneAway.chrisSolution("pale", "bal"));
  }

  // Edge case
  @Test
  void invalidTest5() {
    assert (!oneAway.solution("aabb", "abab")); // False positive, this is 2 edits!
    assert (!oneAway.chrisSolution("aabb", "abab"));
  }
}
