package learner.functions

object DefaultArgValues {
  def main(args: Array[String]): Unit = {
    println(addValues())
    println(addValues(10))
    println(addValues(a = 10))
    println(addValues(b = 10))
    println(addValues(2, 3))
  }

  def addValues(a: Int = 5, b: Int = 8) =  a + b
}