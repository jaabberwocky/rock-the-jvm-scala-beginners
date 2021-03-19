package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println( 2 + 3 * 4)

  // comparisons
  println(1 == x)

  var aVariable = 2
  aVariable += 1
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // IF are expressions and not constructs
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3

  // avoid while loops
  // everything in scala is an expression!

  val aWeirdValue: Unit = (aVariable = 3) // Unit === void or None
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z> 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  // 1. difference between "hello world" and println("hello world")?
  // first one is value of type String, println is an expression with a side effect, returning a Unit

  // 2. what is the value of the below
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
  
}
