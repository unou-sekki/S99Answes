package jp.co.s99

object P08 {
  def compress[T](ls: List[T]): List[T] = {
    ls.foldLeft(List[T]())((h, r) => {
        if (h.isEmpty || h.head != r) r :: h else h
      })
      .reverse
  }
}
