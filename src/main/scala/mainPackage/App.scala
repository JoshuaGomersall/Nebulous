package mainPackage

import utils.playerUtils.PlayerReadWrite._

object App {

  def main(args: Array[String]): Unit = {
    val tempPlayerList = readPlayerList("file")
    if(tempPlayerList.isEmpty){
      initialisePlayerFile
      val playerList = readPlayerList("file")
    } else {
      val playerList = tempPlayerList
    }
    Menu.startMenu(tempPlayerList)
  }
}
