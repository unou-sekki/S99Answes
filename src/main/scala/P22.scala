import scala.annotation.tailrec

object P22 {
  def range(start: Int, end: Int): List[Int] = {
    @tailrec
    def rangeRec(e: Int, result: List[Int]): List[Int] = {
      if (start > e) result else rangeRec(e -1, e :: result)
    }
    rangeRec(end, Nil)
  }
}
