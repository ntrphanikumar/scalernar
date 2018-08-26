package learner.functions

object LocalFunctions {
  def main(args: Array[String]): Unit = {
    println(1 factorial)
    println(2 factorial)
    println(3 factorial)
    println(4 factorial)
    println(5 factorial)
  }

  implicit class Factorial(x: Int) {
    def factorial(): Int = {
      def fact(x: Int, accumulator: Int): Int = {
        if (x <= 1) {
          accumulator
        } else {
          fact(x - 1, x * accumulator)
        }
      }
      fact(x, 1)
    }
  }
}