package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import UserInterface._



class UserInterfaceTest extends FlatSpec with Matchers {

  it should "exit on the user input of 4 on main menu" in {
    val userInput = new ByteArrayInputStream ("4".getBytes())
    Console.withIn(userInput) {
      assert("Bye" == UserInterface.startMenu)
    }
  }

  it should "exit on the user input of 4 on crud menu" in {
    val userInput = new ByteArrayInputStream ("4".getBytes())
    Console.withIn(userInput) {
      assert("Bye" == UserInterface.crudMenu)
    }
  }

  it should "make a new player from the inputs in the menu" in {
    val userInput = new ByteArrayInputStream ("Test".getBytes())
    Console.withIn(userInput) {
      assert("Player(Test,null,null,0,0)" == UserInterface.makePlayer(true).toString)
    }
  }

}