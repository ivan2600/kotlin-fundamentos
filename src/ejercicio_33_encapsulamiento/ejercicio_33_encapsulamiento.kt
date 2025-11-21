package ejercicio_33_encapsulamiento

class CuentaBancaria {
    private var balance = 0

    fun depositar(monto: Int) {
        validarMonto(monto)
    }

    fun obtenerBalance(): Int {
        return balance
    }

    private fun validarMonto(monto: Int) {
        if (monto > 0) {
            balance += monto
        } else {
            println("Ingrese un monto valido")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria()
    cuenta.depositar(100)
    cuenta.depositar(-20)
    println("Balance actual: ${cuenta.obtenerBalance()}")
}