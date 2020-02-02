val xs = List(1,2,3,4)
val ys = List(2,3,4,5)
val res = for {
  x <- xs
  if x % 2 == 0
  y <- ys
  if y > 3
} yield x * y

val ab = for {
  x <- xs
  if x % 2 == 0
  } yield x

val df = for {
  y <- ys
  if (y > 3)
  } yield y

val a: List[Int] = List(1,2,3,4,5)




