package learner.functions

import java.util.Date

object PartiallyApplied {
  def main(args: Array[String]): Unit = {
    val date = new Date
    var dateAppliedLog = logMessage(date, _:String)
    dateAppliedLog("Hello")
    Thread.sleep(1000)
    dateAppliedLog("Phani")
    Thread.sleep(1000)
    dateAppliedLog("Kumar")
  }

  def logMessage(date: Date, message: String) {
    println(date + ": " + message)
  }
}