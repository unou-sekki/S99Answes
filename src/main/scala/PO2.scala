import scala.annotation.tailrec

object PO2 {
  @tailrec
  def penultimate(seq: Seq[Int]): Int = seq match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
