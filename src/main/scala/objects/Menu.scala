package objects

import classes.Player
import objects.MatchGeneration._
import utils.playerUtils.PlayerReadWrite._
import classes.Game
import objects.Leaderboard._

object Menu {

  def startMenu: Unit = {
    println("Welcome to the Nebulous tournament! \n" +
      "Please choose what you would like to do: \n" +
      "1 - Set up a tournament\n" +
      "2 - Manage players\n" +
      "3 - Leaderboard\n" +
      "4 - Exit\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
        new Game(matchGeneration.toList, readPlayerList("file")).playTournament()
        println("The tournament is done!")
      case "2" =>
        crudMenu
      case "3" =>
      printSimpleResult(readPlayerList("file"))
      case "4" =>
        println("Bye")
        System.exit(1)
      case _ =>
        println("Invalid input, try again")
    }
    startMenu
  }

  def crudMenu: Unit = {
    println("Please input what would you like to do: \n" +
      "1 - Add Player\n" +
      "2 - Remove Player\n" +
      "3 - Update Player\n" +
      "4 - Exit\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
      case "2" =>
      case "3" =>
      case "4" =>
        println("Bye")
        System.exit(1)
      case _ =>
        println("Invalid input, try again")
    }
    crudMenu
  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => None
    }
  }

}
