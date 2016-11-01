package learner.functions

object WithVariableArgs {
  def main(args: Array[String]): Unit = {
    print("NANDAM", "TARAKA", "RAMA", "PHANI", "KUMAR")
  }

  def print(vals: String*) {
    var value: String = "";
    for (value <- vals) {
      println(value)
    }
  }
}