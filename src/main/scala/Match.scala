import utils.MatchStatusEnum

class Match(playerOne: Player, playerTwo: Player, status: MatchStatusEnum.Value, winnerName: String) {

  override def toString: String = {
    status match {
      case MatchStatusEnum.WaitingForStart => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is waiting to be played"
      case MatchStatusEnum.InProgress => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is in progress"
      case MatchStatusEnum.Ended => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} has ended. $winnerName won"
    }
  }

  def setWinnerNickname(newWinnerNickname: String): Match = {
    new Match(playerOne, playerTwo, MatchStatusEnum.Ended, newWinnerNickname)
  }

  def setStatus(newStatus: MatchStatusEnum.Value): Match = {
    new Match(playerOne, playerTwo,newStatus, winnerName)
  }
}
