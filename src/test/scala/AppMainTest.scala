import java.io.ByteArrayInputStream

import org.scalatest._
import AppMain.main

class AppMainTest extends FlatSpec with Matchers {


  it should "run the app and ensures that main return a unit" in {
    val userInput = new ByteArrayInputStream("4".getBytes())
    Console.withIn(userInput) {
      AppMain.main(Array("")) shouldBe a [Unit]
    }
  }
}