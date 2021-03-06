package scalacookbook.chapter01

/**
 * Created by liguodong on 2016/6/7.
 */
object AddOwnMethodInString extends App{

  import StringUtils._
  println("HAL".increment)

  println("LIGUODONG".increment)
  println("BDCS".decrease)

  import Utils._
  println("HALS".increment2)

}


//Put the implicit class in an object
object StringUtils {
  implicit class StringImprovements(val s: String) {
    def increment = s.map(c => (c + 1).toChar)
    def decrease = s.map(c => (c - 1).toChar)
  }
}

//Put the implicit class in a package object
package object Utils {
  implicit class StringImprovementsUtils(val s: String) {
    def increment2 = s.map(c => (c + 1).toChar)
  }
}

