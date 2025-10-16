package com.ceiba.application
package vehiculos

class Coche extends Vehicle with Reparable {
  override def conducir: String = "El coche está en movimiento"
  override def reparar: String = "El coche ha sido reparado"
}
