```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // This works fine

  // The issue was that the List was immutable, and the match operation was attempting to alter it implicitly.
  //  Correct solution:
  List(1,2,3,4,5).foreach(i => i match {
    case 5 => println("Five")
    case _ => println(s"Not five: $i")
  })

  //Alternative: using pattern matching with a case class would be safer, as it helps to handle the possibility of missing data more gracefully. 
}
```