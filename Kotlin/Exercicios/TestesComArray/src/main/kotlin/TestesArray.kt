fun main(args: Array<String>) {
    val salarios = doubleArrayOf(1500.00, 2500.00, 1150.00, 1560.63)
    val salariosDev = doubleArrayOf(12000.00, 8500.00, 5500.00, 15000.00)

    salarios.sort()
    for(salario in salarios){
        println(salario)
    }

    espaco()

    salariosDev.sort()
    for(salDev in salariosDev){
        println(salDev)
    }

    espaco()

    println("Maior salário é: ${salarios.maxOrNull()}")
    println("Maior salário Dev é: ${salariosDev.maxOrNull()}")

    espaco()

    println("Menor salário é: ${salarios.minOrNull()}")
    println("Menor salário Dev é: ${salariosDev.minOrNull()}")

    espaco()

    println("A média dos salários é: ${salarios.average()}")
    println("A média dos salários Dev é: ${salariosDev.average()}")

    espaco()
    println(salarios.equals(salariosDev))

    espaco()
    if(salarios.equals(salariosDev)){
        println("Nice!! Now you are rich")
    } else { println("You must have to study a little more")
    }

    espaco()
    val maiorSalarioDev = salariosDev.filter { it > 10000.00 }
    maiorSalarioDev.forEach{println(it)}
    println("$maiorSalarioDev") //não pula a linha

    println(salarios.count())
    println(salariosDev.size) //compila mas é redirecionado para números inteiros

    val filtroSalario = salarios.filter { (it in 1500.00 .. 1600.00) }
    filtroSalario.forEach{println(it)}

    espaco()

    println(salarios.find { it == 13000.00 })
    println(salarios.any{it == 2500.00})

}

fun espaco() = println("**************************")