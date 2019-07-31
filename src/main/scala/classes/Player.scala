package classes

class Player(val firstname: String, val surname: String, val nickname: String, var allTimeWins: Int = 0, var allTimeLoses: Int = 0, var tournamentWins: Int = 0) {

  val uniquieID: String = {
    this.firstname + this.surname + this.nickname
    }.reverse.replace(" ", "")
  def newTournamentStart() = {
    tournamentWins = 0
  }
  def giveWin()= {
    allTimeWins += 1
    tournamentWins += 1
    println(tournamentWins)
  }
  def giveLose() = {
    allTimeLoses += 1
  }
  def getTournamentWins(): Int = {
    tournamentWins
  }
  def getNickname(): String = {
    nickname
  }
  override def toString: String = "Player(%s,%s,%s,%s,%s)".format(this.firstname, this.surname, this.nickname, this.allTimeWins, this.allTimeLoses)

  def displayInfo(): String = {
    println(s"======================================== \nFirstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname} \nUniquie Code:${this.uniquieID} \nWins:${this.allTimeWins} \nLoss:${this.allTimeLoses} \n======================================== \n")
    s"Firstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname} \nUniquie Code:${this.uniquieID} \nWins:${this.allTimeWins} \nLoss:${this.allTimeLoses}"
  }
}

object Player{
  def apply(args: List[String]) = new Player(args(0), args(1), args(2), args(3).toInt, args(4).toInt)
}
