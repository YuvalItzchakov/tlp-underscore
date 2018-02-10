package com.yuvalitzchakov.tlp.namedcaseclass

import com.yuvalitzchakov.tlp.Show
import shapeless.labelled.FieldType
import shapeless.{::, HList, HNil, LabelledGeneric, Lazy, Witness}

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object HListLabeledGenericShowInstances {
  // Helper method to reduce boilerplate
  def instance[A](fn: A => String): Show[A] = new Show[A] {
    override def show(a: A): String = fn(a)
  }

  implicit val hnilEncoder: Show[HNil] = instance(_ => "")
  implicit def hlistEncoder[K <: Symbol, H, T <: HList](
      implicit
      witness: Witness.Aux[K],
      hEncoder: Lazy[Show[H]],
      tEncoder: Show[T]): Show[FieldType[K, H] :: T] = {
    val fieldName = witness.value.name
    instance { hlist =>
      val head = hEncoder.value.show(hlist.head)
      val tail = tEncoder.show(hlist.tail)
      s"Field Name: $fieldName: Value: $head, $tail"
    }
  }

  implicit def genericEncoder[A, R](
      implicit
      gen: LabelledGeneric.Aux[A, R],
      env: Show[R]
  ): Show[A] =
    instance(a => env.show(gen.to(a)))
}
