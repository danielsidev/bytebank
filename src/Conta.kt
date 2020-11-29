class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set
        get

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
//    fun getSaldo(): Double{
//        return this.saldo
//    }
//    fun setSaldo(valor: Double){
//        this.saldo = valor
//    }
}