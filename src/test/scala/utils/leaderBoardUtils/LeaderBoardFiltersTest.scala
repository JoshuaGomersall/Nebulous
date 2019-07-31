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
}