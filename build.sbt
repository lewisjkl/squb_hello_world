name := "hello_world"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-language:postfixOps")

val squbsV = "0.9.0"

libraryDependencies ++= Seq(
  "org.squbs"         %% "squbs-unicomplex"     % squbsV,
  "org.squbs"         %% "squbs-actormonitor"   % squbsV,
  "org.squbs"         %% "squbs-httpclient"     % squbsV,
  "org.squbs"         %% "squbs-admin"          % squbsV,
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.6"
)

mainClass in (Compile, run) := Some("org.squbs.unicomplex.Bootstrap")
