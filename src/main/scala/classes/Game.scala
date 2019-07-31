package classes

import utils.MatchStatusEnum

class Game(matches: List[Match], players: List[Player]) {

  def playTournament(): Unit ={
    for(x <- players){
      x.newTournamentStart()
    }
    for(x <- this.matches){
      x.setStatus(MatchStatusEnum.InProgress)
      println(x.toString)
      println("Type in the winners nickname")
      var winner = playMatch(x, x.getPlayerOne.getNickname, x.getPlayerTwo.getNickname,  scala.io.StdIn.readLine()).getWinnerName
      println("Next match")
    }
    this.players.sortWith(_.getTournamentWins() > _.getTournamentWins())
    println(s"The winner is ${this.players(0)}")
  }

  def playMatch(thisMatch: Match,nick1: String, nick2: String, winner: String): Match = winner match {
   case nick1 => {
      thisMatch.getPlayerOne.giveWin()
     thisMatch.getPlayerTwo.giveLose()
      thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
    }
    case nick2  => {
      thisMatch.getPlayerTwo.giveWin()
      thisMatch.getPlayerOne.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerTwo.nickname)
      }
    case _ => {
      println("typing error")
      println(thisMatch.toString)
      println("Type in the winners nickname")
      playMatch(thisMatch, nick1, nick2, scala.io.StdIn.readLine())
    }
  }
}
