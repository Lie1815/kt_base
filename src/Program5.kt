fun main() {
    // Создаем список для хранения строк
    val mealStrings = mutableListOf<String>()

    // Считываем 5 строк с ввода
    println("Введите 5 строк:")
    repeat(5) {
        // Читаем строку и добавляем в список
        val input = readLine()
        if (input != null) {
            mealStrings.add(input)
        }
    }

    // Выводим обеденные строки
    println("Обеденные строки:")
    mealStrings.forEach { meal ->
        println(meal)
    }
}
