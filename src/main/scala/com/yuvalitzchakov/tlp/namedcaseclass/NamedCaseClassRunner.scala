package com.yuvalitzchakov.tlp.namedcaseclass

import com.yuvalitzchakov.tlp.Logger
import com.yuvalitzchakov.tlp.primitives._
/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object NamedCaseClassRunner {
  import PrimitiveShowInstances._
  import HListLabeledGenericShowInstances._

  case class IceCream(flavor: String, scopes: Int)
  def main(args: Array[String]): Unit = {
    val vanillaIceCream = IceCream("VANILLA!", 2)

    Logger.log(vanillaIceCream)
  }
}
