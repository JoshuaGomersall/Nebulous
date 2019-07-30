package mainPackage

class Player(val firstname: String, val surname: String, val nickname: String, allTimeWins: Int = 0, allTimeLoses: Int = 0) {


  val uniquieID = {
    this.firstname + this.surname + this.nickname
    }.reverse.replace(" ", "")

  override def toString: String = "mainPackage.Player(%s,%s,%s,%s,%s)".format(this.firstname, this.surname, this.nickname, this.allTimeWins, this.allTimeLoses)

  def displayInfo(): Unit = {
    println(s"Firstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname} \nUniquie Code:${this.uniquieID} \nWins:${this.allTimeWins} \nLoss:${this.allTimeLoses} ")
  }
}

object Player{
  def apply(args: List[String]) = new Player(args(0), args(1), args(2), args(3).toInt, args(4).toInt)
}

