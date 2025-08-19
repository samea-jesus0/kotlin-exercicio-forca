fun main(){
    println("Quantos cigarros você fuma? ")
    var cigarrosDia = readln().toInt()

    println("Há quantos anos você fuma? ")
    var anosFumando = readln().toInt()

    var totalCigarros = (anosFumando * 365) * cigarrosDia // Aqui nós vamos pegar os anos e multiplicar pelos dias que tem no ano, para depois conseguirmos saber a quantidade de cigarros
    // fumados por dia

    // quem fuma perde 10 minutos a cada cigarro
    var minutosPerdidos = totalCigarros * 10 // aqui temos a quantidade de cigarros feito acima multiplicadas por minutos para sabermos a quantidade de minutos

    var qtdDiasPerdidos = minutosPerdidos / (24 * 60 ) // como estamos usando minutos, temos que transformar a quantidade de horas no dia em minutos também, para sabermos a quantidade
    // de dias

    print("A quantidade de dias perdidos é de: ${qtdDiasPerdidos}")
}