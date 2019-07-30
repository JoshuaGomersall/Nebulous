class Player (val firstname: String , val surname: String ,val nickname: String ,allTimeWins : Int = 0,allTimeLoses :Int = 0) {


  val uniquieID = {this.firstname + this.surname + this.nickname}.reverse.replace(" ","")

  def displayInfo (): String = {
    s"Firstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname} \nUniquie Code:${this.uniquieID} \nWins:${this.allTimeWins} \nLoss:${this.allTimeLoses}"
  }

}
