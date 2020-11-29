fun main() {
println("Bem vindo ao ByteBank")
    val alex = Funcionario(
        nome = "Alex",
        cpf = "356.789.145.-89",
        salario = 1000.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "896.147.258-87",
        salario = 2000.00,
        senha =1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome ="Gui",
        cpf  ="852.123.357.-36",
        salario = 4000.00,
        senha = 4000,
        plr   =  200.00
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if(gui.autentica(4000)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }

    val maria:Funcionario = Analista(
        nome = "Maria",
        cpf = "789.147.258-74",
        salario = 3000.0
    )
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("total de bonificação: ${calculadora.total}")



    println("")
}



