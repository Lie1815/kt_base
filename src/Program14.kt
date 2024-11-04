fun main() {
    println("введите число для поиска в массиве: ")
    val numFind = readLine()?.toIntOrNull()

    if(numFind == null) {
        println("Ошибка: введите целое число.")
        return
    }
    println("введите количество элементов массива: ")
    val size = readLine()?.toIntOrNull()

    if (size == null || size <= 0){
        println("Ошибка: введите положительное целое число для размера массива.")
        return
    }
    val array = IntArray(size)
    println("Введите $size элементов массива: ")
    for (i in 0 until size) {
        val num = readLine()?.toIntOrNull()
        if (num != null) {
            array[i] = num
        } else {
            println("ошибка: введдите корректное целое число.")
            return
        }
    }
    val containsnum = array.contains(numFind)
    println(containsnum)
}
