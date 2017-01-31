(ns check-my-ip.core
  (:gen-class)
  (:import [java.net InetSocketAddress InetAddress NetworkInterface StandardSocketOptions]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doseq [interface (enumeration-seq (NetworkInterface/getNetworkInterfaces))]
   (println (str interface))
   (doseq [ip (enumeration-seq (.getInetAddresses interface))]
     (println (str "   " ip)))))
