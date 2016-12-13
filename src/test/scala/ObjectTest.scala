class Person private (firstName:String, lastName:String)
object Person {
  private var c = 0
  def apply(firstName:String, lastName:String) = {
    c = c + 1
    new Person(firstName, lastName)
  }
  def count = c
}
object Runnable extends App {
  val p = Person("Venezuela","Tokyo")
  val q = Person("Chile", "Andorra")
  println(s"I create ${Person.count} people")
}