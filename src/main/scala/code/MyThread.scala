package code

class MyThread extends Thread {
  override def run(): Unit = {
    println("Thread " + Thread.currentThread().getName() + " is running.")
  }
}

object Threads {
  def main(args: Array[String]): Unit = {
    println("Manoj Kumar Pentela".split(" ").toString())
    println("Manoj Kumar Pentela" split " ".toString())
    println(123 == 123)
    for (x <- 1 to 5) {
      var th = new MyThread()
      th.setName(x.toString())
      th.start()
    }
  }
}