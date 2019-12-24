/*
	Напишите обобщенный метод middle возвращающий средний элемент из любого экземпляра Iterable[T]
	Если элементов четное число, необходимо выбрать элемент с бОльшим порядковым номером.
*/
def middle[T](data: Iterable[T]): T = {
	data.splitAt(data.size / 2)._2.head
}