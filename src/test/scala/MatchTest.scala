import org.scalatest._

class MatchTest extends FlatSpec with Matchers {
  it should "make a new instance of Match and return correct value from toString" in {
    val newMatch = new Match(
      new Player("john", "smith", "bigbadjohn", 0, 0),
      new Player("john", "smith", "bigbadjohn the second", 0, 0)
    )
    assert(newMatch.toString === "Game bigbadjohn vs bigbadjohn the second is waiting to be played")
  }
}