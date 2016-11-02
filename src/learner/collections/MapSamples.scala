package learner.collections

object MapSamples {
  def main(args: Array[String]): Unit = {
    var charsMap = Map('a' -> 1, 'b' -> 2)
    println(charsMap, charsMap.keys, charsMap.values)
    charsMap += ('c' -> 3)
    charsMap += ('d' -> 4)

    println(charsMap, charsMap.keys, charsMap.values)

    println(charsMap.+('e' -> 5))
    println(charsMap.++(Map('g' -> 6, 'h' -> 7)))
    
    charsMap.foreach(println)
  }
}