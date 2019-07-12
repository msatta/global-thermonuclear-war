import org.scalatest.{Matchers, WordSpec}

class ServerTest extends WordSpec with Matchers {

  "the system" should {
    "create an empty GTW Service" in {
      new GTWService()
    }

    "should be able to connect to the GWT service websocket" in {

    }
  }

}
