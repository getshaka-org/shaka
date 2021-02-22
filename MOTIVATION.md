Author: August Nagro

I've used a lot of JavaScript frameworks during my career. I started with Meteor.js, and by the time I completed my first real app, the company behind the framework abandoned it. I've used many of the verbose and backwards-incompatible versions of Angular. I even made Scala.js bindings with macros (which are also completely changed now). I used Polymer for a while, and when that was deprecated I tried LitElement. I've made web components from hand, building custom elements with the shadow dom. For a brief time at a startup I used Knockout.js, but the company failed before I could determine what I didn't like about it. My favorite framework so far has been the one I'm using at work: React + Redux. It gets a lot of things right, but there's still more that can be better.

1. JS Classes are verbose, `this` is still confusing, and Hooks can have surprising performance issues.
2. Passing state through props is not maintainable.
3. Redux is overcomplicated for most applications. It has way too much abstraction.
4. Virtual Dom < Precise Updates. The reason React chose VDom is not because of performance. It is simply the only way they could have the nice JSX binding syntax without _terrible_ performance (other than using an AOT compiler like Svelte). Thus, React is limited by the expressiveness of its implementation language, JavaScript. Scala, one of the most expressive and capable languages, does not have this problem.
5. I counted 40,000+ npm dependencies in my co-worker's new react-starter app.

I've also tried the various Scala.js libraries.

My favorite have been binding.scala and scala-tags. Both have some problems too.

Binding.Scala won't work in Scala 3 since XML literals are removed. Also, it uses the experimental macros that are now removed. While the documentation says that data binding is precise, it actually reevaluates all code following the binding that has changed, regardless of nesting level. It's also more low-level (by design) than Shaka.

Scala tags isn't a framework.. it's just a library to help construct Dom and Css. So there's no data binding. Also, using varargs methods makes the code more ugly compared to code blocks. There are commas and parens everywhere. Not sure if this is true, but I read somewhere that they were struggling to port to Scala 3.

There's also a lot of frameworks that use FRP and async programming. There's just so much abstraction, complexity, and potential for memory leaks that I know I could not be productive using them.

Finally, there's various Scalajs react/angular/etc bindings. These have various pros and cons but the best Scala framework will be written in pure Scala and not a wrapper. Most of these libraries seem to love macros, weird symbolic infix operators, and long compile times.

Having surveyed the ecosystem, I think I know what I want from a web framework at this point. It may not be what you want, and that's ok.
