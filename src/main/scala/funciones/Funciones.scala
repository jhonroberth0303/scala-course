package com.ceiba.application
package funciones

case class Funciones() {

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

  def aplicarDosVeces(f: Int => Int, valor: Int): Int = f(f(valor))

  def resultado = aplicarDosVeces((x: Int) => x + 3, 10) // resultado es 16

  def res = aplicarFuncion(inc, 5) // res es 6

  // Funcion de orden superior que retorna una funcion

  def crearMultiplicador(factor: Int): Int => Int = (x: Int) => x * factor
  def duplicar = crearMultiplicador(2)
  def triplicar = crearMultiplicador(3)

  def resultadoMultiplicador = duplicar(5) // resultadoMultiplicador es 10
  def resultadoTriplicar = triplicar(5) // resultadoTriplicar es 15

  // Funcion de orden superior que recibe y retorna una funcion
  def combinarFunciones(f: Int => Int, g: Double => Double): Int => Double = (x: Int) => g(f(x))
  def sumar2 = combinarFunciones(inc, areaCirculo) // sumar2 es una funcion que suma 2
  def resultadoCombinar = sumar2(4) // resultadoCombinar es 7

  // Colecciones y funciones de orden superior

  val numeros = List(1, 2, 3, 4, 5)
  val cuadrados = numeros.map(x => x * x) // cuadrados es List(1, 4, 9, 16, 25)

  val pares = cuadrados.filter(x => x % 2 == 0) // pares es List(4, 16)

  val sumaTotal = numeros.reduce((x, y) => x + y) // sumaTotal es 15

  val nombres = List("Ana", "Luis", "Pedro", "Marta", "Sofía", "Carlos", "Lucía", "Jorge", "Elena", "Diego")
  val nombresConL = nombres.filter(x => x.contains("l") || x.contains("L")) // Nombres que contienen la letra 'l' o 'L'
  val nombresOrdenados = nombres.sortBy(x => x.length) // Nombres ordenados por longitud
  val nombresMayusculas = nombres.map(x => x.toUpperCase()) // Nombres en mayúsculas
  val nombresOrdenadosAlfabeticamente = nombres.sorted // Nombres ordenados alfabéticamente
  val nombresConcatenados = nombres.reduce((x, y) => x + ", " + y) // Nombres concatenados en una sola cadena
  val nombresFiltradosReducidos = nombres.filter(x => x.length > 4).reduce((x, y) => x + " & " + y) // Nombres con más de 4 letras concatenados
  val nombresContados = nombres.count(x => x.length <= 4) // Contar nombres con 4 o menos letras
  val nombresAgrupadosPorLongitud = nombres.groupBy(x => x.length) // Agrupar nombres por longitud


  // map, filter, filtermap, flatmap, reduce, fold, groupby, sortby, foreach, foldleft, foldright
  
  // 1. Incrementar con fold left
  def product(xs: List[Int]): Int = xs.foldLeft(1)((acc, x) => acc * x)
  
  // Foldleft con reverse
  def reverse[A](xs: List[A]): List[A] = xs.foldLeft(List.empty[A])((acc, x) => x :: acc)
  
  // Aplanarlista de listas con folright
  val archivo = List(
    List("Línea 1 del archivo 1", "Línea 2 del archivo 1"),
    List("Línea 1 del archivo 2", "Línea 2 del archivo 2"),
    List("Línea 1 del archivo 3", "Línea 2 del archivo 3")
  )
  
  val lineasAplanadas: List[String] = archivo.foldRight(List.empty[String])((lineas, acc) => lineas ++ acc)
  
  //Demostracion que foldRight = reverse + foldLeft
  def foldRightViaLeft[A, B](xs: List[A], z: B)(op: (A, B) => B): B = {
    xs.reverse.foldLeft(z)((b, a) => op(a, b))
  }


}
