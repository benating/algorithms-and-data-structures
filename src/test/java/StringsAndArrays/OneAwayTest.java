package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class OneAwayTest {

  OneAway oneAway = new OneAway();

  @Test
  void validTest0() {
    assert (oneAway.diegoSolution("pale", "pale"));
    assert (oneAway.chrisSolution("pale", "pale"));
  }

  @Test
  void validTest1() {
    assert (oneAway.diegoSolution("pale", "ple"));
    assert (oneAway.chrisSolution("pale", "ple"));
  }

  @Test
  void validTest2() {
    assert (oneAway.diegoSolution("pales", "pale"));
    assert (oneAway.chrisSolution("pales", "pale"));
  }

  @Test
  void validTest3() {
    assert (oneAway.diegoSolution("pale", "bale"));
    assert (oneAway.chrisSolution("pale", "bale"));
  }

  @Test
  void invalidTest0() {
    assert (!oneAway.diegoSolution("pale", "bake"));
    assert (!oneAway.chrisSolution("pale", "bake"));
  }

  @Test
  void invalidTest1() {
    assert (!oneAway.diegoSolution("pale", "long string"));
    assert (!oneAway.chrisSolution("pale", "long string"));
  }

  @Test
  void invalidTest2() {
    assert (!oneAway.diegoSolution("pale", "xy"));
    assert (!oneAway.chrisSolution("pale", "xy"));
  }

  @Test
  void invalidTest3() {
    assert (!oneAway.diegoSolution("pale", "bal"));
    assert (!oneAway.chrisSolution("pale", "bal"));
  }

  @Test
  void invalidTest4() {
    assert (!oneAway.diegoSolution("pale", "paleee"));
    assert (!oneAway.chrisSolution("pale", "paleee"));
  }


  // Edge case
  @Test
  void invalidTest5() {
    assert (!oneAway.diegoSolution("aabb", "abab")); // False positive, this is 2 edits!
    assert (!oneAway.chrisSolution("aabb", "abab"));
  }
}
