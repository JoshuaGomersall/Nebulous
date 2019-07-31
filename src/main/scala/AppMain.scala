import objects.Menu
import utils.playerUtils.PlayerReadWrite.{initialisePlayerFile, readPlayerList}

object AppMain {

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
