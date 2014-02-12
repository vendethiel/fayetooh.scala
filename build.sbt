// -*- scala -*-
import AssemblyKeys._

name := "Fayetooh"

organization := "bot.irc.fayetooh"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

mainClass in (Compile, packageBin) := Some("bot.irc.fayetooh.Fayetooh")

mainClass in (Compile, run) := Some("bot.irc.fayetooh.Fayetooh")

resolvers += "mtgto repos" at "http://scala-irc-bot.github.com/scala-irc-bot/maven/"

libraryDependencies := Seq(
  "net.mtgto" %% "scala-irc-bot" % "0.2.0",
  "org.scalaz" %% "scalaz-core" % "7.0.5"
/*
  "org.specs2" %% "specs2" % "1.14" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
*/
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-feature",
  "-language:existentials",
  "-language:experimental.macros",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-all",
  "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

scalaSource in run <<= baseDirectory(_ / "src")

assemblySettings

assembleArtifact in packageScala := false

jarName in assembly := "fayetooh-assembly-0.1.0-SNAPSHOT.jar"
