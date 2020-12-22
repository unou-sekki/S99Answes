import scala.annotation.tailrec

object PO01 extends App{
  @tailrec
  def last(seq: Seq[Int]): Int = seq match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}
