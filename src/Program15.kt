fun main(){
    println("введите длинну масива ")
    val size = readLine()?.toIntOrNull()

    if (size == null || size <= 0){
        println("Ошибка: введите положительное целое число для размера массива.")
        return
    }
    val array = IntArray(size)
    println("Введите $size чисел для массива: ")
    for (i in 0 until size){
        val num = readLine()?.toIntOrNull()
        if (num != null){
            array[i] = num
        }else {
            println("ошибка: введите целое число")
            return
        }
    }

    val reverseArray =IntArray(size)
    for (i in array.indices){
        reverseArray[i] = array[size - 1 -i]
    }
    println("Новый массив, с числами в обратном порядке: ")
    println(reverseArray.joinToString(", "))
}