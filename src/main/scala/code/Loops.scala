package code

//import scala.util.control.Breaks.{break, breakable}
//import scala.util.control.Breaks.break
//import scala.util.control.Breaks.breakable
// any of the top imports are also correct

import scala.util.control.Breaks._

class Loops {

  def forLoop(): Unit = {
    /*
    var i = 0
    println("For Loop")
    for (
      i <- 1 to 10;
      j <- 10 to 15
    ) {
      println("i: " + i)
      println("j: " + j)
    }

    val result = for {
      i <- 1 to 10
      if i > 6
    } yield i * i
    println("Result: " + result)


    val age = 12
    age match {
      case 23 => println("My Age")
      case 21 => println("Brother age")
      case _ => println("Not my age") // default case
    }

    val name = "Manoj"

    name.toLowerCase match {
      case "manoj" => println("My name")
      case _ => println("some other name")
    }


    val myAge = age match {
      case 20 => age
      case _ => "0"
    }
    println(myAge)

    age match {
      case 20 | 22 | 24 | 26 | 28 | 30 => println("even")
      case _ => println("odd")
    }
     */
    println(Math.add(1, 2))
    println(subtract(
      2, 3
    ))
    println(add(2))
    println(multiply(1, 2))
    println(divide(1, 2))

    val anonymousAddFunction = (x: Int, y: Int) => x + y
    println(anonymousAddFunction(2, 3))
    println(math(2, 32, 32, _ + _))
    println(math(2, 32, 50, _ min _))
    println(math(2, 32, 55, _ max _))
    // closure - it is a function which uses 1 or more variables declared outside this function.

    // scala options -> Some or None
    val list = List(1, 2, 3)
    val map = Map(1 -> "Manoj", 2 -> "Kumar", 3 -> "Pentela")
    val opt: Option[Int] = Some(1)
    println(list.find(_ > 5).getOrElse("No Element found greater than the given number"))
    println(map.get(5).getOrElse("No Name found"))
    // the above statement can also be written like below statement
    println(map.getOrElse(5, "No Name found"))
    println(opt)

    println(list.map(_ * 2))

    println(map.map(_ + "hi")) // applies on the keys & values

    //    println(map.mapValues(_ + "hi"))
    //    println(map.mapValues(x => "hi " + x))
    println("manoj".toUpperCase)
    val ls = List("manoj", "kumar", "pentela")
    println(ls.map(_.toUpperCase))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)
    println(list.map(x => List(x, x + 1)))
    println(list.map(x => List(x, x + 1)).flatten)
    println(list.flatMap(x => List(x, x + 1))) // map & flatten
    println(list.filter(_ > 1)) // filter is a predicate which gives a boolean value
    println(list.filter(x => x % 2 == 1))

    println(list.scanRight(10)(_ + _))
    val user1 = new User("Manoj", 23)
    val user2 = new User()
    val user3 = new User("Pentela")

    println(user1.getAge)
    println(user2.getAge)
    println(user3.getAge)

  }

  // this is the primary constructor
  class User(val name: String, private var age: Int) {

    //  Auxiliary constructor
    def this() {
      this("Tom", 22)
    }

    def this(name: String) {
      this(name, 25) // we can call our primary constructor this way
    }

    def getAge: Int = age
  }


  object Math {
    def add(x: Int, y: Int): Int = x + y
  }

  def math(x: Int, y: Int, z: Int, operation: (Int, Int) => Int): Int = operation(operation(x, y), z) // higher order function

  def add(x: Int, y: Int = 3): Int = x + y

  def subtract(x: Int, y: Int): Int = x - y

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int): Int = x / y

  def reminder(x: Int, y: Int): Int = x % y

  def whileLoop(): Unit = {
    var x: Int = 10
    println("While Loop")
    while (x > 0) {
      println(x)
      x = x - 1
    }
  }


  def breakLoops(): Unit = {
    var x = 10
    println("Break")
    breakable {
      println("Inside Breakable")
      while (x > 0) {
        if (x == 5) {
          println("Inside Break --> " + x)
          break
        }
        println(x)
        x = x - 1
      }
    }
  }
}
