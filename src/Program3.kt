fun main() {
    println("Введите первый символ:")

    val char1 = readLine()?.singleOrNull() ?: return
    println("Введите второй символ:")

    val char2 = readLine()?.singleOrNull() ?: return

    val codePoint1 = char1.code

    val codePoint2 = char2.code

    val difference = codePoint1 - codePoint2

    println("Unicode для '$char1': $codePoint1")

    println("Unicode для '$char2': $codePoint2")

    println("Разность Unicode: $difference")
}
