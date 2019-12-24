/*
	Считайте с клавиатуры число n и выведите на экран все упорядоченные пары
	взаимно простых чисел от 1 до n, не включая n, в лексикографическом порядке.
*/
import scala.io.StdIn

object Example extends App {
	def printPairs(n: Int): Unit = {
		for {
			i <- 1 until n
			j <- 1 until n
		} {
			if (BigInt(i).gcd(BigInt(j)) == 1) {
				println(s"$i $j")
			}
		}
	}

	printPairs(StdIn.readInt())
}
