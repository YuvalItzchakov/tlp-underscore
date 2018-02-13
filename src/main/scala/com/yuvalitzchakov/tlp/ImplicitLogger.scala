package com.yuvalitzchakov.tlp

/**
  * Created by Yuval.Itzchakov on 13/02/2018.
  */
object ImplicitLogger {
  def log[A](a: A)(implicit show: Show[A]): Unit = {
    println(show.show(a))
  }
}