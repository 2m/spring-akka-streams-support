name := "spring-akka-streams-support"
organization := "com.lightbend.akka"

version := "0.1"

resolvers += "Staging Repo" at "https://oss.sonatype.org/content/repositories/comtypesafe-2013"
scalaVersion := "2.12.4"
        
val akkaVersion = "2.5.7"
val springVersion = "5.0.0.RELEASE"

libraryDependencies += "org.springframework" % "spring-core" % springVersion
libraryDependencies += "org.springframework" % "spring-context" % springVersion
libraryDependencies += "org.springframework" % "spring-webmvc" % springVersion
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % akkaVersion

libraryDependencies += "org.springframework.boot" % "spring-boot" % "1.5.8.RELEASE" % Test
libraryDependencies += "org.springframework.boot" % "spring-boot-autoconfigure" % "1.5.8.RELEASE" % Test
