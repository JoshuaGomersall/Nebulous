import utils.MatchStatusEnum

class Game(matches: List[Match]) {

  def playTournament(): Unit ={
    for(x <- this.matches){
      x.setStatus(MatchStatusEnum.InProgress)
      
    }
  }
  def playMatch(thisMatch: Match, winner: String): String = {
    println(thisMatch.toString)
    println("Type in the winners nickname")
    if (winner == thisMatch.getPlayerOne.nickname) {
      thisMatch.setWinnerNickname(thisMatch.getPlayerOne.nickname)
      "success"
    }
    else if (winner == thisMatch.getPlayerTwo.nickname) {
      thisMatch.setWinnerNickname(thisMatch.getPlayerTwo.nickname)
      "success"
    }
    else {
      "retry"
    }
  }
}
