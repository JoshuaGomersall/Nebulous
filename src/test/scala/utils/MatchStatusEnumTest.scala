package utils

import org.scalatest._


class MatchStatusEnumTest extends FlatSpec with Matchers {


  it should "return the ended value" in {
    assert(MatchStatusEnum.Ended != "")
  }

  it should "return the in progress value" in {
    assert(MatchStatusEnum.InProgress != "")
  }

  it should "return the in waiting for start value" in {
    assert(MatchStatusEnum.WaitingForStart != "")
  }

}