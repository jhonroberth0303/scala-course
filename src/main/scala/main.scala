package com.ceiba.application

import personas.Ingeniero
import objetos._
import vehiculos.Auto


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