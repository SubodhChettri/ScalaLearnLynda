object CallBy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  def something() = {
    println("inside calling something")
    5 // return value
  };System.out.println("""something: ()Int""");$skip(124); 

  def callByValue(x: Int) = {
    println("inside call by value: ")
    println("x1: " + x)
    println("x2: " + x)

  };System.out.println("""callByValue: (x: Int)Unit""");$skip(29); 

  callByValue(something());$skip(123); 

  def callByName(x: => Int) = {
    println("inside call by name: ")
    println("x1: " + x)
    println("x2: " + x)
  };System.out.println("""callByName: (x: => Int)Unit""");$skip(28); 

  callByName(something())}

}
