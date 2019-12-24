/*
	Посчитайте число единиц в битовой записи числа, считанного с клавиатуры, и выведите на экран.
*/
import scala.io.StdIn

object Example extends App {
	def countOnes(number: Int): BigDecimal = {
		val strNumber = number.toBinaryString
		var count = 0

		for (i <- 1 to strNumber.length) {
			if (strNumber.charAt(i - 1) == '1') {
				count = count + 1
			}
		}

		count
	}

	println(countOnes(StdIn.readInt))
}
