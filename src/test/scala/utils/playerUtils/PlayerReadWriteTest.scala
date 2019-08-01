package utils.playerUtils

import org.scalatest._
import utils.playerUtils.PlayerReadWrite

class PlayerReadWriteTest extends FlatSpec with Matchers {

  it should "write to the file" in {
    assert(() == PlayerReadWrite.writePlayerList(List(),"filetest"))
  }

  it should "makes the player file" in {
    assert(() == PlayerReadWrite.initialisePlayerFile("filetest"))
  }

  it should "read from the file" in {
    PlayerReadWrite.initialisePlayerFile("filetotest")
    assert("Test" != PlayerReadWrite.readPlayerList("filetotest"))
    assert("List(Player(a,a,a,0,0), Player(b,b,b,0,0), Player(c,c,c,0,0), Player(d,d,d,0,0), Player(e,e,e,0,0))" == PlayerReadWrite.readPlayerList("filetotest").toString())
  }

}