package jp.co.s99

object P14 {
  def duplicate[T](ls: List[T]): List[T] = ls.foldLeft(Nil: List[T])((r, h) => r :+ h :+ h)
}
