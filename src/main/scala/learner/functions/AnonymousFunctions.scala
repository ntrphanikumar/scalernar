package learner.functions

object AnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var sum = (x: Int, y: Int) => x + y
    println(sum(5, 6))
  }
}