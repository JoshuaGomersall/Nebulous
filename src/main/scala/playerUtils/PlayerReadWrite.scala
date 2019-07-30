package playerUtils

import java.io.{File, PrintWriter}
import mainPackage._
import scala.collection.mutable.ListBuffer
import scala.io.Source

object PlayerReadWrite {
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
