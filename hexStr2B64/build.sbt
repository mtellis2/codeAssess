scalaVersion := "2.13.3"

name := "hexStr2B64"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  "hexStr2B64" + "." + artifact.extension
}
