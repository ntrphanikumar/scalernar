package learner.collections

object TupleSamples {
  def main(args: Array[String]): Unit = {
    var tuple = (5, 3, 7, "Phani", 2)
    println(tuple)
    println(tuple._1, tuple._2, tuple._4)
  }
}