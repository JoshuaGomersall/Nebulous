import mainPackage.Match
import org.scalatest._

import utils.MatchStatusEnum

class MatchTest extends FlatSpec with Matchers {

  val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)
  val playerTwo = new Player("john", "smith", "bigbadjohn the second", 0, 0)
  val winnerName = "winner"


  it should "make a new instance of Match and return correct value from toString before game has started" in {
    val newMatch = new Match(
      playerOne,
      playerTwo
    )
    assert(newMatch.toString === "Game bigbadjohn vs bigbadjohn the second is waiting to be played")
  }

  it should "make a new instance of Match and return correct value from toString when match is in progress" in {
    val newMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.InProgress
    )
    assert(newMatch.toString === "Game bigbadjohn vs bigbadjohn the second is in progress")
  }

  it should "make a new instance of Match and return correct value from toString when game is over" in {
    val newMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.Ended,
      "BigBadJohn the second"
    )
    assert(newMatch.toString === "Game bigbadjohn vs bigbadjohn the second has ended. BigBadJohn the second won")
  }

  it should "return player one correctly" in {
    val newMatch = new Match(
      playerOne,
      playerTwo
    )
    assert(newMatch.getPlayerOne eq playerOne)
  }

  it should "return player two correctly" in {
    val newMatch = new Match(
      playerOne,
      playerTwo
    )
    assert(newMatch.getPlayerTwo eq playerTwo)
  }

  it should "return match status correctly" in {
    val newMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.WaitingForStart
    )
    assert(newMatch.getMatchStatus === MatchStatusEnum.WaitingForStart)
  }

  it should "return winner name correctly" in {

    val newMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.WaitingForStart,
      winnerName
    )
    assert(newMatch.getWinnerName === winnerName)
  }

  it should "return new instance of match with updated winner name" in {
    val newWinnerName = "I am the new winner"
    val testMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.WaitingForStart,
      winnerName
    )
    assert(testMatch.getWinnerName === winnerName)

    val updatedMatch = testMatch.setWinnerNickname(newWinnerName)
    assert(updatedMatch.getWinnerName === newWinnerName)
  }

  it should "return new instance of match with updated status" in {
    val testMatch = new Match(
      playerOne,
      playerTwo,
      MatchStatusEnum.WaitingForStart,
      winnerName
    )
    assert(testMatch.getMatchStatus === MatchStatusEnum.WaitingForStart)
    val updatedMatch: Match = testMatch.setStatus(MatchStatusEnum.InProgress)
    assert(updatedMatch.getMatchStatus === MatchStatusEnum.InProgress)
  }


}