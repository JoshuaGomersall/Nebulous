package utils

object MatchStatusEnum extends Enumeration {
  val WaitingForStart: Value = Value(0, "Waiting to Start")
  val InProgress: Value = Value(1, "In Progress")
  val Ended: Value = Value(2, "classes.Game Finished")
}
