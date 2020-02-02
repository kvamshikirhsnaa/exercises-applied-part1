import scala.annotation.tailrec

val arr = Array()

val arr2 = Array.empty[Int]

val arr3 = Array.empty[String]

val arr4 = Array(1,2,3,4,5)


val res =
  try {
    arr3.head
  }
  catch {
    case _: NoSuchElementException => "Array is empty"
  }
  finally {
    println("abcd")
    "hdkeir"
  }

val res2 =
  try {
    arr4.head
  }
  catch {
    case _: NoSuchElementException => "Array is empty"
  }
  finally {
    "hdkeir"
    println("abcd")
  }

def greet(n: Int): Unit = {
  var x = 0
  while (x < 5) {
    println("Hello")
    x += 1
  }
}

greet(5)

@tailrec
def greet2(n: Int, curr: Int = 0): Unit = {
  if (curr < n){
    println("Hello")
    greet2(n, curr + 1)
  }
}

greet2(5)
