import collection.mutable.Stack
import org.scalatest._

class PlayerTest extends FlatSpec with Matchers {

  it should "Make a new player" in {
    val greg = new Player("Greg", "Simons", "Greggi Boi")
  }



  it should "Make a new player and display the info" in {
    val greg = new Player("Greg", "Simons", "Greggi Boi")
    greg.displayInfo()
  }



}