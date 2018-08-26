package learner

import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader

object ExceptionSample {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
        try {
          throw new IllegalArgumentException()
        } catch {
          case ex: IllegalArgumentException => {
            println("Illegal argument exception")
          }
        }
      }

      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}