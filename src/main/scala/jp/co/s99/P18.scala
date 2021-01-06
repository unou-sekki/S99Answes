package jp.co.s99

import scala.annotation.tailrec

object P18 {
  def slice[T](s: Int, g: Int, ls: List[T]): List[T] = {
    @tailrec
    def sliceRec(c: Int, ls: List[T], result: List[T]): List[T] = (c, ls) match {
      case (_, Nil) => result.reverse
      case (_, _ :: _) if g <= c => result.reverse
      case (_, h :: tail) if s <= c => sliceRec(c + 1, tail, h :: result)
      case (_, _ :: tail) => sliceRec(c + 1, tail, result)
    }

    sliceRec(0, ls, Nil)
  }
}
