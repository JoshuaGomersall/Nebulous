package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import UserInterface._



class UserInterfaceTest extends FlatSpec with Matchers {

  it should "compile the menu" in {
    assertCompiles("Menu.startMenu")
  }
}