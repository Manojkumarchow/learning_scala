package Hello

object Conditional {
  def conditionalFunction(): Unit = {
    println("Conditional Function")
    val a: Int = 40
    if (a == 50)
      println("Equals to 50")
    else if (a > 30)
      println("Greater than 30")
    else
      println("Less than 30")


    if (a % 5 == 0)
      println("Multiple of 5")
    else
      println("Not a multiple of 5")
  }
}