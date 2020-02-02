var x = 10

while (x < 10) {
  println(s"the square of $x is ${x * x}")
  x += 1
}

x = 5
do {
  println(s"the square of $x is ${x * x}")
  x += 1
} while (x < 10)

while (x < 10) {
  x += 1
  x
}

def randgen(n: Int): Unit = {
  var x = 0
  while (x < n) {
    println(x)
    x = x + 1
  }
}

randgen(10)