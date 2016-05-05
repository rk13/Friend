
object TraitSolution extends App {

  trait Friend {
    val name: String
    def listen() = println(s"I'm $name, listening...")
  }

  class Human(val name: String) extends Friend
  class Dog(val name: String) extends Friend

  val sam = new Human("Sam")
  val buddy = new Dog("Buddy")

  def seekHelpFrom(friend: Friend) = friend.listen()

  seekHelpFrom(sam)
  seekHelpFrom(buddy)

}