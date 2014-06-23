// Comment to get more information during initialization
logLevel := Level.Debug

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// For Sass
resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

// Sass plugin for css
addSbtPlugin("net.litola" % "play-sass" % "0.3.0")