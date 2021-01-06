package jp.co.s99

object P15 {
  def duplicateN[T](n: Int, ls: List[T]): List[T] = ls.flatMap(List.fill(n)(_))
}
