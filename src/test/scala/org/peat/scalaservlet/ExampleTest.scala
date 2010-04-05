package org.peat.scalaservlet

import org.specs._
import org.specs.matcher._

class ExampleTest extends SpecificationWithJUnit {

  "Example" should {
    "provide a friendly message" >> {
      val r = new Example
      r.exampleContent() must be matching("Hello .*")
    }
  }

}


