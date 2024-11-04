fun main() {
    println("введите количество элементов первого множества (n): ")
    val n = readLine()?.toIntOrNull()
    if (n ==null || n <= 0){
        println("Ошибка: введите положительное целое число для n")
        return
    }
    val firstSet = mutableSetOf<String>()

    println("введите $n элементов первого множества (каждый элемент на новой строке)")
    repeat(n){
        val element = readLine()
        if (element != null){
            firstSet.add(element)
        }
    }
    println("введите количество элементов первого множества (n): ")
    val m = readLine()?.toIntOrNull()
    if (m ==null || m <= 0){
        println("Ошибка: введите положительное целое число для n")
        return
    }
    val secondSet = mutableSetOf<String>()

    println("введите $m элементов первого множества (каждый элемент на новой строке)")
    repeat(m){
        val element = readLine()
        if (element != null){
            secondSet.add(element)
        }
    }
    val intesectionSet = firstSet intersect secondSet

    println("общие элементы двух множеств: ")
    if (intesectionSet.isEmpty()){
        println("нет общих элементов")
    }else{
        println(intesectionSet.joinToString(", "))
    }

}


