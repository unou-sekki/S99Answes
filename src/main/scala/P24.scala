object P24 {
  def lotto(count: Int, max: Int): List[Int] = {
    if (count == 0) Nil
    else {
      val r = scala.util.Random.nextInt(max+1)
      r::lotto(count -1, max)
    }
  }

}
