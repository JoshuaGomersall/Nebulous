package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import Menu._



class MenuTest extends FlatSpec with Matchers {

  it should "compile the menu" in {
    assertCompiles("Menu.startMenu")
  }
}