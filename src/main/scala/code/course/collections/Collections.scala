package code.course.collections

class Collections() {
  val vector: Vector[Int] = Vector[Int](1, 2, 3)
  println(vector)
  val sequence: Seq[Int] = Seq(1, 2, 3)
  println(sequence)
  val set: Set[Int] = Set(1, 2, 3)
  println(set)
  val set2: Set[Int] = Set[Int](1, 2, 'a')
  println(set2)
  val set3: Set[Any] = Set[Any](1, 2, "a")
  println(set3)
  val list: List[Int] = List(1, 2, 3)
  println(list)
  val dupSet: Set[Int] = Set(1, 2, 2)
  println(dupSet)

  println(set ++ set2)
  println(vector.toList)
  println(set.toList)
  println(vector.toSet)
  println(list.toSet)
  println(list.isEmpty)
  println(list.size)
  println(list.size)
//  println(vector.contains("Manoj"))
  println(vector.contains(1))
  println(vector.take(2))
  println(vector.take(20))
  println(set.zip(set2))
  println(set.zip(vector))
  val l: List[Int] = List()

  println(l.size)
  println(l.headOption)
//  println(l(3))
//  println(l.head)
  println(1 +: l)
  val tuple: (Int, String) = (1, "a")
  println(tuple._1)

  println("++++++++++++++++++++++++++++++")
  val map: Map[String, Integer] = Map()
//  map.se
  println(map.get("a"))
  println(map.getOrElse("a", 0))


}

object Collections {
  def main(args: Array[String]): Unit = {
    new Collections()
  }
}