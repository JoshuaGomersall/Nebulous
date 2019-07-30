package mainPackage

import scala.io.Source

object DisplayResult {

  val filename = "file"

  val fileContents = Source.fromFile(filename)
  val displayResult = fileContents.getLines.mkString
  fileContents.close

  def printSimpleResult(list: List[Player]): Unit = {
    list.foreach(_.displayInfo())
  }
}
