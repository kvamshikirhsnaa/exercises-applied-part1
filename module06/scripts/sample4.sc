import java.io.File
import scala.io.Source

def withFileContents[A](file: File, default: A)(fn: String => A): A = {
  val source = Source.fromFile(file)

  try {
    source.getLines.toSeq.headOption.map(rec => fn(rec)).
      getOrElse(default)
  } finally source.close

}

val projectDir = "C:\\Users\\Kenche.vamshikrishna\\Desktop\\Scala\\exercises-applied"

val hamlet = new File(projectDir, "hamlet.shkspr")

withFileContents(hamlet, false)(_.trim.endsWith("?"))
withFileContents(hamlet, " ")(_.trim.toUpperCase)

withFileContents(hamlet, 'e'){ rec =>
  val letters = rec.trim.toLowerCase.filterNot(_ == ' ').toSeq
  val grouped = letters.groupBy(identity)
  grouped.maxBy{ case (char, seq) => seq.length }._1
}

val data = " aheFSE rHEWur hWEFFbW eweHErVse  ewe HWqReR "

val letters1 = data.trim.toLowerCase.filterNot(_ == ' ').toSeq
val letters2 = data.trim.toLowerCase.filterNot(_ == ' ')

letters1.groupBy(identity)
letters2.groupBy(identity)
