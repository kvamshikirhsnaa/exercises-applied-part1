import scala.annotation.tailrec

val args = Array.empty[String] // ("myfile.txt")

val fileName = if (args.length > 0) args(0) else "default.txt"

val x = -10

val res = if (x > 0) x else false


val fileName2 =
  try {
    args.head
  }
  catch {
    case _: NoSuchElementException => "default.txt"
  }
  finally {
    println("Wheeeee")
    "the finally block"
  }


def greet(n: Int): Unit = {
  var x = 0
  while (x < 5) {
    println("Hello")
    x = x + 1
  }
}

greet(5)

@tailrec
def greet2(n: Int, curr: Int = 0): Unit = {
  if (curr < n) {
    println("Hello")
    greet2(n, curr + 1)
  }
}

greet2(5)

(1 to 3).flatMap(i => (1 to 3).map(j => i * j))
