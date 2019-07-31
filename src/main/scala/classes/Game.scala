package classes

import utils.MatchStatusEnum
import scala.collection.mutable.ListBuffer

class Game(matches: List[Match], players: List[Player]) {

  def playTournament(): Unit = {
    var playerList = new ListBuffer[Player]()
    for (x <- players) {
      x.newTournamentStart()
    }
    for (x <- matches) {
      x.setStatus(MatchStatusEnum.InProgress)
      println(x.toString)
      println("Type in the winners nickname")
      playerList +=  playMatch(x, x.getPlayerOne.nickname, x.getPlayerTwo.nickname, scala.io.StdIn.readLine())
      println("Next match")
    }
    println(s"The winner is ${playerList.toList.maxBy(player => player.tournamentWins).nickname}") //This line is broken, need to find teh winnar
  }

  def playMatch(thisMatch: Match, nickname1: String, nickname2: String, winner: String): Player = {
    println(nickname1)
    println(nickname2)
    println(winner)
    winner match {
      case thisMatch.playerOne.nickname =>
        println("Glip")
        thisMatch.getPlayerOne.giveWin()
        thisMatch.getPlayerTwo.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
        thisMatch.playerOne
      case thisMatch.playerTwo.nickname =>
        println("Glop")
        thisMatch.getPlayerTwo.giveWin()
        thisMatch.getPlayerOne.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerTwo.nickname)
        thisMatch.playerTwo
      case _ =>
        println("typing error")
        println(thisMatch.toString)
        println("Type in the winners nickname")
        playMatch(thisMatch, nickname1, nickname2, scala.io.StdIn.readLine())
    }
  }
}
