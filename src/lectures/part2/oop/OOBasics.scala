package lectures.part2.oop

object OOBasics extends App {
  val authorJohn = new Writer("John", "Doe", 1962)
  println(authorJohn.fullName())
  val authorJane = new Writer("Jane", "Austen", 1975)

  val niceBook = new Novel("Nice Book", 1988, author = authorJohn)
  println(niceBook.isWrittenBy(authorJane))
  println(niceBook.isWrittenBy(authorJohn))
  println(s"Author was ${niceBook.authorAge()} years old when writing this book.")

  val c = new Counter(1)
  val d = c.increment()
  println(s"d has ${d.currentCount()}")

  val b = c.decrement()
  println(s"b has ${b.currentCount()}")

  val e = c.increment(45)
  println(s"e has ${e.currentCount()}")

  val f = e.decrement(20)
  println(s"f has ${f.currentCount()}")

}

// class definitions can sit at global scope and not inside obj
// constructor
class Person(name: String, val age: Int) {
  // body of class
  // all expression executed in this body when the instance is created
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit =
    println(s"${this.name} says: Hi $name")

  // method overloading
  def greet(): Unit = println(s"Hi, I am $name")

  def greet(rep: Int): Unit = {
    var i = 0
    while (i < rep) {
      println("Hello I am $name")
      i += 1
    }
  }

  // multiple constructors (or overloading constructor)
  def this(name: String) = this(name, 0)
}


/*
  Novel and a writer

  Writer: First name, surname, year of birth
    - method fullname

   Novel: name, year of release, author (instance of Writer)
    - authorAge (age of author at year of release)
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel with new year of release
 */

class Writer(val firstName: String, val surname: String, val yearOfBirth: Int) {
  def fullName(): String =
    s"$firstName $surname"
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def authorAge(): Int =
    this.yearOfRelease - this.author.yearOfBirth

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(yearOfRelease: Int): Novel = {
    new Novel(this.name, yearOfRelease, this.author)
  }
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement counter => new counter
    - overload inc/dec to receive an amount
 */

class Counter(val count: Int) {
  def currentCount(): Int =
    this.count

  def increment(): Counter =
    new Counter(this.count + 1)

  def decrement(): Counter =
    new Counter(this.count - 1)

  def increment(value: Int): Counter = {
    if (value <= 0) this
    new Counter(this.count + value)
  }

  def decrement(value: Int): Counter =
    new Counter(this.count - value)
}
