class Player (val firstname: String , val surname: String ,val nickname: String , uniquieID : String = "placeHolder"    ,totalWins :Int = 0) {






  def displayInfo (): Unit = {
    println(s"Firstname:${this.firstname} \nSurname:${this.surname} \nNickname:${this.nickname}         Total Wins:${this.totalWins}       ")
  }

}
