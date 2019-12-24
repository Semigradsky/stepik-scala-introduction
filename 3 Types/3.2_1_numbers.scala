/*
	Дано:
		weight: BigDecimal  - вес имеющегося картофеля.
		potatoWaterRatio: Double  - (0,1), доля воды в картофеле до того, как из него сделали чипсы.
		crispsWaterRatio: Double - (0,1), доля воды в чипсах.
	Найдите массу чипсов, которая получится.

	Для этого реализуйте следующий метод:
	`def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal`

	Ответ нужно дать с точностью до пяти знаков после запятой.
*/
import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
	(weight * (1 - potatoWaterRatio) / (1 - crispsWaterRatio)).setScale(5, HALF_UP)
}
