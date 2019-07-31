package classes
import org.scalatest._

class GameTest extends FlatSpec with Matchers{
  val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)
  val playerTwo = new Player("john", "smith", "bigbadjohn the second", 0, 0)
  val matchOne = new Match(playerOne, playerTwo)
  it should "return playerOne when we input bigbadjohn" in {
    val matches = List[Match](matchOne)
    val playerList = List[Player](playerOne, playerTwo)
    val game = new Game(matches, playerList)
    assert(playerOne == game.playMatch(matchOne, playerOne.nickname, playerTwo.nickname, "bigbadjohn"))
  }
  it should "return playerTwo when we input bigbadjohn the second" in {
    val matches = List[Match](matchOne)
    val playerList = List[Player](playerOne, playerTwo)
    val game = new Game(matches, playerList)
    assert(playerTwo == game.playMatch(matchOne, playerOne.nickname, playerTwo.nickname, winner="bigbadjohn the second"))
  }

}
