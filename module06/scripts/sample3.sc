val add2: (Int, Int) => Int = (a, b) => a + b
val add2curried = add2.curried

add2(1,2)
val addNew = add2(1, _: Int)

addNew(2)

val add3: Int => Int => Int => Int = a => b => c => a + b + c

// add3(1,2,3) can't write like for add3
add3(1)(2)(3)

val addNew1 = add3(1)
val addNew2 = addNew1(2)
val addNew3 = addNew2(3)

add3.apply(1).apply(2).apply(3)

def add3New(a: Int)(b: Int)(c: Int) = a + b + c

add3New(1)(2)(3)
add3New{ 1 }{ 2 }{ 3 }


val data = "avdge hegwe ewqhdgw ewhewgwe ewnehfds"
val grouped = data.groupBy(identity)

grouped.maxBy{ case (char, seq) => seq.length}._1








