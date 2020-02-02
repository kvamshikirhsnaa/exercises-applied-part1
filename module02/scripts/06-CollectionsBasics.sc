val array1: Array[Int] = Array(1,2,3)
val list1: List[String] = List("scooby", "dooby", "doo")

val array2 = Array(1,2,3)
val list2 = List("scooby", "dooby", "doo")

list1 ++ list2
array1 ++ array2
(list1 ++ list2).toArray

def squareRootsOf(xs: List[Int]): List[Double] = {
  for (x <- xs) yield math.sqrt(x)
}

squareRootsOf(List(1,2,3,4,5,6))

// type parameters are not optional, this will not compile:
// def badSquareRootsOf(xs: List): List = {
//   for (x <- xs) yield math.sqrt(x)
// }

// List initializers

val lista = List(1,2,3)

val listb = 4 :: 5 :: 6 :: Nil

val listc = lista ::: listb

val listd = Array(lista ::: listb)

val liste = lista :: listb

val listf = Array(lista :: listb)

println(listb)

println(listc)

println(listd)

println(liste)

println(listf)
// common beginner mistake:

// val listd = lista :: listb

val v = Vector(1,2,3,4)

def squareRootOfAll(xs: Seq[Int]): Seq[Double] =
  xs.map(x => math.sqrt(x))

squareRootOfAll(v)
squareRootOfAll(listc)
squareRootOfAll(array2)



val set1 = Set(1,2,3,1,2,4,5)

// squareRootOfAll(set1) // does not compile
