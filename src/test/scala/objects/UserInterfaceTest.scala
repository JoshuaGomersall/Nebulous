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

  it should "update or add a player from the inputs in the menu" in {
    val inputs = "5\n2 \nTest\nTest2\nTestNick\n".getBytes()

    val userInput = new ByteArrayInputStream(inputs)

    Console.withIn(userInput) {
      assert("Player(Test,Test2,TestNick,5,0)" == UserInterface.makePlayer(false).toString)
    }
  }

  it should "win/loss should default to 0 if a string is entered" in {
    val inputs = "String\n String\nTest\nTest2\nTest3\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Player(Test,Test2,Test3,0,0)" == UserInterface.makePlayer(false).toString)
    }
  }

  it should "entering 5 will be invalid and ask for a new result in main menu" in {
    val inputs = "5,\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == UserInterface.startMenu)
    }
  }

  it should "entering 5 will be invalid and ask for a new result in crud menu" in {
    val inputs = "5,\n4\n".getBytes()
    val userInput = new ByteArrayInputStream(inputs)
    Console.withIn(userInput) {
      assert("Bye" == UserInterface.crudMenu)
    }
  }


}