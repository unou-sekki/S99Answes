package jp.co.s99

import scala.annotation.tailrec

object P10 {
  def encode[T](ls: List[T]): List[(Int, T)] = {
    pack(ls).map(r => (r.length, r.head))
  }

  def pack[T](ls: List[T]): List[List[T]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = sep(Nil, ls, ls.head)
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  @tailrec
  def sep[T](packed: List[T], ls: List[T], target: T): (List[T], List[T]) = ls match {
    case Nil => (packed, Nil)
    case h :: tail if target == h => sep(h :: packed, tail, target)
    case _ :: _ => (packed, ls)
  }
}
