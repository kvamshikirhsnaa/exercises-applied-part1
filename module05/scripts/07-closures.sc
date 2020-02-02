val incBy1 = (x: Int) => x + 1

var more = 10
val incByMore = (x: Int) => {
  more = more + 1
  x + more
}

incBy1(10)

incByMore(10)
incByMore(10)
incByMore(10)

incByMore(12)

more = 100

incByMore(12)