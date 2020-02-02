def multiplyMethod(a: Int, b: Int): Int = a * b

// lambda function
val multiplyFunction: (Int, Int) => Int = (a, b) => a * b

def mul(a: Int, b: Int) = a * b

mul(4,5)

(a: Int, b: Int) => a * b

(4,5)

val mul2: (Int, Int) => Int = (a, b) => a * b

mul2(4,5)

val mul3 = (a: Int, b: Int) => a * b

mul3(4,5)


multiplyMethod(2, 3)

multiplyFunction(2, 3)


val nums = (1 to 5).toList

nums.map(x => x * x)

nums.map(x => x * 3)

nums.map(x => x % 2 == 0)

nums.filter(x => x % 2 == 0)

nums.filterNot(x => x % 2 == 0)