import P23.randomSelect

object P25 {
  def randomPermute[T](ls: List[T]): List[T] = {
    randomSelect(ls.length, ls)
  }
}
