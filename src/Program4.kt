fun main() {
    println("введите символ в нижнем регистре")
    val sim = readLine()

    if (sim != null && sim.length == 1) {
    val lowerChar = sim[0]

        val upperChar = lowerChar.uppercaseChar()
        val unicodeCode = upperChar.code

        println("верхний реистр: $upperChar")
        println("симол в Unicode: $unicodeCode")
    }else {
        println("Ошибка, необходимо ввести один символ")
    }
    }
