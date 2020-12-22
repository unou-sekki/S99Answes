object PO7 {
  def flatten(ls: List[_]): List[Any] = ls match {
    case Nil => Nil
    case (h:List[_])::tail => flatten(h) ++ flatten(tail)
    case h::tail => h :: flatten(tail)
  }
}
