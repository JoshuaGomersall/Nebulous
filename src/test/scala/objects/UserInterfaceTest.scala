package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import UserInterface._



class UserInterfaceTest extends FlatSpec with Matchers {

  it should "exit on the user input of 4" in {
    val userInput = new ByteArrayInputStream ("4".getBytes())
    Console.withIn(userInput) {
      assert("Bye" == UserInterface.startMenu)
    }
  }
}