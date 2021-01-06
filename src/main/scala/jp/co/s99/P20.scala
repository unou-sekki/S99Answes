package jp.co.s99

import scala.annotation.tailrec

object P20 {
  def removeAt[T](n: Int, ls: List[T]): (List[T], T) = {
    @tailrec
    def removeAtRec(c: Int, ls: List[T], pre: List[T]): (List[T], T) = (c, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h :: tail) => (pre ::: tail, h)
      case (_, h :: tail) => removeAtRec(c - 1, tail, h :: pre)
    }

    removeAtRec(n, ls, Nil)
  }
}
