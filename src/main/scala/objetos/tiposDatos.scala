package com.ceiba.application
package objetos

trait Sexo

object Sexo {
  def apply(value: String): Sexo = value.toLowerCase match {
    case "m" | "masculino" => Masculino
    case "f" | "femenino" => Femenino
    case _ => SexoInvalido
  }
  
  def unapply(value: Sexo): Option[String] = Some(value.toString)
}

case object Masculino extends Sexo {
  override def toString: String = "M"
}

case object Femenino extends Sexo {
  override def toString: String = "F"
}

case object SexoInvalido extends Sexo {
  override def toString: String = "X"
}