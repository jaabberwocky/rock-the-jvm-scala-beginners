package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  // Java language features
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.endsWith("Scala"))
  println(str.replace('e', '3'))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String Interpolators

  // s-interp
  val name = "David"
  val age = 12
  val futureAge = 26
  val greeting = s"Hello, my name is $name and I am $age years old. I will turn $futureAge in ${futureAge - age} years."
  println(greeting)

  // f-interp
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.4f burgers per minute" // 2.4f = 2 digits min and 4 digits precision
  println(myth)

  // raw-interp
  println(raw"This is a \n newline") // printed literally
  println("This is a \n newline")

}
