package com.demo

import akka.actor.{Actor, ActorLogging}

case class PrintMessage(text: String)

class HelloWorld extends Actor with ActorLogging {

  override def receive: Receive = {
    case PrintMessage(text) =>
      printMessage(text)
  }

  private def printMessage(text: String) = log.info(text)

}
