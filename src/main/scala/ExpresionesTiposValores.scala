package com.ceiba.application

object ExpresionesTiposValores {
  def main(args: Array[String]): Unit = {
    println("Valores: Los valores son inmutables")

    val a: Int = 10
    val b: Int = 20
    val c: Int = a + b
    println(s"Suma de $a y $b es $c")

    println("-----------------------------------------------\n")

    println("Tipos: Scala es un lenguaje fuertemente tipado")

    val nombre: String = "Scala"
    val version: Double = 3.0
    println(s"Lenguaje: $nombre, Versión: $version")

    println("Nota: Scala puede inferir tipos automáticamente")

    val x = 100 // Int
    val y = 200.5 // Double
    val mensaje = "Hola" // String
    println(s"x: $x, y: $y, mensaje: $mensaje")

    println("-----------------------------------------------\n")

    println("Expresiones: Todo en Scala es una expresión")

    val resultado = if (x > 50) "Mayor que 50" else "50 o menor"
    println(s"Resultado de la expresión if: $resultado")

    val lista = List(1, 2, 3, 4, 5)
    val cuadrados = lista.map(n => n * n)
    println(s"Cuadrados de la lista: $cuadrados")

    println("-----------------------------------------------\n")

    println("Variables: Las variables son mutables")
    var contador: Int = 0
    println(s"Contador inicial: $contador")
    contador += 1
    println(s"Contador después de incrementar: $contador")
    contador += 5
    println(s"Contador después de sumar 5: $contador")

    println("-----------------------------------------------\n")

    println("Operaciones condicionales")
    val numero = 15
    val esPar = if (numero % 2 == 0) "Sí" else "No"
    println(s"¿El número $numero es par? $esPar")

    println("Operaciones con listas")
    val numeros = List(1, 2, 3, 4, 5)
    val sumaTotal = numeros.sum
    println(s"Suma de la lista $numeros es $sumaTotal")

    println("Operaciones con cadenas")
    val saludo = "Hola"
    val nombreUsuario = "Mundo"
    val mensajeCompleto = s"$saludo, $nombreUsuario!"
    println(mensajeCompleto)

    println("La s delante de la cadena indica que es una string interpolada en Scala. Permite insertar variables o expresiones dentro de la cadena usando $variable o ${expresion}. Por ejemplo, s\"$saludo, $nombreUsuario!\" reemplaza $saludo y $nombreUsuario por sus valores.")
    println("-----------------------------------------------\n")

    println("Bucles")
    println("Usando for:")
    for (i <- 1 to 5) {
      println(s"i = $i")
    }

    println("For con guardia:")
    for (i <- 1 to 10 if i % 2 == 0) {
      println(s"i par = $i")
    }

    println("For con yield:")
    val cuadradosYield = for (i <- 1 to 5) yield i * i
    println(s"Cuadrados usando yield: $cuadradosYield")

    println("For from array:")
    for (elem <- Array(1, 2, 3, 4, 5)) {
      println(s"Elemento = $elem")
    }

    println("Usando while:")
    var j = 1
    while (j <= 5) {
      println(s"j = $j")
      j += 1
    }

    println("-----------------------------------------------\n")

    println("Funciones")
    println("En Scala, def se utiliza para definir una función o método. Es la palabra clave que indica el inicio de una declaración de función, seguida del nombre, los parámetros y el tipo de retorno. Por ejemplo:")
    
    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }
    
    val numFactorial = 5
    println(s"Factorial de $numFactorial es ${factorial(numFactorial)}")

  }
}