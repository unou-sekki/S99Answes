package jp.co.s99

import scala.annotation.tailrec

object P28 {
  def lSort[T](ls: List[List[T]]): List[List[T]] = {
    ls.sortBy(_.length)
  }

  def lSortFreq[T](ls: List[List[T]]): List[List[T]] = {
    @tailrec
    def pack(ls: List[List[T]], result: List[(List[List[T]], Int)]): List[(List[List[T]], Int)] = ls match {
      case Nil => result
      case list@h :: _ =>
        val (packed, tail) = list.span(h.length == _.length)
        pack(tail, (packed, packed.length) :: result)
    }

    pack(lSort(ls), Nil).sortBy(_._2).flatMap(_._1)
  }
}
