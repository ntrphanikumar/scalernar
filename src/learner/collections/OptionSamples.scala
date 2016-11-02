package learner.collections

object OptionSamples {
  def main(args: Array[String]): Unit = {
    var countryCapitals = Map("India" -> "New Delhi", "USA" -> "Washington DC", "Srilanka" -> "Columbo")
    println(countryCapitals.get("India"))
    println(countryCapitals.get("Pakistan"))
    
    println(showValue(countryCapitals.get("India")))
    println(showValue(countryCapitals.get("Pakistan")))
    
    def showValue[A](option: Option[A])= option match {
      case Some(s) => s
      case None => null
    }
    
    println(countryCapitals.getOrElse("Pakistan", "No Ethics"))
  }
}