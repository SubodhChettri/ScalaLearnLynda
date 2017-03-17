object specialFunction {
  ((x: Int) => x * 2).apply(5)                    //> res0: Int = 10
  ((x: Int) => x * 2)(5)                          //> res1: Int = 10
  val f = ((x: Int) => x * 2)                     //> f  : Int => Int = <function1>
  f(5)                                            //> res2: Int = 10
  f.apply(4)                                      //> res3: Int = 8
  val doubler = (i: Int) => i * 2                 //> doubler  : Int => Int = <function1>
  doubler(2)                                      //> res4: Int = 4
  def someOperations(f: (Int, Int) => Int) {
    println(f(5, 5))
  }                                               //> someOperations: (f: (Int, Int) => Int)Unit
  val add = (x: Int, y: Int) => x + y             //> add  : (Int, Int) => Int = <function2>
  val multiply = (x: Int, y: Int) => x * y        //> multiply  : (Int, Int) => Int = <function2>
  val minus = (x: Int, y: Int) => x - y           //> minus  : (Int, Int) => Int = <function2>

  someOperations(add)                             //> 10
  someOperations(multiply)                        //> 25
  someOperations((x: Int, y: Int) => x / y)       //> 1

  def greetings() = (name: String) => { "Hello " + name }
                                                  //> greetings: ()String => String
  val g = greetings()                             //> g  : String => String = <function1>
  g("Subodh")                                     //> res5: String = Hello Subodh
  var y = 5                                       //> y  : Int = 5
  val multiplier = (x: Int) => x * y              //> multiplier  : Int => Int = <function1>
  multiplier(5)                                   //> res6: Int = 25
  
}