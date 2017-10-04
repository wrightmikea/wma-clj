require("./target/out/{{sanitized}}_with_figwheel.js");
var cljs = require("./target/out/{{sanitized}}/core.js");
console.log("CLJS {{name}} as a JS object", cljs)
cljs.hello();
