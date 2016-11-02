package learner

trait Equals {
  def isEquals(x: Any): Boolean
  def show() = println(this)
  final def isNotEquals(x: Any) = !isEquals(x)
}

class Point(xc: Int, yc: Int) extends Equals {
  var x = xc
  var y = yc

  def isEquals(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x && obj.asInstanceOf[Point].y == y
  override def show() = {
    println(s"Point($x, $y)")
  }
}

object TraitSample {
  def main(args: Array[String]): Unit = {
    var pt = new Point(10, 5)
    pt.show
    println(pt.isEquals(pt), pt.isEquals(new Point(pt.x, pt.y)), pt.isEquals(new Point(pt.y, pt.x)))
  }
}