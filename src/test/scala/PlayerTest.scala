import collection.mutable.Stack
import org.scalatest._

class PlayerTest extends FlatSpec with Matchers {

  it should "Make a new player" in {
    val greg = new Player("Greg", "Simons", "Greggi Boi")
  }

  it should "Make a new player and display the info" in {
    val greg = new Player("Greg", "Simons", "Greggi Boi")
    assert("Firstname:Greg \nSurname:Simons \nNickname:Greggi Boi \nUniquie Code:ioBiggerGsnomiSgerG \nWins:0 \nLoss:0" == greg.displayInfo())
  }

  it should "Make a new player with a given win and loss value and display the info" in {
    val greg = new Player("Greg", "Simons", "Greggi Boi",5,2)
    assert("Firstname:Greg \nSurname:Simons \nNickname:Greggi Boi \nUniquie Code:ioBiggerGsnomiSgerG \nWins:5 \nLoss:2" == greg.displayInfo())
  }

}