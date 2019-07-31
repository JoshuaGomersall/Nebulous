package utils

import org.scalatest._


class MatchStatusEnumTest extends FlatSpec with Matchers {


  it should "return the ended value" in {
    println(MatchStatusEnum.Ended)
    assert(MatchStatusEnum.Ended != "")
  }

  it should "return the in progress value" in {
    println(MatchStatusEnum.InProgress)
    assert(MatchStatusEnum.InProgress != "")
  }

  it should "return the in waiting for start value" in {
    println(MatchStatusEnum.WaitingForStart)
    assert(MatchStatusEnum.WaitingForStart != "")
  }

}