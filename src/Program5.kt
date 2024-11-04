fun main() {
    val lines = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите строку $i:")
        val line = readLine()
        if (line != null) {
            lines.add(line)
        }
    }

    val result = lines.joinToString(" ")
    println("Результат: $result")
}


