# Demo ClojureScript

Yang dibutuhkan: [Node.js](https://nodejs.org/) versi 16 atau lebih baru.

Langkah pertama, pasang semua dependensi terlebih dahulu:

```
npm install
```

dan kemudian jalankan `salam.cljs` (akan dieksekusi menggunakan [nbb](https://github.com/babashka/nbb)):

```
npm run nbb salam.cljs
```

Untuk bermain dengan REPL, yang diperlukan adalah [Visual Studio Code](https://code.visualstudio.com/) dan [Calva](https://calva.io/).

Pertama-tama, jalankan dulu REPL di terminal:
```
npm run nrepl
```

Lantas, buka `belajar.cljs` dengan Visual Studio Code. Gunakan menu _Go, Command Palette_ (`Ctrl+P`) dan pilih _Calva: Connect to a Running REPL in the Project_ lalu pilih _nbb_. Setelah itu, kembali gunakan `Ctrl+P` untuk menjalankan _Calva: Load/Evaluate Current File_.

Selanjutnya, berbagai form di dalam `belajar.cljs` bisa dijalankan menggunakan `Ctrl+Enter`, `Alt+Enter`, dsb. Untuk lebih lengkapnya, baca dokumentasi [The Top 10 Calva Commands](https://calva.io/commands-top10/).