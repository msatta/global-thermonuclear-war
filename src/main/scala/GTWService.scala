import akka.http.scaladsl.server.Directives

class GTWService() extends Directives {



  val webSocketRoute = path("greeter") {
    handleWebSocketMessages(greeter)
  }

}
