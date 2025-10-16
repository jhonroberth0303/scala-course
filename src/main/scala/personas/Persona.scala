package com.ceiba.application
package personas

trait Persona {
  val nombre: String
  val apellido: String
  val edad: Int
  
  def trabajar: String
}
