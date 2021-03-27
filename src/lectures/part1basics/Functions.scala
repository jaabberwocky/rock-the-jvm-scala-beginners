package lectures.part1basics

object Functions extends App {
  def aFunction(aString: String): String = {
    aString * 2
  }
  println(aFunction("hello"))

  def aParamLessFunction():Int = 42
  println(aParamLessFunction)

  // string repeats without using loops
  // use recursion
  def repStringFunction(aString: String, rep: Int): String = {
    if (rep == 1) {
      return aString
    } else {
      return aString + " " + repStringFunction(aString, rep-1)
    }
  }
  println(repStringFunction("hello", 40))

  // define auxiliary func inside bigger ones
  def aBigFunc(n: Int): Int = {
    def aSmallerFunc(a: Int, b:Int): Int = {
      return a + b
    }
    return aSmallerFunc(n, n+1)
  }


  // ** Tasks **

  /*
    1. Write a greeting function (name, age) => "Hello I am $name and I am $age years old."
    2. Write a factorial function 5! = 5 * 4 * 3 * 2 * 1
    3. Fibonacci function:
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4. Write a function which tests if a number is prime.
   */

  def greeting(name: String, age: Int): String = {
    return "Hi, I am $name and I am $age years old."
  }

  def factorial(n: Int): Int = {
    if (n == 1) {
      return n
    } else {
      return n * factorial(n-1)
    }
  }

  def fibo(n:Int): Int = {
    if (n == 1 || n == 2) {
      return 1
    } else {
      return fibo(n-1) + fibo(n-2)
    }
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 3) {
      return n > 1
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return false
    }

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

  println(isPrime(8))
  println(isPrime(7))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}

