fun main() {
    println("Введите число: ")
    val num = readLine()

    if (num != null) {
        val number = num.toIntOrNull()
        if (number != null) {
            if (number % 2 == 0) {
                println("Число $number четное.")
            } else {
                println("Число $number нечетное.")
            }
        } else {
            println("Пожалуйста, введите корректное число.")
        }
    }
}
