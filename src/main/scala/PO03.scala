import scala.annotation.tailrec

object PO03 {
  @tailrec
  def nth[T](n: Int, seq: Seq[T]): T = (n, seq) match {
    case (0, h::_) => h
    case (n, _::tail) => nth(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}
