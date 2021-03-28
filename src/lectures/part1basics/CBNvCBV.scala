package lectures.part1basics

object CBNvCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("called by value:" + x)
    println("called by value:" + x)
  }

  def calledByName(x: => Long): Unit = {
    println("called by name:" + x)
    println("called by name:" + x)
  }

  // would expect two groups of similar values, but it's not
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite() // causes stackoverflow
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite, 1) // crash because it tries to evaluate the value
  printFirst(1, infinite) // no crash because param y is never evaluated since not used

}
