package jp.co.s99

import arithmetic.S99Int

object P39 {
  def listPrimesInRange(r: Range): List[Int] = {
    (2 #:: Stream
      .iterate(3)(_ + 2)
      .filter(p => p.isPrime && (r.head < p && p <= r.last))).toList
  }
}
