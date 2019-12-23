/*
    Ваша задача - рассчитать плотность вероятности [нормального распределения](https://ru.wikipedia.org/wiki/Нормальное_распределение)
    по заданным математическому ожиданию mu (μ), среднеквадратичному отклонению sigma (σ) и значению случайной величины x.

    Реализуйте метод `def normalDistribution(mu: Double, sigma: Double, x: Double): Double`.
*/
def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    1 / (sigma * Math.sqrt(2*Math.PI)) * Math.exp(-Math.pow(x - mu, 2)/(2*sigma*sigma))
}
