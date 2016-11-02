package learner.arrays

object ArrayUtils {
  def main(args: Array[String]): Unit = {
    printArr(Array.range(5, 20))
    printArr(Array.range(5, 20, 3))
    printArr(Array.tabulate(5)((x:Int)=>x*3))
  }

  def printArr(array: Array[Int]) {
    var ele = 0
    print("[")
    for (ele <- array) {
      print(ele + ", ")
    }
    println("]")
  }
}