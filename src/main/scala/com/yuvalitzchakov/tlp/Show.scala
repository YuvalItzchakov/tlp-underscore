package com.yuvalitzchakov.tlp

/*************************************************************
  *************** Show type class *******************
  * **********************************************************
  */
trait Show[A] {
  def show(a: A): String
}