package learner.arrays

object ArrayAccess {
  def main(args: Array[String]): Unit = {
    var arr = new Array[String](3)
    arr(1) = "Phani"; arr(2) = "Kumar"; arr(0) = "N T R"
    var value = ""
    for (value <- arr) {
      println(value)
    }

    var arrNew = Array("N T R", "Phani", "Kumar")
    var idx = 0
    for (idx <- 0 until arrNew.length) {
      print(arrNew(idx) + " ")
    }
    println()
  }
}