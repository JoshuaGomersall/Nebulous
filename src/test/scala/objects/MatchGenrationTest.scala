package objects

import classes.{Match, Player}
import org.scalatest._
import utils.playerUtils.PlayerReadWrite


class MatchGenrationTest extends FlatSpec with Matchers {

  it should "give me a list of matches" in {
    PlayerReadWrite.initialisePlayerFile("MatchGenerationTestFile")
    assert(MatchGeneration.matchGeneration("MatchGenerationTestFile").toString().contains("Game a vs b is waiting to be played"))
  }

  it should "compile match generation" in {
    assertCompiles("MatchGeneration.matchGeneration()")
  }


}