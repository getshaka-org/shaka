## [Shaka](https://getshaka.org)

A modern Scala.js library for building user interfaces. Shaka has

* Precise databinding, without VDOM, confusing macros, or AOT compilation.
* A developer experience familiar to React.JS developers, with minimal abstraction.
* Built-in state management and persistence.

Checkout the [docs](https://getshaka.org), [ScalaDoc](/todo), generate a starter project:

```
sbt new getshaka-org/shaka.g8
```

Or, grab the coordinates directly:

```
libraryDependencies ++= "org.getshaka" %%% "shaka" % "0.3.0"
```

## Notes
* The website is down. Github pages doesn't support SPAs very well, so I'm in the process of setting up hosting.

* Scaladoc link doesn't work because Scala 3 RC3's ScalaDoc is broken. The link will be updated when [this issue](https://github.com/lampepfl/dotty/issues/11943) gets fixed.