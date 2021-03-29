object SpecialMath {
  val Usage = """specialMath <input-int>"""

  def specialMath(value: Int): BigInt = {
    if (value == 0) {
      return 0
    } else if (value == 1) {
      return 1
    } else {
      return value + specialMath(value - 1) + specialMath(value - 2)
    }
  }

  def specialMath2(value: Int): BigInt = {
    if (value == 0) {
      return 0
    }
    if (value == 1) {
      return 1
    }

    var finalSum: BigInt = 0
    var previousSum: BigInt = 1
    var prevSum2: BigInt = 0

    for (i <- 2 to value) {
      finalSum = i + previousSum + prevSum2
      prevSum2 = previousSum
      previousSum = finalSum
    }
    return finalSum
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println(Usage)
      println("Too few/many arguments, only use one.")
      System.exit(1)
    }

    val inputVal = args(0).toInt

    // val output = specialMath(inputVal)
    val outputVal = specialMath2(inputVal)
    println(s"Input value: ${inputVal},  output value: ${outputVal}")

  }
}
