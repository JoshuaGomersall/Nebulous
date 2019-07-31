package utils.playerUtils

import org.scalatest._
import utils.playerUtils.PlayerReadWrite._
import classes.Player


class PlayerCrudTest extends FlatSpec with Matchers {
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

  def updatePlayer(path: String, playerToUpdate: Player): Unit ={
    removePlayer(path, playerToUpdate)
    addPlayer(path, playerToUpdate)
  }
}