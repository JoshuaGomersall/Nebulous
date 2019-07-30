import scala.io.Source
import java.io.File
import java.io.PrintWriter

import scala.collection.mutable.ListBuffer

object PlayerUtils {
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
      val nextPlayer = Player(line.split(",").toList)
      playerList += nextPlayer
    }
    playerList.toList
  }
}
