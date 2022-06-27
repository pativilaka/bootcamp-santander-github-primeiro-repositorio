package NivelBasico

fun main(args: Array<String>) {
     println("Resultado da soma: ${soma(10, 5)}")
     println("Resultado da multiplicação: ${multiplica(10, 5)}")
     println("Resultado da subtração: ${subtrai(10, 5)}")
     println("Resultado da divisão: ${divide(10, 5)}")

}

/*
Método para somar 2 números inteiros;
*/
fun soma(primeiroValor: Int, segundoValor: Int) = primeiroValor + segundoValor


/*
Método para multiplicar 2 números inteiros;
*/
fun multiplica(primeiroValor: Int, segundoValor: Int) = primeiroValor * segundoValor

/*
Método para subtrair 2 números inteiros;
*/
fun subtrai(primeiroValor: Int, segundoValor: Int) = primeiroValor - segundoValor

/*
Método para dividir 2 números inteiros;
*/
fun divide(primeiroValor: Int, segundoValor: Int) = primeiroValor / segundoValor