package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import Menus._



class MenusTest extends FlatSpec with Matchers {

  it should "compile the menu" in {
    assertCompiles("Menu.startMenu")
  }
}