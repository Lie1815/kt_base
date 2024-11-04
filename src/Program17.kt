fun main(){
    println("введите количество элементов для первого множества")
    val firstSize = readLine()?.toIntOrNull()

    if (firstSize == null || firstSize <= 0 ) {
        println("введите положительное число")
        return
    }
    val firstSet = mutableSetOf<String>()
    println("введите элементы для первого множества: ")
    repeat(firstSize){
        val element = readLine()
        if (element != null) {
            firstSet.add(element)
        }
    }
    println("введите количество элементов для первого множества")
    val seconSize = readLine()?.toIntOrNull()

    if (seconSize == null || firstSize <= 0 ) {
        println("введите положительное число")
        return
    }
    val secondSet = mutableSetOf<String>()
    println("введите элементы для первого множества: ")
    repeat(seconSize) {
        val element = readLine()
        if (element != null) {
            secondSet.add(element)
        }
    }
    val unionSet = firstSet union secondSet
    println("Обьединение двух множеств: ")
    println(unionSet.joinToString(", "))
}