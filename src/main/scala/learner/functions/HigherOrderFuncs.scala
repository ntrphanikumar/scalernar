package learner.functions

object HigherOrderFuncs {
  def main(args: Array[String]): Unit = {
    println(stringify(10))
    println(apply(stringify, 20))
  }
  
  def apply[A](func: A => String, v: A) = func(v)

  def stringify[A](x: A): String = "[" + x.toString + "]"
}