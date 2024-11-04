fun main(){
    print("введите число от 1 до 7: ")
    val num = readLine()

    if (num != null){
        val week = num.toIntOrNull()

        when(week){
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Ошибка: введите число от 1 до 7.")
        }
    }
}

