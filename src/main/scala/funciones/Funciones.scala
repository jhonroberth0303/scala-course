package com.ceiba.application
package funciones

class Funciones {

  // Funciones anonimas (funciones lambda)
  val inc: Int => Int = (x) => x + 1

  val suma: (Int, Int) => Int = (x, y) => x + y

  val areaCirculo: Double => Double = (r) => Math.PI * r * r

  val esPar: Int => Boolean = (x) => (if (x % 2 == 0) true else false)

  var areaRectangulo: (Double, Double) => Double = (x, y) => x * y

  var filterImpares: List[Int] => List[Int] = (lista) => lista.filter(x => x % 2 != 0)

  var factorial: Int => Int = (n) => if (n == 0) 1 else n * factorial(n - 1)

  // Funciones de orden superior
  def aplicarFuncion(f: Int => Int, valor: Int): Int = f(valor)


}
