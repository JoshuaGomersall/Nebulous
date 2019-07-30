import utils.MatchStatusEnum

import scala.collection.mutable.ListBuffer
import scala.io.Source

object MatchGeneration extends App{

  def readFromFile: ListBuffer[Player] = {

    val listOfPlayers = new ListBuffer[Player]()

    val filename = "/home/starter/listofplayers.txt"
    for (line <- Source.fromFile(filename).getLines) {
      val player = line.split(" ").toList
      listOfPlayers addOne Player(player(0),player(1),player(2),0,0)
    }

    listOfPlayers

  }

  def matchGeneration = {

    val listOfMatches = new ListBuffer[Match]()

    for (i <- 0 until readFromFile.size) {
      for (j <- i + 1 until readFromFile.size) {
        listOfMatches addOne new Match(readFromFile(i),readFromFile(j),MatchStatusEnum.WaitingForStart,"")
        println(new Match(readFromFile(i),readFromFile(j),MatchStatusEnum.WaitingForStart,""))
      }
    }

    listOfMatches

  }

//  def removeMatch(i: Int) = {
//    matchGeneration.filter(x => x != matchGeneration(i))
//  }

  matchGeneration

}
