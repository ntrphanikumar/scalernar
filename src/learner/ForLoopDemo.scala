package learner

object ForLoopDemo {
   def main(args: Array[String]) {
//      multiLoop
//      loopList
      yeildTest     
   }
   
   def multiLoop() {
     var a = 0;
      var b = 0;
      
      // for loop execution with a range
      for( a <- 1 to 3; b <- 1 to 3){
         println( "Value of a: " + a );
         println( "Value of b: " + b );
      }
   }
   
   def loopList() {
      var a = 0;
      val numList = List(1,2,3,4,5,6);

      // for loop execution with a collection
      for( a <- numList ){
         println( "Value of a: " + a );
      }
   }
   
   def yeildTest() {
     var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

      // Now print returned values using another loop.
      println(retVal)
      for( a <- retVal){
         println( "Value of a: " + a );
      }
   }
}
