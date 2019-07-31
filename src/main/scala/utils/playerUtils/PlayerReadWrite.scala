package utils.playerUtils

import java.io.{File, PrintWriter}
import classes._
import scala.collection.mutable.ListBuffer
import scala.io.Source

object PlayerReadWrite {

  def initialisePlayerList:List[Player] ={

    val tempPlayerList = readPlayerList("file")
    if(tempPlayerList.isEmpty){
      val testList = List(
        new Player("a","a","a" ),
        new Player("b","b","b" ),
        new Player("c","c","c" ),
        new Player("d","d","d" ),
        new Player("e","e","e" )
      )
      writePlayerList(testList, "file")
      readPlayerList("file")
    } else {
      tempPlayerList
    }
  }

  def writePlayerList(playerList: List[Player], path: String): Unit ={
    val playerFile = new File(path)
    val playerWriter = new PrintWriter(playerFile)
    playerList.foreach(player => {
      playerWriter.write(player.toString + "\n")
    })
    playerWriter.close()
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
