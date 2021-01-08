package jp.co.s99

import arithmetic.S99Int

object P41 {
  def printGoldbachList(r: Range): Unit = {
    r.filter{n => n%2 == 0 && n > 2}.map{_.goldBach}.foreach{n => println(s"${n._1+n._2} = ${n._1} + ${n._2}")}
  }
  def printGoldbachListLimited(r: Range, limit: Int): Unit = {
    r.filter{n => n%2 == 0 && n > 2}.map{_.goldBach}.filter{_._1>limit}.foreach{n => println(s"${n._1+n._2} = ${n._1} + ${n._2}")}
  }
}
