object Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); 
  val x = println(2);System.out.println("""x  : Unit = """ + $show(x ));$skip(39); 
  def add(x: Int, y: Int): Int = x + y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(12); val res$0 = 
  add(2, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(54); 

  def printHello(i: String) = println("Hello " + i);System.out.println("""printHello: (i: String)Unit""");$skip(23); 
  printHello("Subodh");$skip(46); 

  def sayHello():Unit = println("Hello!!!");System.out.println("""sayHello: ()Unit""");$skip(11); 
  sayHello}
}
