package com.yuvalitzchakov.tlp.primitives

import com.yuvalitzchakov.tlp.Show

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object PrimitiveShowInstances {
  /*************************************************************
    *************** Basic type show encoders *******************
    * **********************************************************
    */

  implicit val intEncoder: Show[Int] = new Show[Int] {
    override def show(i: Int): String = i.toString
  }

  implicit val stringEncoder: Show[String] = new Show[String] {
    override def show(str: String): String = str.toString
  }
}
