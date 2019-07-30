import scala.io.Source

object DisplayResult {

  val filename = "file"

  val fileContents = Source.fromFile(filename)
  val displayResult = fileContents.getLines.mkString
  fileContents.close

  def printSimpleResult(unit: Unit): Unit = {
    println(displayResult)
  }
}
