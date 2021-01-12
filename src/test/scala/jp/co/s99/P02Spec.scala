package jp.co.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}
import jp.co.s99.P02.penultimate

class P02Spec extends FunSpec with DiagrammedAssertions {
  describe("P02.penultimate") {
    it("for empty list(should fail)") {
      intercept[Throwable] {
        penultimate(List[Int]())
      }
    }
    it("for list has less two element(should fail)") {
      intercept[Throwable] {
        penultimate(List[Int](1))
      }
    }
    it("for list has two elements") {
      assert(penultimate(List(1, 2)) == 1)
    }
    it("for list has more than two elements") {
      assert(penultimate(List(1, 2, 3, 4)) == 3)
    }
  }
}
