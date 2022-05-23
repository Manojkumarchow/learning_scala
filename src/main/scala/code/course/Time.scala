package code.course

class Time(hours: Int = 0, minutes: Int = 0) {
  require(hours >= 0 && hours < 24, "Invalid Hours value, should be >= 0 and <= 23")
  require(minutes >= 0 && minutes < 60, "Invalid minutes, should be >=0 and <= 59")

  val asMinutes: Int = (hours * 60) + minutes
  println("As Minutes: " + asMinutes)

  def minus(providedTime: Time): Int = {
    // we can also use this.asMinutes
    return asMinutes - providedTime.asMinutes
  }

  // we can write this way, if we have only 1 line to return in the function
//  def minus1(providedTime: Time): Int = asMinutes - providedTime.asMinutes
}

// companion objects can access their private members

object Time {
  def fromMinutes(minutes: Int) : Time = new Time(minutes / 60, minutes % 60)

  def main(args: Array[String]): Unit = {
    var obj = new Time(10, 0);
    println(obj.asMinutes)
  }
}
