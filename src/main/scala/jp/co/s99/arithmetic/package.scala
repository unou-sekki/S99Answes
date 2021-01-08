package jp.co.s99

import scala.annotation.tailrec
import jp.co.s99.P32.gcd

package object arithmetic {
  implicit class S99Int(val n: Int) extends AnyVal {
    // P31
    def isPrime: Boolean = (n>1) && (2 to Math.sqrt(n).toInt).forall(n % _ != 0)
    // P33
    def isCoprimeTo(m: Int): Boolean = gcd(n, m) == 1
    // P34
    def totientP34: Int = (1 to n).count(n.isCoprimeTo(_))
    // P35
    def primeFactor: List[Int] = {
      @tailrec
      def primeFactorRec(n: Int, primes: Stream[Int], result: List[Int]): List[Int] = {
        if (n.isPrime) (n :: result).reverse
        else if (n % primes.head == 0)
          primeFactorRec(n / primes.head, primes, primes.head :: result)
        else primeFactorRec(n, primes.tail, result)
      }
      val primes: Stream[Int] = 2 #:: Stream.iterate(3)(_ + 2).filter(_.isPrime)
      primeFactorRec(n, primes, Nil)
    }
    // P36
    def primeFactorMultiplicity: Map[Int, Int] = {
      @tailrec
      def pFMR(ls: List[Int], result: Map[Int, Int]): Map[Int, Int] = ls match {
        case Nil => result
        case h :: tail => pFMR(tail, result + (h -> (result.getOrElse(h, 0) + 1)))
      }
      pFMR(n.primeFactor, Map())
    }
    // P37
    def totientP37: Int = {
      primeFactorMultiplicity.toList.foldLeft(1)((acc, t) => acc * (t._1-1)*Math.pow(t._1, t._2).toInt)
    }
    // P40
    def goldBach: (Int, Int) = {
      val prime = 2 #:: Stream.iterate(3)(_+2).filter(_.isPrime)
      prime.takeWhile{_<n}.find{p => (n-p).isPrime} match {
        case None => throw new IllegalArgumentException
        case Some(v) => (v, n-v)
      }
    }
  }
}
