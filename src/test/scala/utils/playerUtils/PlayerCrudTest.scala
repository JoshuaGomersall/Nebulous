package utils.playerUtils

import org.scalatest._
import PlayerCrud._
import classes._
import utils.playerUtils._

class PlayerCrudTest extends FlatSpec with Matchers {

  it should "add the new player " in {
    val john = new Player("john" ,"smith" ,"bigbdjohn")

    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.addPlayer("file",john)

    println(PlayerReadWrite.readPlayerList("file"))
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0), Player(john,smith,bigbdjohn,0,0))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

}