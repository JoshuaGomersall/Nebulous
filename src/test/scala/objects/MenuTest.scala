package objects

import org.scalatest._
import Menu._
import classes.Player


class MenuTest extends FlatSpec with Matchers {

  val john = new Player("john" ,"smith" ,"bigbdjohn")

  it should "load the menu for user input" in {
    assertCompiles("Menu.startMenu(List(john, john))")
  }
}