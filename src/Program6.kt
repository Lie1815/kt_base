fun main() {
    println("введите строку: ")
    val str = readLine()
    if (str != null && str.length >= 2){
        val elem2 = str.substring(0, 2)
        val remainingString = str.substring(2)
        val result = remainingString + elem2
        println("результат: $result")
    } else {
        println("Ошибка: введите строку длиной не менее 2 символов")
    }
}
