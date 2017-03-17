package au.com.SubodhChettri.ScalaLearn

class Upper {
  def toUpper(strings: String*):Seq[String]={
    strings.map((s:String)=>s.toUpperCase())
  }
}

object TestUpper{
  def main(args:Array[String])={
    val up = new Upper
    println(up.toUpper("Subodh","Chettri"))
  }
}



