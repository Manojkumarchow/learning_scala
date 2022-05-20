package Hello

//import scala.util.control.Breaks.{break, breakable}
//import scala.util.control.Breaks.break
//import scala.util.control.Breaks.breakable
// any of the top imports are also correct
import scala.util.control.Breaks._

class Loops {

  def forLoop(): Unit = {
    var i = 0
    println("For Loop")
    for (i <- 1 to 10) {
      println(i)
    }
  }

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
