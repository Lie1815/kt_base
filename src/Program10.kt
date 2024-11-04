fun main() {
    print("введите возраст: ")
    val a = readLine()

    if (a != null){
        val age = a.toIntOrNull()

        if(age != null){
            when {
                age in 0..12 -> println("возраст : $age. Это ребенок ")
                age in 13..17 -> println("возраст: $age. это подросток")
                age in 18..64 -> println("Возраст: $age лет. Это взрослый.")
                age >= 65 -> println("Возраст: $age лет. Это пожилой человек.")
                else -> println("Некорректный возраст.")
            }
        } else {
            println("Пожалуйста, введите корректное число для возраста.")

            }
        }
    }

