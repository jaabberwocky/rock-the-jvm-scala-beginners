package lectures.part2.oop

object Objects {

  // scala does not have class-level functionality ("static")
  object Person {
    // "static" or class-level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method to build person
    // sole reason is to build classes
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }
  // this is called companions
  // class + object
  class Person(val name: String) {
    // instance-level functionality
    def getName: String = this.name
  }

  // so you don't have to "extends App"
  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = Singleton instance by definition
    // dont need any other code
    val mary = new Person("Mary")
    val john = new Person("John") // instantiate a CLASS
    val jimmy = new Person("Jimmy") // instantiate an INSTANCE
    println(mary == john)
    println(jimmy getName)

    val bobby = Person(mary, john)
  }


  // Scala applications = Scala object with
  // def main(args: Array[String]): Unit <---- entry point for JVM
}
