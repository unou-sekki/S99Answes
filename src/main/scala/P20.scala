object P20 {
  def removeA[T](n: Int, ls: List[T]): (List[T], T) = {
    if (n < 0) throw new NoSuchElementException
    else (n, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h::tail) => (tail, h)
      case (_, h::tail) =>
        val (t, e) = removeA(n-1, tail)
        (h::t, e)

    }
  }
}
