package com.ceiba.application.vehiculos

// Trait interfaz para vehículos
// Trait Vehiculo que puede ser implementado por diferentes tipos de vehículos
// sealed para limitar las implementaciones a este fichero, en otras palabras quienes lo implementan deben estar en este fichero
sealed trait Vehiculo {
  def move(): String
}

// Implementaciones de Vehiculo en el mismo fichero porque el trait está sellado (sealed)
// case class para facilitar la creación de instancias y el pattern matching
case class Auto(marca: String, tipoVehiculo: String) extends Vehiculo {
  override def move(): String = s"El auto de marca $marca es un $tipoVehiculo y está en movimiento."
}

case class Camioneta(marca: String, tipoVehiculo: String) extends Vehiculo {
  override def move(): String = s"El auto de marca $marca es un $tipoVehiculo y está en movimiento."
}