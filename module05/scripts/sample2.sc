val nums = (1 to 10).toList

nums.map(x => x * 2)
nums.map(x => x > 5)
nums.span(x => x % 3 != 0)
nums.span(x => x % 4 != 0)
nums.span(x => x % 6 != 0)
nums.partition(x => x % 2 == 0)

val (a,b) = nums.partition(x => x % 2 == 0)

a.head
a.tail
b.head
b.tail

val g = List(1,2,3,4,5,6,7,8)

val v = g.sliding(3)

v.foreach(println)

for (v <- g.sliding(4)) {
  v.foreach(println)
}

for (v <- g.sliding(4)) {
  v(0)
}

def compareNeighbours(xs: List[Int], compare: (Int, Int) => Int): List[Int] = {
  for (pair <- xs.sliding(2)) yield {
    compare( pair(0), pair(1))
  }
}.toList

compareNeighbours(g,(a, b) => a + b)

compareNeighbours(nums,(a, b) => (a - b).abs)