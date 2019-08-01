package classes

import org.scalatest._


class PlayerTest extends FlatSpec with Matchers {

  val playerOne = new Player("john", "smith", "bigbadjohn", 0, 0)

  it should "make a new user" in {
    assert("john" == playerOne.firstname)
  }

  it should "display the current in the correct format" in {
    println(playerOne)
    assert("Player(john,smith,bigbadjohn,0,0)" == playerOne.toString)
  }

  it should "make a new user and have values it was given" in {
   assert("john" == playerOne.firstname)
    assert("smith" == playerOne.surname)
    assert("bigbadjohn" == playerOne.nickname)
    assert(0 == playerOne.tournamentWins)
    assert("bigbadjohn" == playerOne.getNickname())
  }

  it should "reset the tournament wins to 0" in {
    assert("john" == playerOne.firstname)
    playerOne.newTournamentStart()
    assert(0 == playerOne.getTournamentWins())
  }

  it should "make a new user and display its info" in {
    assert("Firstname:john \nSurname:smith \nNickname:bigbadjohn \nUniquie Code:nhojdabgibhtimsnhoj \nWins:0 \nLoss:0" == playerOne.displayInfo())
  }

  it should "make a new user with wins and loss and display its info" in {
    val playerOne = new Player("john", "smith", "bigbadjohn", 4, 2)
    assert("Firstname:john \nSurname:smith \nNickname:bigbadjohn \nUniquie Code:nhojdabgibhtimsnhoj \nWins:4 \nLoss:2" == playerOne.displayInfo())
  }


}