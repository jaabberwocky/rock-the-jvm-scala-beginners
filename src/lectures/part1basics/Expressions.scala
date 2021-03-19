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

  
}
