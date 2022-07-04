data class TesteList(

    val nome: String,
    val salario: Double,
    val contratacao: String
    )
{
    override fun toString(): String =
        """
           Nome:        $nome
           Salário:     $salario
           Contratação: $contratacao
        """.trimIndent()

}

fun main(args: Array<String>) {
    val funcionario1 = TesteList("Janete", 5000.00, "CLT")
    val funcionario2 = TesteList("Kleber", 3500.00, "PJ")
    val funcionario3 = TesteList("Rafael", 4500.00, "CLT")

    val listaDeFuncionarios = listOf(funcionario1, funcionario2, funcionario3)

    listaDeFuncionarios.forEach { println(it) }
    println("************************************************")

    println(listaDeFuncionarios.find { it.nome == "Rafael" })
    println("************************************************")

    listaDeFuncionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println("************************************************")

    listaDeFuncionarios
        .groupBy { it.contratacao  }
        .forEach { println(it) }
    println("************************************************")

    listaDeFuncionarios.add

}