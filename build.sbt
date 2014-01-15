import bintray.Keys._

seq(bintrayPublishSettings:_*)

name := "dnsjava"

organization := "org.dnsjava"

version := "2.1.6"

description := "Implementation of DNS in Java"

homepage := Some(url("http://www.dnsjava.org/"))

licenses <<= (name,version)(
  (name, ver) => Seq("BSD" -> url(
    "https://github.com/btd/%s/blob/%s/LICENSE" format(name, ver))))

publishArtifact in Test := false

crossPaths := false

libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"