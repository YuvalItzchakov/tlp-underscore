package com.yuvalitzchakov.tlp.tuple

import com.yuvalitzchakov.tlp.Logger
import com.yuvalitzchakov.tlp.primitives._

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object TupleRunner {
  import PrimitiveShowInstances._
  import RecursiveShowInstances._
  type Person = (String, (String, Int))

  def main(args: Array[String]): Unit = {
    val p: Person = ("Yuval", ("Itzchakov", 30))
    Logger.log(p)
  }
}
