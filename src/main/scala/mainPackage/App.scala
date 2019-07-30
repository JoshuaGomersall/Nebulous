package mainPackage

import utils.playerUtils.PlayerReadWrite._

object App {

  def main(args: Array[String]): Unit = {
    val tempPlayerList = readPlayerList("path")
    if(tempPlayerList.isEmpty){
      initialisePlayerFile
      val playerList = readPlayerList("path")
    } else {
      val playerList = tempPlayerList
    }
    Menu.startMenu
  }
}
