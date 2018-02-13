package com.yuvalitzchakov.tlp.caseclass

import com.yuvalitzchakov.tlp.Show
import shapeless.{HList, HNil, Lazy}
import shapeless._
/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object HListShowInstances {

  // Helper method to reduce boilerplate
  def instance[A](fn: A => String): Show[A] = new Show[A] {
    override def show(a: A): String = fn(a)
  }

  implicit val hnilEncoder: Show[HNil] = instance(_ => "")
  implicit def hlistEncoder[H, T <: HList](
      implicit
      hEncoder: Lazy[Show[H]],
      tEncoder: Show[T]): Show[H :: T] = {
    instance { hlist =>
      val head: String = hEncoder.value.show(hlist.head)
      val tail: String = tEncoder.show(hlist.tail)
      s"$head, $tail"
    }
  }

  implicit def genericEncoder[A, R](
      implicit
      gen: Generic.Aux[A, R],
      env: Show[R]
  ): Show[A] =
    instance(a => env.show(gen.to(a)))
}
