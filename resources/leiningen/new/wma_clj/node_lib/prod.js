var cljs = require("./target/out/{{sanitized}}.core.js");
console.log("CLJS {{name}} as a production JS object", cljs)
cljs.hello();
