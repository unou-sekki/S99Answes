package jp.co.s99

import scala.annotation.tailrec

object P01 {
  @tailrec
  def last(seq: Seq[Int]): Int = seq match {
    case h :: Nil  => h
    case _ :: tail => last(tail)
    case _         => throw new NoSuchElementException
  }
}
