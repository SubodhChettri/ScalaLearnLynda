object Functions {
  val x = println(2)                              //> 2
                                                  //| x  : Unit = ()
  def add(x: Int, y: Int): Int = x + y            //> add: (x: Int, y: Int)Int
  add(2, 5)                                       //> res0: Int = 7

  def printHello(i: String) = println("Hello " + i)
                                                  //> printHello: (i: String)Unit
  printHello("Subodh")                            //> Hello Subodh

  def sayHello():Unit = println("Hello!!!")       //> sayHello: ()Unit
  sayHello                                        //> Hello!!!
}