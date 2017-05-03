package au.com.SubodhChettri.ScalaLearn

object sets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val fruits = Set("apple", "orange", "peach", "banana")
                                                  //> fruits  : scala.collection.immutable.Set[String] = Set(apple, orange, peach,
                                                  //|  banana)

  fruits("peach")                                 //> res0: Boolean = true
  fruits("potato")                                //> res1: Boolean = false
  var s = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)       //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  s += 6
  println(s)                                      //> Set(5, 1, 6, 2, 3, 4)
  if (s.isEmpty) {
    println("Set is Empty")
  } else {
    println(s.head)
  }                                               //> 5
  println(s.tail)                                 //> Set(1, 6, 2, 3, 4)
  fruits ++ s                                     //> res2: scala.collection.immutable.Set[Any] = Set(peach, 5, banana, 1, 6, oran
                                                  //| ge, 2, 3, apple, 4)
  val s1 = Set(1, 2, 3)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  s1.&(s)                                         //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  var g = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Juice", 4 ->"Eggs")
                                                  //> g  : scala.collection.immutable.Map[Int,String] = Map(1 -> Milk, 2 -> Bread,
                                                  //|  3 -> Juice, 4 -> Eggs)
 	g += (5->"Hashbrowns")
 	g.get(7)                                  //> res4: Option[String] = None
 	println(g)                                //> Map(5 -> Hashbrowns, 1 -> Milk, 2 -> Bread, 3 -> Juice, 4 -> Eggs)
 	
 	g.getOrElse(6,"No match")                 //> res5: String = No match
}