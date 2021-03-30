package lectures.part2.oop

object MethodNotations extends App {

  // must write in this obj otherwise will clash with Person in OOBasics.scala
  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean =
      movie == favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is with ${person.name}" // this is a valid expression
    def +(nickName: String): Person =
      new Person(s"${this.name} ($nickName)", favouriteMovie)

    def unary_! : String = s"Woohoo! $name"

    def unary_+ : Person = new Person(name, favouriteMovie, age = this.age + 1)

    def isAlive: Boolean = true

    def learns(thing: String) = s"${this.name} learns $thing"

    def learnScala: String = this learns "Scala"

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"

    def apply(numberOfTimes: Int): String = s"${this.name} watched ${this.favouriteMovie} $numberOfTimes times."
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent! infix notation, only works with single param

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  println(mary + tom)
  println(mary.+(tom)) // equivalent as above, all operators are methods

  // prefix notation - all about unary operators
  val x = -1
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)

  // postfix notation - AFTER
  // methods without any params can be used in postfix
  // usually not used
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent to above! because apply method is defined

  // exercise tests
  val james = new Person("James", "Interstellar")
  val olderJames = +james
  println(s"olderJames age: ${olderJames.age}")

  val olderJamesNickName = olderJames + "the Sanborn"
  println(s"olderJamesNickname: ${olderJamesNickName.name}")

  println(olderJamesNickName learnScala)
  println(olderJamesNickName(4))

  /*
    Exercises:

    1. Overload the plus operator which receives a String and return a new Person with name "Mary (the rockstar)"
    2. Add an age to Person class with default zero value, and add an unary plus operator
     and increments age plus one, with a new Person
    3. Add an "learns" method in the Person class => "Mary learns Scala"
       Add a learnScala method, calls learn method with Scala as param
       Use it in postfix

    4. Overload apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */
}
