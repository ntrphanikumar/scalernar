package learner

import scala.util.matching.Regex

object RegexSample {
  def main(args: Array[String]): Unit = {
    val pattern = "(s|S)cala".r
    val string = "Scala is scalable and cool"
    println((pattern findAllIn string).mkString(", "))
    
    println(pattern replaceFirstIn(string, "Java"))
    println(pattern replaceAllIn(string, "Java"))
  }
}