package learner.collections

object ListSamples {
  def main(args: Array[String]): Unit = {
    var strList: List[String] = List("N T R", "Phani", "Kumar")
    println(strList)

    var newStrList = "Nandam" :: "Krishna" :: "Veni" :: Nil
    println(newStrList)

    var twoDimList = ("Name" :: "N T R Phani Kumar" :: Nil) :: ("Location" :: "Hyderabad" :: Nil) :: Nil
    println(twoDimList)

    var twoDimImproperList = ("Name" :: "N T R Phani Kumar" :: Nil) :: ("Location" :: "Hyderabad" :: Nil)
    println(twoDimImproperList)

    val nums = 1 :: 2 :: 3 :: 4 :: Nil
    println(nums.head, nums.tail)

    println(strList ::: newStrList)
    println(strList.++(nums))
    println(strList.:::(nums))
    println(List.concat(strList, newStrList))

    println(List.fill(5)("hello"))
    println(List.fill(10)(2))

    println(List.tabulate(6)(n => n * n))
    println(List.tabulate(4, 5)(_ * _))

    println(nums.reverse)
    println(nums.sortWith((a, b) => a > b))
    println(nums.sortWith(_ > _))
    println(nums.sortBy { x => x % 2 })
    println(nums.sortBy { x => x % 2 }.sorted)

  }
}