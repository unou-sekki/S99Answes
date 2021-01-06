package jp.co.s99

object P05 {
  def reverse[T](ls: List[T]): List[T] = {
    ls.foldLeft(Nil: List[T])((acc, x) => x :: acc)
  }
}
