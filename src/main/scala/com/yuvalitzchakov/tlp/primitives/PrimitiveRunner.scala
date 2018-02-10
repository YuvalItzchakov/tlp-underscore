package com.yuvalitzchakov.tlp.primitives

import com.yuvalitzchakov.tlp.Logger

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object PrimitiveRunner {
  import PrimitiveShowInstances._
  def main(args: Array[String]): Unit = {

    Logger.log(10)
    Logger.log("Hello Scala-IL!!")
  }
}
