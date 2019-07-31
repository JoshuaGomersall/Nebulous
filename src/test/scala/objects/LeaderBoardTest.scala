package objects

import classes.Player
import org.scalatest._


class LeaderBoardTest extends FlatSpec with Matchers {
  val john = new Player("john","smith","bgbadjohn")

  it should "display the leaderbard as not empty" in {
    assert( "" != LeaderBoard.printSimpleResult(List(john)))
  }

  it should "display the leaderbard with 2 records of john" in {
    assert( "Firstname:john \nSurname:smith \nNickname:bgbadjohn \nUniquie Code:nhojdabgbhtimsnhoj \nWins:0 \nLoss:0" != LeaderBoard.printSimpleResult(List(john,john)).toString)
  }

}