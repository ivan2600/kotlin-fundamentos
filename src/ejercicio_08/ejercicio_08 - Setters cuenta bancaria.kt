package ejercicio_08

class CuentaBancaria {
    var titular: String = "Sin titular"
        get() = field.replaceRange(3, field.length, "***")
        set(value) {
            if (value.isEmpty()) {
                println("Este campo no puede estar vacio.")
            } else {
                field = value
                println("El titular de esta cuenta es: $value.")
            }
        }
    var saldo: Double = 0.0
        get() {
            println("Consultando saldo...")
            return field
        }
        set(value) {
            if (value < 0.0) {
                println("El valor no puede ser negativo.")
            } else {
                field = value
                println("El saldo de la cuenta ahora es de $$value.")
            }
        }

}

fun main() {

    val cuenta1 = CuentaBancaria()

    cuenta1.titular = ""
    cuenta1.titular = "Ivan"
    cuenta1.saldo = -100.0
    cuenta1.saldo = 1000.0

    println("El saldo de ${ cuenta1.titular } es de $${ cuenta1.saldo }")
}