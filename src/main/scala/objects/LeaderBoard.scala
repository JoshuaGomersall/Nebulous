package objects

import classes.Player
import utils.leaderBoardUtils.LeaderBoardFilters._

object LeaderBoard {

  def leaderBoardMenu(list: List[Player]): Unit = {
    println("Welcome to the LeaderBoard \n" +
      "Please choose what you would like to do: \n" +
      "1 - View Best Ratio\n" +
      "2 - View Most Wins\n" +
      "3 - View Most Loses\n" +
      "4 - Back to main Menu\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
        println("Still Calculating")
        println("\n")
        leaderBoardMenu(list)
      case "2" =>
        mostWins(list)
        println("\n")
        leaderBoardMenu(list)
      case "3" =>
        mostLoses(list)
        println("\n")
        leaderBoardMenu(list)
      case "4" =>
        println("You exited the LeaderBoard\n")
      case _ =>
        println("Invalid input, try again")
        leaderBoardMenu(list)
    }

  }
  def printSimpleResult(list: List[Player]): Unit = {
    mostWins(list)
  }
}
