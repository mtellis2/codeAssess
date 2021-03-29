import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._

class MainSpec extends FunSuite {
  val examples =
    Table(
      ("value", "expectedOutput"),
      (0, BigInt("0")),
      (1, BigInt("1")),
      (10, BigInt("364")),
      (20, BigInt("46345")),
      (30, BigInt("5702854")),
      (42, BigInt("1836311858")),
      (55, BigInt("956722025983")),
      (76, BigInt("23416728348467606")),
      (88, BigInt("7540113804746346338")),
      (90, BigInt("19740274219868223074"))
    )

  forAll(examples) { (value: Int, expectedOutput: BigInt) =>
    test(s"Test of specialMath2(${value})") {
      assert(SpecialMath.specialMath2(value) == expectedOutput)
    }
  }
}
