package com.ceiba.application
package figuras

class Cuadrado (val lado: Double) extends Figura {
  override def area: Double = lado * lado
  override def perimetro: Double = 4 * lado
}
