package classes

import utils.MatchStatusEnum
import scala.collection.mutable.ListBuffer

class Game(matches: List[Match], players: List[Player]) {

  def playTournament(): Unit = {
    val playerList = new ListBuffer[Player]()
    players.foreach(player => player.newTournamentStart())
    matches.foreach(tempMatch => {
      tempMatch.setStatus(MatchStatusEnum.InProgress)
      println(tempMatch.toString)
      println("Type in the winners nickname")
      playerList += playMatch(tempMatch, tempMatch.getPlayerOne.nickname, tempMatch.getPlayerTwo.nickname, scala.io.StdIn.readLine())
      println("Next match")
    })
    println(s"The winner is ${playerList.toList.maxBy(player => player.tournamentWins).nickname}") //This line is broken, need to find teh winnar
  }


  def playMatch(thisMatch: Match, nickname1: String, nickname2: String, winner: String): Player = {
    winner match {
      case thisMatch.playerOne.nickname =>
        thisMatch.getPlayerOne.giveWin()
        thisMatch.getPlayerTwo.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
        thisMatch.playerOne
      case thisMatch.playerTwo.nickname =>
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
