package objects

import classes.Player
import objects.MatchGeneration._
import utils.playerUtils.PlayerReadWrite._
import classes.Game
import objects.LeaderBoard._
import utils.playerUtils.PlayerCrud._

object Menus {

  @scala.annotation.tailrec
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
        leaderBoardMenu
      case "4" =>
        println("Bye")
        System.exit(1)
      case _ =>
        println("Invalid input, try again")
    }
    startMenu
  }

  @scala.annotation.tailrec
  def crudMenu: Unit = {
    println("Please input what would you like to do: \n" +
      "1 - Add Player\n" +
      "2 - Remove Player\n" +
      "3 - Update Player\n" +
      "4 - Back\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
        addPlayer("file", makePlayer(true))
        crudMenu
      case "2" =>
        removePlayer("file", makePlayer(true))
        crudMenu
      case "3" =>
        updatePlayer("file", makePlayer(false))
        crudMenu
      case "4" =>
        println("Going back to the main menu")
      case _ =>
        println("Invalid input, try again")
        crudMenu
    }
  }

  def makePlayer(check: Boolean): Player = {
    println("Please input user details")
    if (check)
      new Player(scala.io.StdIn.readLine("First name: \n"), scala.io.StdIn.readLine("Last name: \n"), scala.io.StdIn.readLine("Nickname: \n"))
    else
      new Player(allTimeWins = scala.io.StdIn.readLine("Wins: \n").toIntOption.getOrElse({
        println("Invalid number, defaulting to 0")
        0
      }), allTimeLoses = scala.io.StdIn.readLine("Losses: \n").toIntOption.getOrElse({
        println("Invalid number, defaulting to 0")
        0
      }), firstname = scala.io.StdIn.readLine("First name: \n"), surname = scala.io.StdIn.readLine("Last name: \n"), nickname = scala.io.StdIn.readLine("Nickname: \n"))
  }
}
