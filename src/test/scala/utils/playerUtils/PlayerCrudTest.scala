package utils.playerUtils

import org.scalatest._
import PlayerCrud._
import classes._
import utils.playerUtils._

class PlayerCrudTest extends FlatSpec with Matchers {

  val john = new Player("john" ,"smith" ,"bigbdjohn")
  val john2 = new Player("john" ,"smith" ,"bigbdjohn",0,1)


  it should "add the new player " in {
    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.addPlayer("file",john)
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0), Player(john,smith,bigbdjohn,0,0))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

  it should "delete the new player " in {
    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.addPlayer("file",john)
    PlayerCrud.removePlayer("file",john)
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

  it should "deleting an invalid player should not cause a code crash" in {
    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.removePlayer("file",john)
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

  it should "update the new player " in {
    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.addPlayer("file",john)
    PlayerCrud.updatePlayer("file",john2)
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0), Player(john,smith,bigbdjohn,0,1))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

  it should "update should add if the player does not exist" in {
    PlayerReadWrite.initialisePlayerFile
    PlayerCrud.updatePlayer("file",john2)
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0), Player(john,smith,bigbdjohn,0,1))" == PlayerReadWrite.readPlayerList("file").toString() )
  }

}