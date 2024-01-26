name := "MyJavaApp"
version := "1.0"
scalaVersion := "2.13.8"

javacOptions ++= Seq("-source", "11", "-target", "11")

// Define the main class for the application
mainClass := Some("HelloWorld")

// Add dependencies for testing
libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"



// Define the test source directory
unmanagedSourceDirectories in Test += baseDirectory.value / "src" / "test" / "java"
jacocoReportSettings := JacocoReportSettings(
  "Jacoco Coverage Report",
  None,
  JacocoThresholds(),
  Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML), // note XML formatter
  "utf-8")