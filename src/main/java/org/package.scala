package object org {
  import scala.language.implicitConversions
  object Implicits {
    implicit def string2RichString(s: String): RichString = new RichString()
    implicit def string2RichStringOps(s: String): RichStringOps = new RichStringOps()
    implicit def string2RichStringOps2(s: String): RichStringOps2 = new RichStringOps2()
  }

}

case class RichStringOps()

case class RichStringOps2()