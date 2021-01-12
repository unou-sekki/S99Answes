package jp.co.s99

object P26 {
  def combinations[T](n: Int, ls: List[T]): List[List[T]] = (n, ls) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, _)   => List(List())
    case (_, list @ h :: tail) =>
      if (list.length == n) List(list)
      else combinations(n - 1, tail).map(h :: _) ::: combinations(n, tail)

  }
}
