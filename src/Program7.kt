fun main() {
    println("введите строку")
    val str = readLine()
    if (str != null){
        val lenght = str.length
        println("длина стрки: $lenght")
    }else {
        println("!!! Введена пустая строка")
    }
}