package com.radcheb.helloScalaJava

import com.radcheb.helloScalaJava.service._
 
object Main {
  def main(args: Array[String]) {
    println("We're running scala..")
    val service = new SomeJavaService
    println(service.getInfo())
    }
 }