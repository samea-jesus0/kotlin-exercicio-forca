// Calcular a Força

fun main(){
    println("Digite a massa (formula: F = m * a) : ")
    var m = readln().toDouble() // lendo o valor da massa
    println("Digite a aceleração: ")
    var a = readln().toDouble() // lendo o valor da aceleração

    println("A força resultante é: ${calculoForca(m, a)}")  // chamando a função para calcular e quando o resultado voltar irá ser mostrado na tela.
}

fun calculoForca(m: Double, a: Double): Double { // a função está esperando dois argumentos Double e irá retornar em Double
    var f = m * a // formula para calcular a força
    return f // devolvendo o resultado
}

