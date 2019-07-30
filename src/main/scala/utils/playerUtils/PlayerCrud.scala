package utils.playerUtils
import mainPackage._
import PlayerReadWrite._

object PlayerCrud {
  def addPlayer(path: String, newPlayer: Player) {
    val playerList = readPlayerList(path)
    val newPlayerList = playerList :+ newPlayer
    writePlayerList(newPlayerList, path)
  }
}