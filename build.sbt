scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-core" % "0.20.2"
)

scalacOptions ++= Seq(
  "-deprecation"
)
