package jp.co.s99

import scala.annotation.tailrec

object P32 {
  @tailrec
  def gcd(a: Int, b: Int): Int = (a, b) match {
    case (_, 0) => a
    case (n, m) => gcd(m, n % m)
  }
}
