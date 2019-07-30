import DisplayResult._

object Menu {

  def startMenu: Unit = {
    println("Welcome to the Nebulous tournament! \n" +
      "Please choose what you would like to do: \n" +
      "1 - Set up a tournament\n" +
      "2 - Manage players\n" +
      "3 - Leaderboard\n")
    scala.io.StdIn.readLine() match {
      case "1" =>
        addPlayers(playerNo)
      case "2" =>
        println("Placeholder")
      case "3" =>
        printSimpleResult()
      case _ =>
        println("Invalid input, try again")
        startMenu
    }
  }

  def addPlayers(number: Int): Unit = {
    println("adding " + number + " players to list")
  }

  def playerNo: Int = {
    println("How many players would you like in your tournament?")
    val ans: String = scala.io.StdIn.readLine()
    toInt(ans).getOrElse(-1) match {
      case -1 =>
        println("Invalid input, try again")
        playerNo
      case _ =>
        ans.toInt
    }
  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => None
    }
  }

}
