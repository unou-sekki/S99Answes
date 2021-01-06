package jp.co.s99

object P13 {
  def encodeDirect[T](ls: List[T]): List[(Int, T)] = {
    if (ls.isEmpty) Nil
    else {
      val (packed, next) = ls.span(_ == ls.head)
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}
