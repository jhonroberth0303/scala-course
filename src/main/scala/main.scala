package com.ceiba.application

import personas.Ingeniero
import objetos.*
import vehiculos.Auto

import com.ceiba.application.funciones.Funciones


@main
def main(): Unit =
  val a = Auto("Toyota", "Sedan")
  println(a.move())

  val b = a.copy(marca = "Ford")
  println(b.move())

  a match
    case Auto(marca, tipo) => println(s"Pattern match: marca=$marca, tipo=$tipo")

  // Bucle de ejemplo original
  for (i <- 1 to 3) do
    println(s"i = $i")


  val ingeniero = Ingeniero("Juan", "Perez", 30)
  println(ingeniero.trabajar)

  // Ejemplos de uso de Sexo
  val s1 = Sexo("m")
  println(s"Sexo creado con Sexo(\"m\"): $s1")

  val s2 = Sexo("femenino")
  println(s"Sexo creado con Sexo(\"femenino\"): $s2")

  val s3 = Sexo("otro")
  println(s"Sexo creado con Sexo(\"otro\"): $s3")

  // Pattern matching contra los case objects
  s1 match
    case Masculino => println("Coincidió: Masculino")
    case Femenino  => println("Coincidió: Femenino")
    case SexoInvalido => println("Coincidió: Sexo inválido")

  val funciones = Funciones()

  println(funciones.resultadoCombinar)

  val listaNumeros = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val responseProduct = funciones.product(listaNumeros)
  println("FoldLeft" + responseProduct)

  val responseReverse = funciones.reverse(listaNumeros)
  println("FoldLeft reverse: " + responseReverse)

  val flatenList = funciones.lineasAplanadas
  println("Archivos aplanados: " + flatenList)

  // funciones de orden superior

  val nums = List(1, 2, 3, 4, 5)
  val cuadrados = nums.map(x => x * x)
  println("Cuadrados: " + cuadrados)

  val pares = nums.filter(x => x % 2 == 0)
  println("Pares: " + pares)

  val dobles = nums.map(x => x * 2)
  println("Dobles: " + dobles)

  val suma = nums.reduce((x, y) => x + y)
  println("Suma: " + suma)

  nums.foreach(x => println(s"Número: $x"))

  val count = nums.count(x => x > 3)
  println("Count > 3: " + count)

  //------ Tipos algebraicos y pattern matching

  sealed trait Resultado

  case class Exito(valor: Int) extends Resultado
  case class Error(mensaje: String) extends Resultado

  def manejarResultado(r: Resultado): String = r match {
    case Exito(valor) => s"Operación exitosa con valor: $valor"
    case Error(mensaje) => s"Operación fallida con mensaje: $mensaje"
  }

  val r1: Resultado = Exito(42)
  val r2: Resultado = Error("Algo salió mal")

  println(manejarResultado(r1)) // Operación exitosa con valor: 42
  println(manejarResultado(r2)) // Operación fallida con mensaje: Algo salió mal


  // recursion estructural

  sealed trait Lista[+A]
  case object Vacía extends Lista[Nothing]
  case class Nodo[A](head: A, tail: Lista[A]) extends Lista[A]

  def longLista[A](l: Lista[A]): Int = l match {
    case Vacía => 0
    case Nodo(_, t) => 1 + longLista(t)
  }

  // Explicación

  //- `A` Es un parámetro de tipo genérico (como `T` en otros lenguajes). Representa el tipo de los elementos que guarda la `Lista`. Ejemplo: `Lista[Int]` es una lista de `Int`.

  //- `+A` (covarianza) `Lista[+A]` indica que la lista es covariante en `A`. Si `Perro` es subtipo de `Animal`, entonces `Lista[Perro]` será subtipo de `Lista[Animal]`. Esto permite usar una `Lista[Perro]` donde se espera una `Lista[Animal]`. Restricción: no se pueden definir métodos que reciban `A` como parámetro (porque rompería la seguridad de tipos).

  // `Nothing` `Nothing` es el tipo inferior (bottom type) en Scala: es subtipo de todos los tipos. Se usa para representar valores que nunca existen en tiempo de ejecución (p. ej. `throw`), o para declarar el vacío de una estructura genérica. `case object Vacía extends Lista[Nothing]` permite que `Vacía` sea considerada `Lista[Int]`, `Lista[String]`, etc.

  // - Recursividad estructural (por qué y para qué) La definición de `Lista` es inductiva: hay un caso base (`Vacía`) y un constructor recursivo (`Nodo(head, tail)`). La función `longLista` recorre la estructura siguiendo su forma: si es `Vacía` devuelve 0; si es `Nodo`, cuenta 1 y llama recursivamente sobre `tail`. Esto se llama recursión estructural porque la función se aplica a la parte "más pequeña" (la cola) de la estructura hasta llegar al caso base. Es una forma natural de procesar estructuras inductivas (listas, árboles).

  // - Nota sobre rendimiento y seguridad de pila   La implementación recursiva simple puede causar desbordamiento de pila para listas muy largas. Se puede convertir a una versión tail-recursive usando un acumulador para evitar ese problema.
