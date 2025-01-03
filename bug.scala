```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // This works fine

  // This throws a MatchError: 
  //  scala.MatchError: 5 (of class scala.Int)
  //  at Main$.$anonfun$main$1(Main.scala:8)
  //  at scala.runtime.java8.JFunction0$mcII$sp.apply(JFunction0$mcII$sp.scala:22)
  //  at scala.collection.immutable.List.foreach(List.scala:391)
  //  at Main$.main(Main.scala:8)
  //  at Main.main(Main.scala)
  List(1,2,3,4,5).foreach(i => i match {
    case 5 => println("Five")
    case _ => println(s"Not five: $i")
  })
}
```