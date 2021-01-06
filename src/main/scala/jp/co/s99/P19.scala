package jp.co.s99

import scala.annotation.tailrec

object P19 {
  @tailrec
  def rotate[T](n: Int, ls: List[T]): List[T] = {
    val rotateN = if (ls.isEmpty) 0 else n % ls.length
    if (rotateN < 0) {
      rotate(n + ls.length, ls)
    }
    else splitAndJoin(n, ls, Nil)
  }

  @tailrec
  def splitAndJoin[T](n: Int, ls: List[T], result: List[T]): List[T] = (n, ls) match {
    case (_, Nil) => result.reverse
    case (0, _) => ls ::: result.reverse
    case (_, h :: tail) => splitAndJoin(n - 1, tail, h :: result)
  }
}
