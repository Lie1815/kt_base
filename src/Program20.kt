fun main() {
    println("введите элементы списка через запятую: ")
    val elem = readLine() ?: ""

    val items = elem.split(",").map { it.trim() }

    val card = items.groupingBy { it }.eachCount()

    println("карта с уникальными значениями и их количеством: ")
    for ((key, value) in card){
        println("$key - $value")
    }
}