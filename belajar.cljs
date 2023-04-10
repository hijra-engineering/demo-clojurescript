(ns belajar
  (:require ["fs" :as fs]
            [clojure.string :as str]))

(js/console.log "Salam teman-teman!")

(js/console.log   (first (filter (fn [i] (str/starts-with? i "Lokasi"))
                                 (str/split (str (fs/readFileSync "berkas.txt")) #"\n"))))

(comment

  (fs/existsSync "berkas.txt")

  (fs/existsSync "nggakada.dat")

  ;; const fname = "berkas.txt"
  (def fname "berkas.txt")

  (fs/readFileSync fname)

  (str (fs/readFileSync fname))

  (def isi (str (fs/readFileSync fname)))

  (str/split isi #"\n")

  (def lines (str/split isi #"\n"))

  (filter (fn [i] (str/starts-with? i "Lokasi")) lines)

  (filter (fn [i] (str/starts-with? i "Lokasi"))
          (str/split isi #"\n"))

  (filter (fn [i] (str/starts-with? i "Lokasi"))
          (str/split (str (fs/readFileSync fname)) #"\n"))

  (filter (fn [i] (str/starts-with? i "Lokasi"))
          (str/split (str (fs/readFileSync "berkas.txt")) #"\n"))

  (first (filter (fn [i] (str/starts-with? i "Lokasi"))
                 (str/split (str (fs/readFileSync "berkas.txt")) #"\n"))))