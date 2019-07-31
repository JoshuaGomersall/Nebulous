package utils.playerUtils
import classes._
import PlayerReadWrite._

object PlayerCrud {
  def addPlayer(path: String, newPlayer: Player) {
    val playerList = readPlayerList(path)
    val newPlayerList = playerList :+ newPlayer
    writePlayerList(newPlayerList, path)
  }

  def removePlayer(path: String, playerToRemove: Player){
    val playerList: List[Player] = readPlayerList(path)
    val idToCheck = playerToRemove.uniquieID
    val tempPlayerList = playerList.filterNot(player => player.uniquieID == idToCheck)
    writePlayerList(tempPlayerList, path)
  }
}