fun main() {
    val dayOfWeek = mapOf(
        "Понедельник" to 1,
        "Вторник" to 2,
        "Среда" to 3,
        "Четверг" to 4,
        "Пятница" to 5,
        "Суббота" to 6,
        "Воскресенье" to 7
    )

    println("словарь дней недели: ")
    for ((day, number) in dayOfWeek){
        println("$day - $number")
    }
}
