var miVariable: String = "Hola"
var miNumero: Int = 42

val PI: Double = 3.14159
val SALUDO: String = "Hola, mundo!"

var miString: String? = "Hola"


miString = null

val longitud: Int = miString?.length ?: 0

var nombre: String? = "Juan"


println("Nombre: ${nombre?.toUpperCase()}")


nombre = null


println("Nombre: ${nombre?.toUpperCase()}")


val longitud: Int = nombre?.length ?: -1
println("Longitud del nombre: $longitud")