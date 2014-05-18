name := "gulp-starter"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" % "angularjs" % "1.3.0-beta.2",
  "org.webjars" % "angular-ui-bootstrap" % "0.11.0-2"
)     

lazy val root = (project in file(".")).enablePlugins(SbtWeb)
