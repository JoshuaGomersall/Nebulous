package classes

import utils.MatchStatusEnum

class Game(matches: List[Match], players: List[Player]) {

  def playTournament(): Unit = {
    players.foreach(player => player.newTournamentStart())
    matches.foreach(tempMatch => {
      tempMatch.setStatus(MatchStatusEnum.InProgress)
      println(tempMatch.toString)
      println("Type in the winners nickname")
      playMatch(tempMatch, tempMatch.getPlayerOne.nickname, tempMatch.getPlayerTwo.nickname, scala.io.StdIn.readLine())
      println("Next match")
    })
    println(s"The winner is ${players(0)}") //This line is broken, need to find teh winnar
  }


  def playMatch(thisMatch: Match, nickname1: String, nickname2: String, winner: String): Match = {
    winner match {
      case thisMatch.playerOne.nickname =>
        thisMatch.getPlayerOne.giveWin()
        thisMatch.getPlayerTwo.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
      case thisMatch.playerTwo.nickname =>
        thisMatch.getPlayerTwo.giveWin()
        thisMatch.getPlayerOne.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerTwo.nickname)
      case _ =>
        println("typing error")
        println(thisMatch.toString)
        println("Type in the winners nickname")
        playMatch(thisMatch, nickname1, nickname2, scala.io.StdIn.readLine())
    }
  }
}
