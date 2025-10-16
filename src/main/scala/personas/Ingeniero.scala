package com.ceiba.application
package personas

class Ingeniero(val nombre: String, val apellido: String, val edad: Int) extends Persona {
  override def trabajar: String = s"$nombre $apellido, de $edad años, está trabajando como ingeniero."
}
