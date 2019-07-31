package objects

import java.io.ByteArrayInputStream

import org.scalatest._
import Menu._
import classes.Player


class MenuTest extends FlatSpec with Matchers {

  val john = new Player("john" ,"smith" ,"bigbdjohn")

  it should "compile the menu" in {
    assertCompiles("Menu.startMenu")
  }
}