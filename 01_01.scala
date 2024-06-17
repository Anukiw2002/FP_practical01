object AreaCalculator {
  def Area(r: Int): Double = math.Pi * r * r

  def main(args: Array[String]): Unit = {
    println(Area(5))
  }
}
