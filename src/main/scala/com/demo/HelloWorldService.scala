package com.demo

import akka.http.scaladsl.model.StatusCodes
import org.squbs.unicomplex.RouteDefinition
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._

class HelloWorldService extends RouteDefinition {

  implicit val printMessageFormat = jsonFormat1(PrintMessage)

  val route = {
    post {
      path("print_message") {
        entity(as[PrintMessage]) { message =>
          context.system.actorSelection("user/hello_world/hello_world_actor") ! message
          complete(StatusCodes.OK)
        }
      }
    }
  }

}
