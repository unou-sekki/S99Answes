package jp.co.s99

object P27 {

  import P26.combinations

  def group3[T](ls: List[T]): List[List[List[T]]] =
    for {
      a <- combinations(2, ls)
      noA = ls diff a
      b <- combinations(3, noA)
    } yield List(a, b, noA diff b)

  def group[T](size: List[Int], ls: List[T]): List[List[List[T]]] = size match {
    case Nil => List(Nil)
    case h :: tail => combinations(h, ls).flatMap(v => group(tail, ls diff v).map(v :: _))
  }
}
