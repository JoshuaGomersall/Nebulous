package objects

import classes.Player
import utils.leaderBoardUtils.LeaderBoardFilters._
import utils.playerUtils.PlayerReadWrite.readPlayerList

object LeaderBoard {

  def leaderBoardMenu: Unit = {
    println("Welcome to the LeaderBoard \n" +
      "Please choose what you would like to do: \n" +
      "1 - View Best Ratio\n" +
      "2 - View Most Wins\n" +
      "3 - View Most Loses\n" +
      "4 - Back to Main Menu\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
        bestWinLoseRatio((readPlayerList("file")))
        println("\n")
        leaderBoardMenu
      case "2" =>
        mostWins((readPlayerList("file")))
        println("\n")
        leaderBoardMenu
      case "3" =>
        mostLoses((readPlayerList("file")))
        println("\n")
        leaderBoardMenu
      case "4" =>
        println("You exited the LeaderBoard\n")
      case _ =>
        println("Invalid input, try again")
        leaderBoardMenu
    }

  }
  def printSimpleResult(list: List[Player]): Unit = {
    mostWins(list)
  }
}
