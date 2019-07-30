import utils.MatchStatusEnum

class Match(playerOne: Player, playerTwo: Player, status: MatchStatusEnum.type, winnerName: String) {

  override def toString: String = {
    status match {
      case MatchStatusEnum.WaitingForStart => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is waiting to be played"
      case MatchStatusEnum.InProgress => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is in progress"
      case MatchStatusEnum.Ended => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} has ended. $winnerName won"
    }
  }

}
