fun main() {
    println("Введите длину списка:")
    val listSize = readLine()?.toIntOrNull()

    if (listSize == null || listSize <= 0) {
        println("Ошибка: введите положительное целое число для длины списка.")
        return
    }

    val originalList = mutableListOf<String>()
    val uniqueSet = mutableSetOf<String>()

    println("Введите $listSize элементов списка, каждый на новой строке:")
    repeat(listSize) {
        val element = readLine()
        if (element != null) {
            originalList.add(element)
            uniqueSet.add(element)
        }
    }

    println("Множество уникальных элементов в оригинальном порядке:")
    println(uniqueSet.joinToString(", "))
}
