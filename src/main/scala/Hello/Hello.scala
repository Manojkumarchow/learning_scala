package Hello

object Hello {

  val name = "Manoj Kumar Pentela"
  //    val is like final keyword in java
  var age = 23
  var company = "TechMojo Solutions"

  def main(args: Array[String]): Unit = {
    val details = new Details()

    details.print(name, company, age)
    val a: Int = 10
    val b: Int = 20

    println("Sum: " + (a + b))
  }
}

class Details {

  def print(name: String, company: String, age: Int): Unit = {
    println("Hello " + name)
    println("Company " + company)
    println("Age " + age)
  }
}
