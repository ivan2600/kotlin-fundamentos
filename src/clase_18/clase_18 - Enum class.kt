package clase_18

enum class EmailFolders {
    INBOX,
    SENT,
    DRAFT,
    ARCHIVE,
    SPAM
}

enum class EmailPriority(val level: Int, val color: String) {
    LOW(1, "gris"),
    NORMAL(2, "azul"),
    HIGH(3, "naranja"),
    URGENT(4, "rojo")
}

fun prioridadIntAEmailPriority(entero: Int): EmailPriority? {
    return if (entero in 0 until EmailPriority.entries.size)
        EmailPriority.entries[entero]
    else
        null
}

fun main() {

    println("*.*.*.*.*.*.*.*.*.*.*.*.*")
    println("---SELECCIONAR CARPETA---")
    println("1. Inbox")
    println("2. Sent")
    println("3. Draft")
    println("4. Archive")
    println("5. Spam")
    val valorCarpeta = readlnOrNull()?.trim()?.toInt() ?: 0

    val carpetaActual = EmailFolders.entries[valorCarpeta - 1]

    when(carpetaActual) {
        EmailFolders.INBOX -> {
            println("Bienvenido a Inbox")
        }
        EmailFolders.SENT -> {
            println("Bienvenido a Sent")
        }
        EmailFolders.DRAFT -> {
            println("Bienvenido a Draft")
        }
        EmailFolders.ARCHIVE -> {
            println("Bienvenido a Archive")
        }
        EmailFolders.SPAM -> {
            println("Bienvenido a Spam")
        }
    }
    val prioridadEmail = prioridadIntAEmailPriority(0)
    println("La prioridad de ${ prioridadEmail?.name } es ${ prioridadEmail?.level } con color ${ prioridadEmail?.color }")
}