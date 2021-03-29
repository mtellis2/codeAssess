import java.util.Base64

object HexString2B64 {
  val Usage = """hexStr2B64 <INPUT-HEX>"""

  def hexStr2B64(hexStr: String): String = {
    val hexBytes =
      hexStr.sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toByte)

    val outputB64Str = Base64.getEncoder().encodeToString(hexBytes)
    return outputB64Str
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println(Usage)
      println("Too few/many arguments, only use one.")
      System.exit(1)
    }

    // val hexTestString = "45766964696e74"
    val hexString = args(0)
    val outputB64 = hexStr2B64(hexString)

    println(s"${hexString} in base64 is: ${outputB64}")
  }
}
