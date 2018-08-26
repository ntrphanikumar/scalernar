package learner.functions

object Currying {
  def main(args: Array[String]): Unit = {
    def multiply(a: Int)(b: Int) = a*b
    val tenMultipleof = multiply(10)_
    
    println(tenMultipleof(2))
    println(tenMultipleof(5))
  }
}