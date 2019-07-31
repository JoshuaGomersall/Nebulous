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
      var winner = playMatch(x, scala.io.StdIn.readLine()).getWinnerName
      println("Next match")
    }
    this.players.sortWith(_.getTournamentWins() > _.getTournamentWins())
    println(s"The winner is ${this.players(0)}")
  }

  def playMatch(thisMatch: Match, winner: String): Match = winner match {
   case thisMatch.getPlayerOne.nickname => {
      thisMatch.getPlayerOne.giveWin()
     thisMatch.getPlayerTwo.giveLose()
      thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
    }
    case thisMatch.getPlayerTwo.nickname  => {
      thisMatch.getPlayerTwo.giveWin()
      thisMatch.getPlayerOne.giveLose()
        thisMatch.setWinnerNickname(thisMatch.getPlayerTwo.nickname)
      }
    case _ => {
      println("typing error")
      println(thisMatch.toString)
      println("Type in the winners nickname")
      playMatch(thisMatch, scala.io.StdIn.readLine())
    }
  }
}
