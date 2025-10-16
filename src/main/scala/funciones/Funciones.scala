package com.ceiba.application
package funciones

class Funciones {

  // Funciones anonimas (funciones lambda)
  val inc: Int => Int = (x) => x + 1

  val suma: (Int, Int) => Int = (x, y) => x + y

  val areaCirculo: Double => Double = (r) => Math.PI * r * r

  val esPar: Int => Boolean = (x) => (if (x % 2 == 0) true else false)

  // Funciones de orden superior
  def aplicarFuncion(f: Int => Int, valor: Int): Int = f(valor)
}
