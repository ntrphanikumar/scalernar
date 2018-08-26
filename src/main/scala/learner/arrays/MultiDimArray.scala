package learner.arrays

object MultiDimArray {
  def main(args: Array[String]): Unit = {
    var table = Array.ofDim[Int](5, 5, 5)
    var x = 0; var y = 0; var z = 0
    for (x <- 1 to 5; y <- 1 to 5; z <- 1 to 5) {
      table(x - 1)(y - 1)(z - 1) = x * y * z
    }

    println(table(1)(2)(3), table(3)(2)(1))
  }
}