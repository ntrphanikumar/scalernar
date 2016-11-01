package learner.functions

object NamedArguments {
  def main(args: Array[String]): Unit = {
    printVals(5, 7)
    printVals(y = 7, x = 5)
  }

  def printVals(x: Int, y: Int) {
    println("Value of x is: " + x)
    println("Value of y is: " + y)
  }
}