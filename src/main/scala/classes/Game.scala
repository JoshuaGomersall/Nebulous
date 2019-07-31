package classes

import utils.MatchStatusEnum

class Game(matches: List[Match], players: List[Player]) {

  def playTournament(): Unit = {
    for (x <- players) {
      x.newTournamentStart()
    }
    for (x <- this.matches) {
      x.setStatus(MatchStatusEnum.InProgress)
      println(x.toString)
      println("Type in the winners nickname")
      playMatch(x, x.getPlayerOne.nickname, x.getPlayerTwo.nickname, scala.io.StdIn.readLine())
      println("Next match")
    }
    println(s"The winner is ${players(0)}") //This line is broken, need to find teh winnar
  }

  def playMatch(thisMatch: Match, nickname1: String, nickname2: String, winner: String): Match = {
    println(nickname1)
    println(nickname2)
    println(winner)
    winner match {
      case thisMatch.playerOne.nickname =>
        println("Glip")
        thisMatch.getPlayerOne.giveWin()
        thisMatch.getPlayerTwo.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
      case thisMatch.playerTwo.nickname =>
        println("Glop")
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
