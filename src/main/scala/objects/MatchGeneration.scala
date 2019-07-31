package objects

import classes.{Match, Player}
import utils.MatchStatusEnum
import utils.playerUtils.PlayerReadWrite._

import scala.collection.mutable.ListBuffer
import scala.io.Source

object MatchGeneration extends App{

  def matchGeneration = {

    val listOfMatches = new ListBuffer[Match]()

    val playerList: List[Player] = readPlayerList("file")

    playerList.zipWithIndex.foreach({ case(x, i) =>
      playerList.drop(i + 1).foreach(listOfMatches addOne new Match(x, _))})

    listOfMatches

  }

//  def removeMatch(i: Int) = {
//    matchGeneration.filter(x => x != matchGeneration(i))
//  }

  println(matchGeneration)

}
