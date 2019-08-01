package utils.leaderBoardUtils

import classes.Player
import org.scalatest.{FlatSpec, Matchers}
import LeaderBoardFilters._

class LeaderBoardFiltersTest extends FlatSpec with Matchers {

  val john = new Player("john" ,"smith" ,"bigbdjohn", 6, 1)
  val john2 = new Player("john" ,"smith" ,"bigbdjohn",5,4)
  val john3 = new Player("john" ,"smith" ,"bigbdjohn", 1, 0)
  val john4 = new Player("john" ,"smith" ,"bigbdjohn",0,0)
  val john5 = new Player("john" ,"smith" ,"bigbdjohn", 6, 0)

  it should "print true as player One's ratio is higher" in{
    assert(sortByWinLossRatio(john, john2))
  }

  it should "return true as player 2 is a new player and player 1 is not" in{
    assert(sortByWinLossRatio(john3, john4))
  }

  it should "return false as player 2 is not a new player and player 1 is" in{
    assert(!sortByWinLossRatio(john4, john3))
  }

  it should "print true as player 1 has more wins than player 2" in{
    assert(sortByWinLossRatio(john5, john3))
  }

  it should "return false as player 2 has 0 loss games" in{
    assert(!sortByWinLossRatio(john2, john5))
  }

  it should "print true as player 1 has 0 loss " in{
    assert(sortByWinLossRatio(john5, john))
  }

  it should "run the command and displays who has the most wins" in{
    assert("Most Wins Displayed" == mostWins(List(john,john2)))
  }

  it should "run the command and displays who has the least wins" in{
    assert("Most Loss Displayed" == mostLoses(List(john,john2)))
  }

  it should "run the command and displays who has the best wins loss" in{
    assert("Best Win Loss Displayed" == bestWinLoseRatio(List(john,john2)))
  }

}