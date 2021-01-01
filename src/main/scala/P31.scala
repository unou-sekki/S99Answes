import scala.annotation.tailrec

object P31 {
  implicit class P31Int(n: Int) {
    def isPrime: Boolean = {
      @tailrec
      def isPrimeRec(divider: Int): Boolean = divider match {
        case _ if divider <= 2 => true
        case _ if n%divider == 0 => false
        case _ => isPrimeRec(divider-2)
      }
      if (n<2 || (n!=2 && n%2 == 0) || (n!=3 && n%3 == 0)) false
      else isPrimeRec(Math.ceil(Math.sqrt(n)).toInt)
    }
  }
}

