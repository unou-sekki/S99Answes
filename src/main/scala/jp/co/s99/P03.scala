package jp.co.s99

import scala.annotation.tailrec

object P03 {
  @tailrec
  def nth[T](n: Int, seq: Seq[T]): T = seq match {
    case h :: _ if n == 0   => h
    case _ :: tail if n > 0 => nth(n - 1, tail)
    case _                  => throw new NoSuchElementException
  }

}
