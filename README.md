## [Shaka](https://getshaka.org)

A modern Scala.js library for building user interfaces. Shaka has

* Precise databinding, without VDOM, macros, or AOT compilation.
* A developer experience familiar to React.JS developers, with minimal abstraction.
* Built-in state management and persistence.

Checkout the [docs](https://getshaka.org), [ScalaDoc](/), generate a starter project:

```
sbt new augustnagro/shaka.g8

// or, for a JVM/JS Cross-Project
sbt new augustnagro/shaka-crossproject.g8
```

Or, grab the maven coordinates directly:

```
libraryDependencies ++= "org.getshaka" %%% "shaka" % "0.1.0"
```
