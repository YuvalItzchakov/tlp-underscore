package com.yuvalitzchakov.tlp

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object Logger {
  def log[A](a: A)(implicit show: Show[A]): Unit = {
    println(show.show(a))
  }
}
