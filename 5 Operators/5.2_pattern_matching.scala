/*
	На вход программе подается имя пользователя, email и список его коммитов, возможно пустой).

	Считанные построчно данные лежат в списке input. После имени мог стоять как пробел, так и перенос строки, каждый коммит был в отдельной строчке.
	Другими словами, первые два элемента списка это либо имя и электронная почта, либо имя с почтой через пробел и первый коммит.
	Используя pattern-matching и регулярные выражения напечатайте через пробел имя пользователя и домен электронной почты (все, что стоит после собаки).
	Для некорректных данных напачатайте "invalid".

	Подсказка: регулярное выражение для имени [a-zA-Z]+, для электронного адреса \\w+@\\w+\.\\w+ .
	Для извлечения параметров используйте круглые скобки, чтобы объявить группы в нужных местах.
*/
val nameRegex = "([a-zA-Z]+)".r
val emailRegex = "\\w+@(\\w+\\.\\w+)".r
val nameWithEmailRegex = "([a-zA-Z]+) \\w+@(\\w+\\.\\w+)".r

val result = input match {
	case List(nameRegex(name), emailRegex(domain), _*) => s"$name $domain"
	case List(nameWithEmailRegex(name, domain), _*) => s"$name $domain"
	case _ => "invalid"
}

println(result)