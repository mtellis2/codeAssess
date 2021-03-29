scalaVersion := "2.13.3"

name := "specialMath"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  "specialMath" + "." + artifact.extension
}
