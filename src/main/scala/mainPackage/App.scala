package mainPackage

import playerUtils.PlayerReadWrite.{readPlayerList, writePlayerList}

object App {

  def main(args: Array[String]): Unit = {
    val testList = List(
      new Player("a","a","a" ),
      new Player("b","b","b" ),
      new Player("c","c","c" ),
      new Player("d","d","d" ),
      new Player("e","e","e" )
    )
    writePlayerList(testList, "file")
    println(readPlayerList("file")(0))
    Menu.startMenu
  }
}
