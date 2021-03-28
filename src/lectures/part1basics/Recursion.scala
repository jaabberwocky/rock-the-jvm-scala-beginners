package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n == 1) {
      return n
    } else {
      println(s"Computing factorial of $n but I first need factorial of ${n - 1}")
      val result = n * factorial(n - 1)
      println(s"Computed factorial of $n")
      return result
    }
  }

  factorial(10)
  // factorial(5000) // this will crash

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION! use recursive call as the last expression
    }
    factHelper(n, 1)
  }

  println(anotherFactorial(20000))

  // when you need loops, use tail recursion

  /*
    1. Write string concatenation function n times using tail recursion.
    2. IsPrime which is tail recursive
    3. Create a Fibonacci which is tail recursive.
   */

  def stringConcat(aString: String, repeat: Int): String = {
    @tailrec
    def concatHelper(aString:String, accumulator: String, x: Int): String = {
      if (x < 1) accumulator
      else concatHelper(aString, accumulator + aString, x - 1)
    }
    concatHelper(aString, "", repeat)
  }
  println(stringConcat("hello", 4))

  def isPrime(n: Int): Boolean = {
    if (n <= 3) {
      return n > 1
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return false
    }
    @tailrec
    def checkPrime(i: Int = 5, n: Int): Boolean = {
      if (scala.math.pow(i, 2) > n) return true
      else {
        if (n % i == 0 || n % (i + 2) == 0) {
          return false
        } else {
          return checkPrime(i + 6, n)
        }
      }
    }
    checkPrime(n = n)
  }
  println(isPrime(401023123 * 12031239))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboHelper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboHelper(i + 1, last+nextToLast, last)
    }
    if (n <= 2) 1
    else fiboHelper(2, 1, 1)
  }
  println(fibonacci(8))
}
