package objects

import classes.Player
import org.scalatest._


class LeaderBoardTest extends FlatSpec with Matchers {
  val john = new Player("john","smith","bgbadjohn")

  it should "compile the menu" in {
    assertCompiles("LeaderBoard.leaderBoardMenu")
  }

  it should "display the leaderBoard as not empty" in {
    assert( "" != LeaderBoard.printSimpleResult(List(john)))
  }




}