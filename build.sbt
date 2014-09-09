name := "Galapagos"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

scalacOptions += "-language:_"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.nlogo" % "tortoise" % "0.1-b0360ac"
)

libraryDependencies ++= Seq(
  "org.webjars" % "chosen" % "0.9.12",
  "org.webjars" % "underscorejs" % "1.5.1",
  "org.webjars" % "underscore.string" % "2.3.0",
  "org.webjars" % "jquery" % "1.10.2-1",
  "org.webjars" % "ace" % "07.31.2013",
  "org.webjars" % "mousetrap" % "1.3",
  "org.webjars" % "bootstrap" % "2.3.2",
  "org.webjars" % "markdown-js" % "0.5.0-1"
)

resolvers += bintray.Opts.resolver.repo("netlogo", "Tortoise")

resolvers += bintray.Opts.resolver.repo("netlogo", "NetLogoHeadless")

resolvers += Resolver.file("Local repo", file(System.getProperty("user.home") + "/.ivy2/local"))(Resolver.ivyStylePatterns)

SetupConfiguration.settings

bintray.Plugin.bintrayResolverSettings