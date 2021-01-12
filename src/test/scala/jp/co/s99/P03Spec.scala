package jp.co.s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P03Spec extends FunSpec with DiagrammedAssertions {
  describe("P03.nth") {
    it("for index which is out of range(should fail)") {
      intercept[Throwable] {
        P03.nth(4, List[Int](1, 2, 3))
      }
    }
    it("for empty list(should fail)") {
      intercept[Throwable] {
        P03.nth(0, List[Int]())
      }
    }
    it("otherwise") {
      assert(P03.nth(0, List(1)) == 1)
      assert(P03.nth(0, List(1, 2, 3)) == 1)
      assert(P03.nth(1, List(1, 2)) == 2)
      assert(P03.nth(3, List(1, 2, 3, 4, 5)) == 4)
      assert(P03.nth(4, List(1, 1, 1, 1, 1)) == 1)
    }
  }
}
