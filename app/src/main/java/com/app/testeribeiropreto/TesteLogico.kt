package com.app.testeribeiropreto

//  EXERCICIO 01
fun fibonacciTest(inserNum: Int) {
    val listaNum = mutableListOf(
        0, 1
    )
    while (listaNum.last() <= inserNum!!) {
        val proxNum = listaNum[listaNum.size - 1] + listaNum[listaNum.size - 2]
        listaNum.add(proxNum)
    }

    if (listaNum.contains(inserNum)) {
        listaNum.map { resultado ->
            if (listaNum.contains(resultado)) {
                println("$resultado pertence à sequencia de Fibonacci.")
            }
        }
    } else {
        println("$inserNum não pertence à sequencia de Fibonacci")
    }
}

//  EXERCICIO 02

fun stringLeitorTest(texto: String, letra: Char): Int{
    return texto.count{it == letra}
}


// EXERCICIC 03

fun somaLista(){
    var k = 1
    var soma = 0
    val maxNumero = 12
    while(k < maxNumero){
        k += 1; soma += k
    }
    println("O resultado é $soma")
}

// EXERCICIO 04

fun logMatemat(){
    val numListA = mutableListOf(
        1,3,5,7
    )
    val numListB = mutableListOf(
        2, 4, 8, 16, 32, 64
    )
    val numListC = mutableListOf(
        0, 1, 4, 9, 16, 25, 36
    )
    val numListD = mutableListOf(
        4, 16, 36, 64
    )
    val numListE = mutableListOf(
        1, 1, 2, 3, 5, 8
    )
    val numListF = mutableListOf(
        2,10, 12, 16, 17, 18, 19
    )

    val resA = numListA.last() + 2
    val resB = numListB.last() * 2
    val resC = numListC.last() * numListC.last()
    val resD = ((numListD.lastIndex + 2) * 2)*((numListD.lastIndex + 2) * 2)
    val resE = numListE.last() + numListE[numListE.size - 2]
    val resF = numListF.last() + numListF[numListE.size - 2] + 2
    val resG = numListF.last() + 1

    println("a) $resA")
    println("b) $resB")
    println("c) $resC")
    println("d) $resD")
    println("e) $resE")
    println("f) $resF")
    println("g) $resG")

}
fun main() {
//REFERENTE AO PRIMEIRO EXERCICIO

    println("Insira um número: ")
    readln().toIntOrNull()?.let {
        fibonacciTest(
            inserNum = it
        )
    }

//    REFERENTE AO SEGUNDO EXERCICIO

    println("Insira um Texto: ")
    val textoInser = readln().lowercase()

    println("Insira uma letra para verificar: ")
    val charInser = readln().firstOrNull()?.lowercaseChar()

    if (charInser != null){
        val letraRecor = stringLeitorTest(texto = textoInser,letra = charInser)
        println("O '$charInser' se repete $letraRecor vezes.")

    }   else{
        println("Insira apenas uma letra")
    }

    //REFERENTE AO TERCEIRO EXERCICIO
    somaLista()

    //REFERENTE AO QUARTO EXERCICIO

    logMatemat()

    //REFERENTE AO QUINTO EXERCICIO
    println("Eu ligaria o Interruptor 'C' e 'A', apagaria o 'C' após 30 segundos, iria até uma das  salas com a Luz apagada e colocaria a mão sobre a lampada, sabendo assim qual das lampadas  se tratava, se  estivesse fria seria a 'B', pois não foi ligada, se estivesse quente seria a 'C' e voltando na unica  sala com a Luz ligada poderia ser a sala 'A' ")
}
