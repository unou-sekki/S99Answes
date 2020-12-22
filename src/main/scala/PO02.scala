import scala.annotation.tailrec

object PO02 {
  @tailrec
  def penultimate(seq: Seq[Int]): Int = seq match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
