import PlayerUtils._
object App {

  def main(args: Array[String]): Unit = {
    val testList: List[Player] = List(
      new Player("a", "b"),
      new Player("c", "d"),
      new Player("e", "f"),
      new Player("g", "h"),
      new Player("i", "j"))

    writePlayerList(testList, "file")
    println(readPlayerList("file").toString())
  }
}



