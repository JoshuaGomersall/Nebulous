package objects

import org.scalatest._
import Leaderboard._
import javax.swing.JTree
import classes.Player


class LeaderboardTest extends FlatSpec with Matchers {

  val john = new Player("john","smith","bgbadjohn")

  it should "display the leaderbard as not empty" in {
    assert( "" != Leaderboard.printSimpleResult(List(john)))
  }

  it should "display the leaderbard with 2 records of john" in {
    assert( "Firstname:john \nSurname:smith \nNickname:bgbadjohn \nUniquie Code:nhojdabgbhtimsnhoj \nWins:0 \nLoss:0" != Leaderboard.printSimpleResult(List(john,john)).toString)
  }
}