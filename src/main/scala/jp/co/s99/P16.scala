package jp.co.s99

import scala.annotation.tailrec

object P16 {
  def drop[T](n: Int, ls: List[T]): List[T] = {
    @tailrec
    def dropRec(count: Int, ls: List[T], result: List[T]): List[T] = (count, ls) match {
      case (_, Nil) => result.reverse
      case (1, _ :: tail) => dropRec(n, tail, result)
      case (_, h :: tail) => dropRec(count - 1, tail, h :: result)
    }

    dropRec(n, ls, Nil)
  }
}
