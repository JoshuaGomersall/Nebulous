package utils.leaderBoardUtils

import classes.Player

object LeaderBoardFilters {


  def mostWins(list: List[Player]): Unit = {
    println(list.sortBy(r => (-r.allTimeWins, r.allTimeLoses)).foreach(_.displayInfo()))

  }

  def bestWinLoseRatio(list: List[Player]): Unit = {
    println(list.sortWith((playerOne, playerTwo) => sortByWinLossRatio(playerOne, playerTwo)).foreach(_.displayInfo()))
  }

  def mostLoses(list: List[Player]): Unit = {
    println(list.sortBy(r => (-r.allTimeLoses, r.allTimeWins )).foreach(_.displayInfo()))
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