package learner.collections

object IteratorSamples {
  def main(args: Array[String]): Unit = {
    var list = List(1,4,3,6,7,8)
    val iterator = list.iterator
    while(iterator.hasNext) {
      println(iterator.next)
    }
    
    var itr = Iterator("a", "b", "c")
    while(itr.hasNext) {
      println(itr.next)
    }
    var ita = Iterator("p", "r", "q")
    var itb = Iterator("p", "r", "q")
    println(ita, ita.min, itb.max)
  }
}