import java.io.{File, PrintWriter}

val x = 1 + 2

println(x)

val un = println(x)

un == ()

class Writeroutput(write: PrintWriter) {
  def write(s: String): Unit = write.println(s)
}

val ex3 = new PrintWriter(new File("C:\\Users\\Kenche.vamshikrishna\\Desktop\\Spark\\ex3.txt"))

val out1 = new Writeroutput(ex3)

out1.write("hello")
out1.write("how are you")
out1.write("what are you doing")

ex3.close()

class Writeroutput2(write: PrintWriter) {
  def write(s: String): Writeroutput2 = {
    write.println(s)
    this
  }
}

val ex4 = new PrintWriter(new File("C:\\Users\\Kenche.vamshikrishna\\Desktop\\Spark\\ex4.txt"))

val out2 = new Writeroutput2(ex4)

out2.write("hello").write("how are you").write("what are you doing")

ex4.close()