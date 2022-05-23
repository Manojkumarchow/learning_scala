package code.course

class Functions {

  def add: Int => Int = number => number + 1

//  def add2 = number => number + 1

  def show(): Unit = {
   println(for {
     n <- 1 to 3 if n % 2 == 1
     m <- 1 to n
   } yield n * m)
  }

}

object Functions {
  def main(args: Array[String]): Unit = {
    val obj = new Functions();
    obj.show()
  }
}
