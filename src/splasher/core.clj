(ns splasher.core
  (:require [seesaw.core :refer [icon frame move! show! hide! label]])
  (:import [java.awt Toolkit]))


(defn screen-size []
  (let [ss (.getScreenSize (Toolkit/getDefaultToolkit))]
    [(.width ss) (.height ss)]))


(defn image-size
  "
  See
  http://stackoverflow.com/questions/4217896/how-can-i-determine-the\\
  -dimensions-of-an-image-file-of-arbitrary-format-jpeg-p
  "
  [image-stream]
  (let [image (javax.imageio.ImageIO/read image-stream)]
    [(.getWidth image) (.getHeight image)]))


(defn splash!
  "
  Use Seesaw to display an undecorated window based on graphic in
  resources directory (splash screen).
  "
  [& {:keys [duration filename height width]
      :or {duration 2500
           filename "splash.png"}}]
  (let [[scrw scrh] (screen-size)
        resource-file (clojure.java.io/resource filename)
        img_bg (icon resource-file)
        [imgw imgh] (image-size resource-file)
        xpos (/ (- scrw imgw) 2)
        ypos (/ (- scrh imgh) 2)
        fr (frame :size [imgw :by imgh]
                  :undecorated? true
                  :content (label :icon img_bg))]
    (move! fr :to [xpos ypos])
    (show! fr)
    (Thread/sleep duration)
    (hide! fr)))

