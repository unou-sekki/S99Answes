package jp.co.s99

import scala.annotation.tailrec

object P21 {
  def insertAt[T](word: T, n: Int, ls: List[T]): List[T] = {
    val (f, b) = split(n, ls)
    f ::: word :: b
  }

  def split[T](n: Int, ls: List[T]): (List[T], List[T]) = {
    @tailrec
    def splitRec(c: Int, divided: List[T], ls: List[T]): (List[T], List[T]) =
      (c, ls) match {
        case (_, Nil)       => (divided, ls)
        case (1, h :: tail) => ((h :: divided).reverse, tail)
        case (_, h :: tail) => splitRec(c - 1, h :: divided, tail)
      }

    splitRec(n, Nil, ls)
  }
}
