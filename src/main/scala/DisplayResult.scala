import scala.io.Source

object DisplayResult {

  val filename = "fileopen.scala"

  val fileContents = Source.fromFile(filename)
  val displayResult= fileContents.getLines.mkString
  fileContents.close

  println(displayResult)

}
