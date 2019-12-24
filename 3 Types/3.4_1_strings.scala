/*
	Cчитайте из консоли два числа: startIndex и endIndex. Считайте строку str.

	Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex включительно.
*/
import scala.io.StdIn

object Example extends App {
	def partReverse(startIndex: Int, endIndex: Int, str: String): String = {
		str.substring(0, startIndex) + str.substring(startIndex, endIndex + 1).reverse + str.substring(endIndex + 1)
	}

	val indexes = StdIn.readLine.split(" ").map(_.toInt)
	println(partReverse(indexes(0), indexes(1), StdIn.readLine()))
}
