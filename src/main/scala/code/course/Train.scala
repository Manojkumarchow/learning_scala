package code.course

class Train(number: Int, kind: String) {

  def show(): Unit = {
    println("Train Number: " + number)

  }
}

object Train {
  def main(args: Array[String]): Unit = {
    val train = new Train(10, "EV")
    // println(train.number)
    /*
    these 2 fields are accessible only when fields are
    defined using 'val' or 'var'
    */
    // println(train.kind)

    train.show()
  }
}
