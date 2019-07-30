import utils.MatchStatusEnum

class Game(matches: List[Match]) {

  def playTournament(): Unit ={
    for(x <- this.matches){
      x.setStatus(MatchStatusEnum.InProgress)
      println(x.toString)
      println("Type in the winners nickname")
      var winner = playMatch(x, scala.io.StdIn.readLine()).getWinnerName
      println("Next match")
    }
  }
  def playMatch(thisMatch: Match, winner: String): Match = winner match {
    case thisMatch.getPlayerOne.nickname => {
      thisMatch.getPlayerOne.giveWin()
      thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
    }
    case thisMatch.getPlayerTwo.nickname  => {
      thisMatch.getPlayerTwo.giveWin()
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
