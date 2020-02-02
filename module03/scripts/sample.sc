class Rational(val n: Int, val d: Int){
  println("my demo")

  require(d != 0, "denominator is zero")

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble/d) < (other.n.toDouble/other.d))
      this else other


  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + other.n * this.d, d * other.d
    )

  // auxiliary constructor

  def this(i: Int) = this(1,i)

}

val half = new Rational(1,2)

val fifth = new Rational(1,5)

val small = half min fifth

val sum = half + fifth

val sixth = new Rational(6)

val small2 = sixth min fifth

val sum2 =  fifth + new Rational(3)

val divbyzero = new Rational(1,0)
