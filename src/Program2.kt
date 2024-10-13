fun main() {
    var simvol: Char
    do {
        println("введите символ: ")
        val simvol = readln()!![0]

        if (simvol.isLetter()){
            println("$simvol являеться буквой")
        }else{
            println("$simvol не являеться буквой")
        }
    }while (!simvol.isLetter())
}