object FahrenheitCalculator {
  def Fah(Cel : Double) : Double = Cel * 1.8000 + 32.00

  def main(args: Array[String]): Unit = {
    println(Fah(35))
  }
}