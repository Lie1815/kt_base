fun main() {
    println("Введите число: ")


    val i = readLine()
    val countDown: Int? = i?.toIntOrNull()

    if (countDown != null && countDown > 0) {
        for (i in countDown downTo 1) {
            println(i)
            Thread.sleep(1000)
        }
        println("Старт!")
    } else {
        println("Ошибка: введите положительное целое число.")
    }
}
