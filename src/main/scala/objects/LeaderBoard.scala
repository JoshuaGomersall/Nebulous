package objects

import classes.Player

import scala.io.Source
import utils.leaderBoardUtils.LeaderBoardFilters._

object LeaderBoard {

  def printSimpleResult(list: List[Player]): Unit = {
    mostWins(list)
  }
}
