package learner.collections

object SetsSamples {
  def main(args: Array[String]): Unit = {
    var phaniSet = Set("Phani", "Kumar")
    println(phaniSet);
    
    var vipinSet = Set("Kumar", "Vipin")
    
    println(phaniSet.--(vipinSet))
    println(vipinSet.--(phaniSet))
    println(phaniSet.++(vipinSet))
    println(vipinSet.++(phaniSet))
    println(phaniSet.&(vipinSet))
  }
}