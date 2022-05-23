package code

import Hello._
import constants.Variables

class SmartPhone {
  // Instance Variables / Class Variables
  var year: Int = Variables.phoneBoughtYear
  var phoneCompany: String = Variables.phoneCompany

  // class Method
  // we can use return type as 'Unit' for returning any of the value from the function
  // we can also specific return types as Int
  def display(): Int = {
    println("Phone bought year: " + year)
    println("Phone company name: " + phoneCompany)
    return year;
  }
}

class Dog(val name: String = "tiger", val breed: String = "Grey Hound", val color: String = "Brown", val age: Int = 1) {
  // primary constructor
  def display(): Unit = {
    println(name)
    println(breed)
    println(color)
    println(age)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // class object
    //    val obj = new SmartPhone();
    //    println("Phone Year: " + obj.display());
    // anonymous object
    new SmartPhone().display();
    val geeks1 = new Geeks1();
    println("Name: " + geeks1.name);
    val dog = new Dog()
    dog.display()
  }
}
