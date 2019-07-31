import objects.Menu
import utils.playerUtils.PlayerReadWrite._

object AppMain {

  def main(args: Array[String]): Unit = {
    Menu.startMenu(initialisePlayerList)
  }
}
