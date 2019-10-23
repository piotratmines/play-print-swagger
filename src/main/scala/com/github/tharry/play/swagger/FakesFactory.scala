package com.github.tharry.play.swagger

import com.typesafe.config.Config
import play.api.Configuration
import play.api.db.{Database, Databases}
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder

object FakesFactory {

  def fakeApplication(config: Config): play.api.Application = {
    new GuiceApplicationBuilder()
      .overrides(bind[Database].toInstance(Databases.inMemory()))
      .loadConfig(Configuration(config))
      .build
  }

}
