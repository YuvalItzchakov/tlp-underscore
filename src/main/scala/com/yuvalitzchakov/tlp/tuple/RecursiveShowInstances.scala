package com.yuvalitzchakov.tlp.tuple

import com.yuvalitzchakov.tlp.Show

/**
  * Created by Yuval.Itzchakov on 10/02/2018.
  */
object RecursiveShowInstances {
  implicit def tupleShow[Head, Tail](
      implicit
      headShow: Show[Head],
      tailShow: Show[Tail]): Show[(Head, Tail)] = new Show[(Head, Tail)] {
    override def show(value: (Head, Tail)): String = {
      // Decompose tuple to named elements
      val (head, tail) = value

      // Call show on head (currently resolved), and recursively tell the compiler
      // to look for instances defined on tail. The tail, itself, can also be
      // a tuple type!
      s"${headShow.show(head)}, ${tailShow.show(tail)}"
    }
  }
}
