package jp.co.s99

import jp.co.s99.P20.removeAt

import scala.annotation.tailrec

object P23 {
  def randomSelect[T](n: Int, ls: List[T]): List[T] = {
    @tailrec
    def randomSelectRec(c: Int, ls: List[T], result: List[T]): List[T] = (c, ls) match {
      case (0, _) => result
      case (_, list) =>
        val r = scala.util.Random.nextInt(list.length)
        val (rest, v) = removeAt(r, list)
        randomSelectRec(c - 1, rest, v :: result)
    }

    randomSelectRec(n, ls, Nil)
  }
}
