package learner

object Run {
  implicit class IntTimes(x: Int) {
    def times[A](func: => A) {
      def loop(current: Int) {
        if (current > 0) {
          func
          loop(current - 1)
        }
      }
    }
  }

  implicit class NumericOperations(x: Int) {
    def addTo(y: Int): Int = {
      return y + x
    }

    def removeFrom(y: Int): Int = {
      return y - x
    }
  }
}