class Rational private (val n: Int, val d: Int) {
  println("making rational number")
  require(d != 0, "denominator should not zero")

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble/d) < (other.n.toDouble/other.d))
      this else other

  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + other.n * d, this.d * other.d
    )

  //  integer as parameter to + func
  def +(i: Int): Rational =
    this + Rational(i)  // from companion
}

object Rational {

  def apply(n: Int, d: Int): Rational = {
    println("making new rational number")
    new Rational(n, d)
  }

  def apply(d: Int): Rational = {
    println("making new rational number")
    new Rational(1, d)
  }

}

val half = Rational(1,2)
// Rational.apply it will call internally

val third = Rational(3)

val small = half min third

val sum = third + half

val sum2 = half + Rational(6)

val sum3 = half + 5

// val fourth = new Rational(1,4)
// we can't access private variables
// of class inside object using new keyword

// val sum4 = 5 + half won't work
// for this we need to use implicit convertion
