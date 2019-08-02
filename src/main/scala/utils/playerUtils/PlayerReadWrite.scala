package utils.playerUtils

import java.io.{File, PrintWriter}
import classes._
import scala.collection.mutable.ListBuffer
import scala.io.Source

object PlayerReadWrite {

  def initialisePlayerFile(file: String) :String ={
    val testList = List(
      new Player("a","a","a" ),
      new Player("b","b","b" ),
      new Player("c","c","c" ),
      new Player("d","d","d" ),
      new Player("e","e","e" )
    )
    writePlayerList(testList, file)
    "file made"
  }

  def writePlayerList(playerList: List[Player], path: String): String ={
    val playerFile = new File(path)
    val playerWriter = new PrintWriter(playerFile)
    playerList.foreach(player => {
      playerWriter.write(player.toString + "\n")
    })
    playerWriter.close()
    "writting done"
  }

  def readPlayerList(path: String): List[Player] ={
    val file = Source.fromFile(path)
    val playerList : ListBuffer[Player] = ListBuffer.empty
    for(line <- file.getLines().toList){
      val playerArgList = line.dropRight(1).drop(7).split(",").toList
      val nextPlayer = Player(playerArgList)
      playerList += nextPlayer
    }
    playerList.toList
  }
}
