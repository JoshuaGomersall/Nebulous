package classes

import utils.MatchStatusEnum


class Match(playerOne: Player, playerTwo: Player, status: MatchStatusEnum.Value = MatchStatusEnum.WaitingForStart, winnerName: String = "") {

  override def toString: String = {
    status match {
      case MatchStatusEnum.WaitingForStart => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is waiting to be played"
      case MatchStatusEnum.InProgress => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} is in progress"
      case MatchStatusEnum.Ended => s"Game ${playerOne.nickname} vs ${playerTwo.nickname} has ended. $winnerName won"
    }
  }

  def getPlayerOne: Player = playerOne

  def getPlayerTwo: Player = playerTwo

  def getMatchStatus: MatchStatusEnum.Value = status

  def getWinnerName: String = winnerName

  def setWinnerNickname(newWinnerNickname: String): Match = {
    new Match(playerOne, playerTwo, MatchStatusEnum.Ended, newWinnerNickname)
  }

  def setStatus(newStatus: MatchStatusEnum.Value): Match = {
    new Match(playerOne, playerTwo,newStatus, winnerName)
  }
}
