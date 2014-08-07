# Splasher

A small library built on [Seesaw](https://github.com/daveray/seesaw) /
Swing for splash screens.

## Usage

1. Add dependency to `project.clj`:

     [eigenhombre/splasher "0.1.0"]

1. Use `splash!`, something like the following (see `src/splasher/example.clj`):

     (ns try-splasher.core
       (:gen-class)
       (:require [splasher.core :refer [splash!]]))
     
     
     (defn -main []
       (splash! :duration 2000 :filename "splash.jpg")
       (System/exit 0))

Filename defaults to `splash.png`; duration defaults to 2500 msec.

The splash file image must be located in the project resources
directory for your project (usually, `resources`).

The `System/exit` is required for your Seesaw / Swing app to exit.

`lein run` will run the included example.

## License

Copyright © 2014 John Jacobsen

Distributed under the Eclipse Public License, the same as Clojure.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT
OF THIRD PARTY RIGHTS. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.