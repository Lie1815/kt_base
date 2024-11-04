fun main() {
    println("Введите число n:")
    val n = readLine()!!.toInt()

    val doubledValues = mutableListOf<Int>()

    for (i in 1 until n) {
        doubledValues.add(i * 2)
    }

    println("Удвоенные значения от 1 до $n (не включая $n): $doubledValues")
}
