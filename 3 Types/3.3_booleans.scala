/*
	Релизуйте метод isCapital , который проверяет, является ли заглавной буква, стоящая на позиции pos: Int переданной строки word: String.
	Все символы строки заданы в кодировке ASCII.
*/
def isCapital(word: String, pos: Int): Boolean = {
	val hex = word.charAt(pos).toHexString
	hex > "41" && hex < "5A"
}
