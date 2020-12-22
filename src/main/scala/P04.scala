import scala.annotation.tailrec

object P04 {
  def length[T](seq: Seq[T]): Int = {
    @tailrec
    def lengthRec(count: Int, seq: Seq[T]): Int = seq match {
      case Nil => count
      case _ :: tail => lengthRec(count + 1, tail)
    }
    lengthRec(0, seq)
  }
}
