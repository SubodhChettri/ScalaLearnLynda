package au.com.SubodhChettri.ScalaLearn

object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(59); 

  val fruits = Set("apple", "orange", "peach", "banana");System.out.println("""fruits  : scala.collection.immutable.Set[String] = """ + $show(fruits ));$skip(20); val res$0 = 

  fruits("peach");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(19); val res$1 = 
  fruits("potato");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(44); 
  var s = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(9); 
  s += 6;$skip(13); 
  println(s);$skip(82); 
  if (s.isEmpty) {
    println("Set is Empty")
  } else {
    println(s.head)
  };$skip(18); 
  println(s.tail);$skip(14); val res$2 = 
  fruits ++ s;System.out.println("""res2: scala.collection.immutable.Set[Any] = """ + $show(res$2));$skip(24); 
  val s1 = Set(1, 2, 3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(10); val res$3 = 
  s1.&(s);System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(67); 
  var g = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 ->"Eggs");System.out.println("""g  : scala.collection.immutable.Map[Int,String] = """ + $show(g ));$skip(25); 
 	g += (5->"Hashbrowns");$skip(11); val res$4 = 
 	g.get(7);System.out.println("""res4: Option[String] = """ + $show(res$4));$skip(13); 
 	println(g);$skip(31); val res$5 = 
 	
 	g.getOrElse(6,"No match");System.out.println("""res5: String = """ + $show(res$5))}
}
