# Ejemplos de Variables en Kotlin

En Kotlin, las variables pueden ser definidas de varias formas, incluyendo constantes, variables opcionales y con manejo de nulos.

## Variables y Constantes

En Kotlin, las variables pueden ser mutables (que pueden cambiar su valor) o inmutables (constantes, cuyo valor no puede cambiar una vez asignado). Aquí hay ejemplos de ambos:

### Asignación Valor Nulo
var miString: String? = "Hola"

#####Asignación de valor nulo
miString = null
#### Manejo seguro de nulos con el operador seguro ?. y el operador  ?:
val longitud: Int = miString?.length ?: 0

### Opcionales
Variable nullable
var nombre: String? = "Juan"

##### Accediendo a propiedades de una variable nullable
println("Nombre: ${nombre?.toUpperCase()}")

#####Asignación de valor nulo
nombre = null

#####Accediendo a propiedades de una variable que podría ser nula usando el operador seguro (?.)
println("Nombre: ${nombre?.toUpperCase()}")

####Usando el operador Elvis (?:) para proporcionar un valor predeterminado en caso de que la variable sea nula
val longitud: Int = nombre?.length ?: -1
println("Longitud del nombre: $longitud")

