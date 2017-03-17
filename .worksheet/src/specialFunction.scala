object specialFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); val res$0 = 
  ((x: Int) => x * 2).apply(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(25); val res$1 = 
  ((x: Int) => x * 2)(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 
  val f = ((x: Int) => x * 2);System.out.println("""f  : Int => Int = """ + $show(f ));$skip(7); val res$2 = 
  f(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
  f.apply(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(34); 
  val doubler = (i: Int) => i * 2;System.out.println("""doubler  : Int => Int = """ + $show(doubler ));$skip(13); val res$4 = 
  doubler(2);System.out.println("""res4: Int = """ + $show(res$4));$skip(70); 
  def someOperations(f: (Int, Int) => Int) {
    println(f(5, 5))
  };System.out.println("""someOperations: (f: (Int, Int) => Int)Unit""");$skip(38); 
  val add = (x: Int, y: Int) => x + y;System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(43); 
  val multiply = (x: Int, y: Int) => x * y;System.out.println("""multiply  : (Int, Int) => Int = """ + $show(multiply ));$skip(40); 
  val minus = (x: Int, y: Int) => x - y;System.out.println("""minus  : (Int, Int) => Int = """ + $show(minus ));$skip(24); 

  someOperations(add);$skip(27); 
  someOperations(multiply);$skip(44); 
  someOperations((x: Int, y: Int) => x / y);$skip(60); 

  def greetings() = (name: String) => { "Hello " + name };System.out.println("""greetings: ()String => String""");$skip(22); 
  val g = greetings();System.out.println("""g  : String => String = """ + $show(g ));$skip(14); val res$5 = 
  g("Subodh");System.out.println("""res5: String = """ + $show(res$5));$skip(12); 
  var y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(37); 
  val multiplier = (x: Int) => x * y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(16); val res$6 = 
  multiplier(5);System.out.println("""res6: Int = """ + $show(res$6))}
  
}
