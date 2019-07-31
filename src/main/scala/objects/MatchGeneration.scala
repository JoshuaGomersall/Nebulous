package objects

import classes.{Match, Player}
import utils.MatchStatusEnum
import utils.playerUtils.PlayerReadWrite

import scala.collection.mutable.ListBuffer
import scala.io.Source

object MatchGeneration extends App{

//  def readFromFile: ListBuffer[Player] = {
//
//    val listOfPlayers = new ListBuffer[Player]()
//
//    val filename = "/home/starter/listofplayers.txt"
//
//    Source.fromFile(filename).getLines.foreach(p => listOfPlayers addOne new Player(p(0),p(1),p(2),0,0))
//
//    listOfPlayers
//
//  }

  def matchGeneration = {

    val listOfMatches = new ListBuffer[Match]()

    val playerList: List[Player] = PlayerReadWrite.readPlayerList("file")

    playerList.zipWithIndex.foreach({ case(x, i) =>
      playerList.drop(i + 1).foreach(listOfMatches addOne new Match(x, _))})

    listOfMatches

  }

//  def removeMatch(i: Int) = {
//    matchGeneration.filter(x => x != matchGeneration(i))
//  }

  println(matchGeneration)

}
