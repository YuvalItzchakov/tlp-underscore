package com.yuvalitzchakov.tlp

/*************************************************************
  *************** Show type class *******************
  * **********************************************************
  */
trait Show[A] {
  def show(a: A): String
}

object Show {
  def instance[A](fn: A => String): Show[A] = new Show[A] {
    override def show(a: A): String = fn(a)
  }

  /*************************************************************
    *** Induction resolution of implicit show instances ********
    * **********************************************************
    */

  /*************************************************************
    *** Case class induction using shapeless! ********
    * **********************************************************
    */
//  implicit val hnilEncoder: Show[HNil] = instance(_ => "")
//  implicit def hlistEncoder[K <: Symbol, H, T <: HList](
//                                                         implicit
//                                                         hEncoder: Lazy[Show[H]],
//                                                         tEncoder: Show[T]): Show[H :: T] = {
//    instance { hlist =>
//      val head = hEncoder.value.show(hlist.head)
//      val tail = tEncoder.show(hlist.tail)
//      s"$head, $tail"
//    }
//  }
//
//  implicit def genericEncoder[A, R](
//                                     implicit
//                                     gen: Generic.Aux[A, R],
//                                     env: Show[R]
//                                   ): Show[A] =
//    instance(a => env.show(gen.to(a)))
}
