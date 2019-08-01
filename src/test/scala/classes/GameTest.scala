package classes
import java.io.ByteArrayInputStream

import objects.UserInterface
import org.scalatest._

class GameTest extends FlatSpec with Matchers{
  val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)
  val playerTwo = new Player("john", "smith", "bigbadjohn the second", 0, 0)
  val matchOne = new Match(playerOne, playerTwo)
  val matches = List[Match](matchOne)
  val playerList = List[Player](playerOne, playerTwo)
  val game = new Game(matches, playerList)

  it should "return playerOne when we input bigbadjohn" in {
    assert(playerOne == game.playMatch(matchOne, playerOne.nickname, playerTwo.nickname, "bigbadjohn"))
  }
  it should "return playerTwo when we input bigbadjohn the second" in {
    assert(playerTwo == game.playMatch(matchOne, playerOne.nickname, playerTwo.nickname, winner="bigbadjohn the second"))
  }
  it should "return and error when we input invalid input" in {
    val userInut = new ByteArrayInputStream ("bigbadjohn".getBytes())
    Console.withIn(userInut) {
      assert(playerOne == game.playMatch(matchOne, playerOne.nickname, playerTwo.nickname, winner="big jeff"))
    }
  }

  it should "run a tournament and does not return a unit" in {
    val userInut = new ByteArrayInputStream ("bigbadjohn".getBytes())
    Console.withIn(userInut) {
      assert(isInstanceOf[Unit] != game.playTournament())
    }
  }

}
