package learner

class StringInterpolation {
  def hello(name: String): String = {
    s"Hello $name"
  }
}

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    var si = new StringInterpolation
    println(si.hello("Phani Kumar"))
    println(s"1 + 1 is ${1 + 1}")
  }
}