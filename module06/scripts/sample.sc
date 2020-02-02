import java.io.File
import scala.io.Source

def fileContainsQuestion(file: File): Boolean = {

  val source = Source.fromFile(file)
  try {
    source.getLines().toSeq.headOption.map{ rec =>
      rec.trim.endsWith("?")
    }.getOrElse(false)
  } finally source.close()
}

val projectDir = "C:\\Users\\Kenche.vamshikrishna\\Desktop\\Scala\\exercises-applied"

val fileLoc = new File(projectDir)

for (name <- Seq("caesar.shkspr", "hamlet.shkspr", "romeo.shkspr")) {
  val file = new File(fileLoc, name)
  println(s"$name, ${fileContainsQuestion(file)}" )
}

def emphasizeFileContents(file: File): String ={
  val source = Source.fromFile(file)
  try {
    source.getLines().toSeq.headOption.map{ rec =>
      rec.trim.toUpperCase
    }.getOrElse("")
  } finally source.close
}

for (name <- Seq("caesar.shkspr", "hamlet.shkspr", "romeo.shkspr")) {
  val file = new File(projectDir, name)
  println(s"$name, ${emphasizeFileContents(file)}")
}