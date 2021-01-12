package jp.co.s99

import org.scalatest.{FunSpec, DiagrammedAssertions}
import jp.co.s99.P01.last

class P01Spec extends FunSpec with DiagrammedAssertions {
  describe("P01.last") {
    it("for empty list(should fail)") {
      intercept[Throwable] {
        last(List[Int]())
      }
    }
    it("for list has one element") {
      assert(last(List(1)) == 1)
    }
    it("for list has more than one element") {
      assert(last(List(1, 2, 3, 4)) == 4)
    }
  }
}
