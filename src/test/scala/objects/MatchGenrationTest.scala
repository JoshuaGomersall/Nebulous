package objects

import classes.{Match, Player}
import org.scalatest._


class MatchGenrationTest extends FlatSpec with Matchers {

  it should "give me a list of matches" in {
    assert(MatchGeneration.matchGeneration.toString().contains("Game a vs b is waiting to be played"))
  }

  it should "compile match generation" in {
    assertCompiles("MatchGeneration.matchGeneration")
  }


}