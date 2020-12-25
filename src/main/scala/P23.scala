import scala.annotation.tailrec

object P23 {
  def randomSelect[T](n: Int, ls: List[T]): List[T] = {
    @tailrec
    def randomSelectRec(c: Int, ls: List[T], result: List[T]): List[T] = (c, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, _) => result
      case (_, list) =>
        val r = scala.util.Random.nextInt(list.length)
        val (v, pre, post) = selectAndSplit(r, list, Nil)
        randomSelectRec(c-1, pre:::post, v::result)
    }
    randomSelectRec(n, ls, Nil)
  }
  @tailrec
  def selectAndSplit[T](n: Int, curL: List[T], pre: List[T]): (T, List[T], List[T]) = (n, curL) match {
    case (_, Nil) => throw new NoSuchElementException
    case (1, h::tail) => (h, pre.reverse, tail)
    case (_, h::tail) => selectAndSplit(n-1, tail, h::pre)
  }
}
