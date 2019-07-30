import mainPackage.{Match, Player}
import org.scalatest._
import utils.MatchStatusEnum

class PlayerTest extends FlatSpec with Matchers {

  it should "make a new user" in {
    val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)
    assert("john" == playerOne.firstname)
  }

  it should "make a new user and display its info" in {
    val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)
    assert(() == playerOne.displayInfo())
  }

  it should "make a new user with wins and loss and display its info" in {
    val playerOne = new Player("john", "smith", "bigbadjohn", 4, 2)
    assert(() == playerOne.displayInfo())
  }


}