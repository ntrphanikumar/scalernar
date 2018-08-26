package learner.functions

object Recursion {
  def main(args: Array[String]): Unit = {
    println(factorial(10))
  }

  def factorial(i: BigInt): BigInt = {
    if (i == 1) {
      return 1;
    }
    return i * factorial(i - 1)
  }
}