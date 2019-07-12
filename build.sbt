name := "global-thermonuclear-war"
version := "0.1"
scalaVersion := "2.13.0"

libraryDependencies ++= Seq (
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "com.typesafe.akka" %% "akka-stream" % "2.5.23",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.23"   % "test",
  "org.scalatest"     %% "scalatest" % "3.0.8" % "test"
)