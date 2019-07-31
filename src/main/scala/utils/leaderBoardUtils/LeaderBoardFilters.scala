package utils.leaderBoardUtils

import classes.Player

object LeaderBoardFilters {


  def mostWins(list: List[Player]): Unit = {
    println(list.sortBy(_.allTimeWins)(Ordering[Int].reverse).toString)

  }

  def bestWinLoseRatio(list: List[Player]): Unit = {
    list.foreach(_.displayInfo())
  }

  def mostLoses(list: List[Player]): Unit = {
    println(list.sortBy(_.allTimeWins)(Ordering[Int].reverse).toString)
  }

}