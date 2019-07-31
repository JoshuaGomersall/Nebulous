class Player (val firstname: String , val surname: String ,val nickname: String ,allTimeWins : Int = 0,allTimeLoses :Int = 0) {


  val uniquieID = {this.firstname + this.surname + this.nickname}.reverse.replace(" ","")
  def giveWin() : Unit = {
    this.allTimeWins +=1
  }
  def getWins(): Int = {
    this.allTimeWins
  }

  def displayInfo (): Unit = {
    println(s"Firstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname} \nUniquie Code:${this.uniquieID} \nWins:${this.allTimeWins} \nLoss:${this.allTimeLoses} ")
  }

}
