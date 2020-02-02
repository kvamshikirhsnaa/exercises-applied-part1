import java.io.File

val a = Int.MaxValue
val b = Int.MinValue

def max1(numbers : List[Int]) = {
  var maxSoFar = Int.MinValue

  for (n <- numbers) {
    if (n > maxSoFar) maxSoFar = n
    }
  maxSoFar
}

  max1(List(1, 2, 3, 4, 5)) // should be (5)
  max1(List(5, 4, 3, 2, 1)) // should be (5)
  max1(List(-5, -1, -3)) // should be (-1)
  max1(Nil) // should be (Int.MinValue)

// more optimized way

def max2(numbers: List[Int]): Int = {
  if (numbers.isEmpty) Int.MinValue

  else {
    val maxOfRest = max2(numbers.tail)
    if (numbers.head > maxOfRest)
      numbers.head else maxOfRest
  }
}

max2(List(1, 2, 3, 4, 5)) // should be (5)
max2(List(5, 4, 3, 2, 1)) // should be (5)
max2(List(-5, -1, -3)) // should be (-1)
max2(Nil) // should be (Int.MinValue)

def listShakespeareFile(dirPath: String): Array[String] = {
  val fileList = (new java.io.File(dirPath)).listFiles

  for (file <- fileList if file.getName.endsWith(".shkspr")) yield file.getName
}



def firstLineOfFile(filePath: String) : String = {
  // replace with the real implementation
  io.Source.fromFile(filePath).getLines.next

}

firstLineOfFile("caesar.shkspr")