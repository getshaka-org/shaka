## [Shaka](https://getshaka.org)

A modern Scala.js library for building user interfaces. Shaka has

* Precise databinding, without VDOM, confusing macros, or AOT compilation.
* A developer experience familiar to React.JS developers, with minimal abstraction.
* Built-in state management and persistence.

Checkout the [docs](https://getshaka.org), [ScalaDoc](/todo), generate a starter project:

```
sbt new getshaka-org/shaka.g8

// or, for a JVM/JS Cross-Project
sbt new getshaka-org/shaka-crossproject.g8
```

Or, grab the coordinates directly:

```
libraryDependencies ++= "org.getshaka" %%% "shaka" % "0.2.0"
```
