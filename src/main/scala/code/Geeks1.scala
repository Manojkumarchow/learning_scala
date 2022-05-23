package code

import constants.Variables

class Geeks1 {
  val name: String = Variables.name
}

class Geeks2 extends Geeks1 {
  var article_No: Int = 10

  // Method
  def details(): Unit = {
    println("Author Name: " + name)
    println("Total No Of Articles: " + article_No)
  }
}

// In scala, multiple inheritance can be achieved by using traits
trait GeeksTrait1 {
  def method1(): Unit
}

trait GeeksTrait2 {
  def method2(): Unit
}

trait GeeksTrait3 {
  def method3(): Unit
}

class GFG extends GeeksTrait1 with GeeksTrait2 with GeeksTrait3 {
  override def method1(): Unit = {
    println("Method 1")
  }

  override def method2(): Unit = {
    println("Method 2")
  }

  override def method3(): Unit = {
    println("Method 3")
  }
}


object Inheritance {
  def main(args: Array[String]): Unit = {
    val obj = new Geeks2()
    obj.details()

    val mulObj = new GFG()

    mulObj.method1()
    mulObj.method2()
    mulObj.method3()
  }
}
