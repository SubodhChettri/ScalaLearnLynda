package au.com.SubodhChettri.ScalaLearn


object Calculator {
  def main(args: Array[String]) = {
    var x = 10;
    var y = 5;
    println(addition(x, y))
    println(quotient(x, y))
    println(times(x, y))
    println(minus(x, y))
  }


def addition(x: Int, y: Int): Int = {
    x + y
  }


def quotient(x: Int, y: Int): Int = {
    if (y == 0) 0
    else x / y
  }


def times(x: Int, y: Int): Int = {
    x * y
  }


def minus(x: Int, y: Int): Int = {
    x - y
  }
}