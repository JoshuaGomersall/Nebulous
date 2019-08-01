package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import Menu._



class MenuTest extends FlatSpec with Matchers {

  it should "compile the menu" in {
    assertCompiles("Menu.startMenu")
  }

  it should "exit on the user input of 4" in {
    val userInput = new ByteArrayInputStream ("4".getBytes())
    Console.withIn(userInput) {
      assert("Bye" == Menu.startMenu)
    }
  }

}