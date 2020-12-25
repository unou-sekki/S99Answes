object P12 {
  def decode[T](ls: List[(Int, T)]): List[Any] = {
    ls.flatMap(h => List.fill(h._1)(h._2))
  }
}
