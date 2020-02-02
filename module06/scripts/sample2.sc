import java.io.File
import scala.io.Source

def withFileContents[A](file: File, fn: String => A, default: A): A = {
  val source = Source.fromFile(file)
  try {
    source.getLines.toSeq.headOption.map(rec => fn(rec)).
      getOrElse(default)
  } finally source.close
}

val projectDir = "C:\\Users\\Kenche.vamshikrishna\\Desktop\\Scala\\exercises-applied"

val file = new File(projectDir)

for (name <- Seq("caesar.shkspr", "hamlet.shkspr", "romeo.shkspr") ){
  val file = new File(projectDir, name)
  val result = withFileContents(file, _.trim.endsWith("?"), false)
  println(s"$name, $result")

}

for (name <- Seq("caesar.shkspr", "hamlet.shkspr", "romeo.shkspr") ){
  val file = new File(projectDir, name)
  val result = withFileContents(file, _.trim.toUpperCase, "")
  println(s"$name, $result")
}

val hamlet = new File(projectDir, "hamlet.shkspr")

withFileContents(hamlet, { rec =>
  val letters = rec.trim.toLowerCase.filterNot(_ == ' ').toSeq
  val grouped = letters.groupBy(identity)
  grouped.maxBy{ case (char, seq) => seq.length}._1
}, 'e')