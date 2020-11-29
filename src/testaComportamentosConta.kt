fun testaComportamentosConta(){
    val contaAlex = Conta(titular ="Alex", numero = 1000)
    contaAlex.depositar(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()
    val contaFran = Conta( numero=1001, titular="Fran")
    contaFran.depositar(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.depositar(50.0)
    println(contaAlex.saldo)
    println("depositando na conta da Fran")
    contaFran.depositar(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.sacar(250.0)
    println(contaAlex.saldo)
    println("sacando na conta da Fran")
    contaFran.sacar(100.0)
    println(contaFran.saldo)

    println("sacando em excesso na conta do Alex")
    contaAlex.sacar(100.0)
    println(contaAlex.saldo)

    println("sacando em excesso na conta da Fran")
    contaFran.sacar(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")
    if (contaFran.transferir(300.0, contaAlex)) {
        println("Transferência bem sucedida")
    } else {
        println("Falha na transferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)

}