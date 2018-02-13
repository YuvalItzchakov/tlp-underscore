package com.yuvalitzchakov.tlp.namedcaseclass

import com.yuvalitzchakov.tlp.ImplicitLogger
import com.yuvalitzchakov.tlp.primitives._

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object NamedCaseClassRunner {
  import PrimitiveShowInstances._
  import HListLabeledGenericShowInstances._

  case class IceCream(flavor: String, scoops: Int)


  def main(args: Array[String]): Unit = {
    val vanillaIceCream = IceCream("VANILLA!", 2)
    ImplicitLogger.log(vanillaIceCream)
  }
}
