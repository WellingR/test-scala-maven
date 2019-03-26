package com.github.wellingr

import org.scalatest.{FlatSpec, Matchers}

class MyTest extends FlatSpec with Matchers {

  behavior of "MyClass"

  it should "work" in {
    val c = new MyClass
    c.elem shouldBe 3
  }

}
