package objects

import java.io.ByteArrayInputStream

import classes.Player
import org.scalatest._


class LeaderBoardTest extends FlatSpec with Matchers {
  val john = new Player("john","smith","bgbadjohn")

  it should "compile the menu" in {
    assertCompiles("LeaderBoard.leaderBoardMenu")
  }

  it should "display the leaderbard as not empty" in {
    assert( "" != LeaderBoard.printSimpleResult(List(john)))
  }

  it should "displays the leaderboard menu and exits from it" in {
    val userInput = new ByteArrayInputStream ("4".getBytes())
    Console.withIn(userInput) {
      assert("Bye" == LeaderBoard.leaderBoardMenu)
    }
  }

  it should "entering 5 will be invalid in the leaderboard menu" in {
    val inputs = "5,\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == LeaderBoard.leaderBoardMenu)
    }
  }

  it should "entering 1 will display some information in the leaderboard menu then ask for a other option" in {
    val inputs = "1\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == LeaderBoard.leaderBoardMenu)
    }
  }

  it should "entering 2 will display some information in the leaderboard menu then ask for a other option" in {
    val inputs = "2\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == LeaderBoard.leaderBoardMenu)
    }
  }

  it should "entering 3 will display some information in the leaderboard menu then ask for a other option" in {
    val inputs = "3\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == LeaderBoard.leaderBoardMenu)
    }
  }


}