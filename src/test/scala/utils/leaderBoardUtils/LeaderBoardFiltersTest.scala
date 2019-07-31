package utils.leaderBoardUtils

import classes.Player
import org.scalatest.{FlatSpec, Matchers}
import LeaderBoardFilters._

class LeaderBoardFiltersTest extends FlatSpec with Matchers {

  val john = new Player("john" ,"smith" ,"bigbdjohn", 6, 1)
  val john2 = new Player("john" ,"smith" ,"bigbdjohn",5,4)

  it should "print true as player One's ratio is higher" in{
    assert(true == sortByWinLossRatio(john, john2))
  }

  it should "prints a win/lose ratio Leaderboard" in{
    assert( "" != LeaderBoardFilters.bestWinLoseRatio(List(john)))
  }

  it should "prints a most wins Leaderboard" in{
    assert("" != LeaderBoardFilters.mostWins(List(john)))
  }

  it should "prints a most losses Leaderboard" in{
    assert("" != LeaderBoardFilters.mostLoses(List(john)))
  }

}