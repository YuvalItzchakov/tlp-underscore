package com.yuvalitzchakov.tlp.caseclass

import com.yuvalitzchakov.tlp.ImplicitLogger
import com.yuvalitzchakov.tlp.primitives._

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object CaseClassRunner {
  import PrimitiveShowInstances._
  import HListShowInstances._

  case class Person(firstName: String, lastName: String, age: Int)

  def main(args: Array[String]): Unit = {
    val person = Person("Yuval", "Itzchakov", 30)
    ImplicitLogger.log(person)
  }
}
