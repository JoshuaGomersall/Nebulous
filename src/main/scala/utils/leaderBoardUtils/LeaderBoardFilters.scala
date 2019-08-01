package utils.leaderBoardUtils

import classes.Player

object LeaderBoardFilters {


  def mostWins(list: List[Player]): String = {
    println(list.sortBy(r => (-r.allTimeWins, r.allTimeLoses)).foreach(_.displayInfo()))
    "Most Wins Displayed"
  }

  def bestWinLoseRatio(list: List[Player]): String = {
    println(list.sortWith((playerOne, playerTwo) => sortByWinLossRatio(playerOne, playerTwo)).foreach(_.displayInfo()))
    "Best Win Loss Displayed"
  }

  def mostLoses(list: List[Player]): String = {
    println(list.sortBy(r => (-r.allTimeLoses, r.allTimeWins )).foreach(_.displayInfo()))
    "Most Loss Displayed"
  }

  def sortByWinLossRatio(playerOne: Player, playerTwo: Player): Boolean = {
    (playerOne.allTimeWins, playerOne.allTimeLoses, playerTwo.allTimeWins,  playerTwo.allTimeLoses) match {
      case (0,0,_,_) => false
      case (_,_,0,0) => true
      case (_,0,_,0) => playerOne.allTimeWins > playerTwo.allTimeWins
      case (_,0,_,_) => true
      case (_,_,_,0) => false
      case _ => (playerOne.allTimeWins / playerOne.allTimeLoses) > (playerTwo.allTimeWins / playerTwo.allTimeLoses)
    }
  }

}