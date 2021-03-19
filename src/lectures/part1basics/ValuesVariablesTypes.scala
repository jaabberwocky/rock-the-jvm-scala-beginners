package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // val are immutable <= similar to constants
  // types of val are optional, compiler infers the type from the RHS

  val aString: String = "hello"
  val anotherString = "goodbye"

  println(s"Two strings: $aString and $anotherString") // string interpolation

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 46
  val aLong: Long = 1231231123
  val aFloat: Float = 2.0f
  val aDouble: Double = 12313.23

  // variables <== mutable
  var aVariable: Int = 6
  aVariable = 499 // side effects

}
