lazy val root = (project in file("."))
  .enablePlugins(TutPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "tut-fsreveal-example",
    tutTargetDirectory := baseDirectory.value / "FsReveal/slides"
  )

