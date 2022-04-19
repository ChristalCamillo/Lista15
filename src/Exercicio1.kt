//Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma
//dos números que não são múltiplos de 13 entre X e Y, incluindo
//ambos.
// ler x
//ler y
// função soma que recebe 2 parametros e retorna a soma

fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    soma(x,y)
    mostrarSoma(soma)
}


fun soma (y: Int, x: Int): Int{
    var soma = 0
    for(intervalo in x <=..<=y){
        if(intervalo % 13 != 0){
            soma+= intervalo
        }
    }
    return soma
}

fun mostrarSoma(soma: Int){
    println(soma)
}