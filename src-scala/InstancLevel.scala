
object InstanceLevel extends App {

  trait Friend {
    val name: String
    def listen() = println(s"I'm $name, listening...")
  }

  class Human(val name: String) extends Friend
  class Dog(val name: String) extends Friend
  class Cat(val name: String)

  val sam = new Human("Sam")
  val buddy = new Dog("Buddy")

  def seekHelpFrom(friend: Friend) = friend.listen()

  seekHelpFrom(sam)
  seekHelpFrom(buddy)

  val alf = new Cat("Alf")
  seekHelpFrom(alf) //ERROR

  
  
  
  
  
  
  
  
  
  
  
  val tac = new Cat("Tac") with Friend
  seekHelpFrom(tac)

}