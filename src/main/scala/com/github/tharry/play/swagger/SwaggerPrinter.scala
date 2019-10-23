package com.github.tharry.play.swagger

class SwaggerPrinter {
  def main(args: Array[String]): Unit = {
    import java.io._
    val pw = new PrintWriter(new File("hello.txt" ))
    pw.write("Hello, world")
    pw.close
    println("AAAA")
    //    val conf = ConfigFactory.parseFile(new File("conf/test.conf"))
    //    println(conf)
    //    val app = FakesFactory.fakeApplication(conf)
    //    Play.start(app)
    //    val scanner = new PlayApiScanner()
    //    ApiListingCache.listing("", "127.0.0.1")
    println("ZZZZ")

  }
}
