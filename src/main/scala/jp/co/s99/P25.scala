package jp.co.s99

import jp.co.s99.P23.randomSelect

object P25 {
  def randomPermute[T](ls: List[T]): List[T] = {
    randomSelect(ls.length, ls)
  }
}
