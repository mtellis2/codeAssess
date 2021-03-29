import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._

class MainSpec extends FunSuite {
  val examples =
    Table(
      ("value", "expectedOutput"),
      ("45766964696e74", "RXZpZGludA=="),
      ("FFFF", "//8="),
      ("FFFF12", "//8S"),
      ("0011234567", "ABEjRWc="),
      ("0000000000FF", "AAAAAAD/")
    )

  forAll(examples) { (value: String, expectedOutput: String) =>
    test(s"Test of hexStr2B64(${value})") {
      assert(HexString2B64.hexStr2B64(value) == expectedOutput)
    }
  }
}
