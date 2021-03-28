package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10)
  println(fact10)

  def savePicture(format: String = "jpg", width: Int, height: Int): Unit =
    println(s"Saving picture $format with width ($width) and height ($height)")

  savePicture(width = 800, height = 600)

}
