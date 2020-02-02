class Rational private(val n: Int, val d: Int) {
  require(d != 0, "denominator should not be zero")

  override def toString: String = s"($n/$d)"

  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + other.n * this.d,
      this.d * other.d
    )
}

object Rational {
  def apply(n: Int, d: Int): Rational = {
    new Rational(n, d)
  }

  // converts integer to Rational
  implicit def apply(i: Int): Rational = {
    new Rational(1, i)


  }
}

val half = Rational(1,2)

val third = Rational(3)

val sum = half + 4

val sum2 = 5 + third

val sum3 = Rational(6) + Rational(2)
