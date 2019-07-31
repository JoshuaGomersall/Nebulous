package utils.playerUtils

import org.scalatest._
import utils.playerUtils.PlayerReadWrite

class PlayerReadWriteTest extends FlatSpec with Matchers {

  it should "write to the file" in {
    assert( () == PlayerReadWrite.writePlayerList(List(),"file"))
  }

  it should "makes the player file" in {
    assert(() == PlayerReadWrite.initialisePlayerFile)
  }

  it should "read from the file" in {
    println(PlayerReadWrite.readPlayerList("file"))
    assert("Test" != PlayerReadWrite.readPlayerList("file"))
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0))" == PlayerReadWrite.readPlayerList("file").toString())
  }

}