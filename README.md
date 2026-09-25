# 📷 SISTEM PENYEWAAN PERANGKAT

> **Aplikasi Java Console untuk Mengelola Penyewaan Kamera dan Drone**

---

## 👤 Identitas

| Keterangan | Data |
|---|---|
| **Nama** | Siti Nursinta |
| **NIM** | [Isi NIM] |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Bahasa Pemrograman** | Java |
| **Platform** | NetBeans |
| **Jenis Aplikasi** | Console / CLI |
| **Studi Kasus** | Sistem Penyewaan Perangkat |

---

# 📌 1. Deskripsi Proyek

**Sistem Penyewaan Perangkat** merupakan aplikasi berbasis Java Console yang dirancang untuk membantu proses pengelolaan penyewaan perangkat fotografi dan videografi, khususnya **kamera dan drone**.

Program tidak hanya digunakan untuk menyimpan data perangkat, tetapi juga menggambarkan alur penyewaan secara sederhana, mulai dari pengelolaan perangkat, pencatatan penyewa, pembuatan reservasi, hingga proses pengambilan perangkat.

Aplikasi ini dirancang dengan menerapkan konsep **Object-Oriented Programming (OOP)** sehingga setiap objek memiliki data dan tanggung jawab yang jelas. Struktur program juga dipisahkan menjadi beberapa bagian, yaitu **Model, Logic, dan Main**, agar kode lebih terorganisasi dan mudah dikembangkan.

---

# 🎯 2. Latar Belakang dan Permasalahan

Dalam proses penyewaan perangkat, pengelolaan data perlu dilakukan dengan terstruktur agar informasi mengenai perangkat, penyewa, reservasi, dan pengambilan tidak tercampur.

Beberapa proses yang perlu diperhatikan dalam sistem penyewaan antara lain:

- mengetahui perangkat yang tersedia;
- menambahkan perangkat baru;
- memperbarui status perangkat;
- menghapus perangkat;
- mencari perangkat berdasarkan ID;
- mencatat data penyewa;
- membuat reservasi;
- menghitung total biaya berdasarkan lama sewa;
- mencatat proses pengambilan perangkat.

Berdasarkan kebutuhan tersebut, dibuat sebuah program sederhana yang menggambarkan proses penyewaan perangkat secara terintegrasi melalui aplikasi Java Console.

---

# 💡 3. Tujuan Pembuatan Program

Program ini dibuat untuk:

1. Menerapkan konsep **Inheritance** pada Java melalui hubungan antara `Perangkat`, `Kamera`, dan `Drone`.
2. Menerapkan **Polymorphism** melalui method `tampilkanInfo()` yang memiliki perilaku berbeda sesuai objek turunannya.
3. Menerapkan **Encapsulation** melalui penggunaan atribut `private` serta getter dan setter.
4. Mengelola kumpulan objek menggunakan `ArrayList`.
5. Menerapkan struktur kontrol seperti `if-else`, `switch-case`, `for`, `while`, dan `do-while`.
6. Menggambarkan alur bisnis sederhana dari proses reservasi sampai pengambilan perangkat.
7. Membuat program yang terstruktur sehingga lebih mudah dipahami dan dikembangkan.

---

# 🏢 4. Gambaran Sistem

Sistem terdiri dari tiga bagian utama dalam proses bisnis:

### 📦 Pengelolaan Perangkat

Bagian ini mengatur data perangkat yang tersedia dalam sistem, baik kamera maupun drone.

Perangkat memiliki informasi umum seperti:

- ID perangkat
- nama perangkat
- harga sewa
- status perangkat

Sementara perangkat turunan memiliki informasi tambahan sesuai jenisnya.

### 📅 Reservasi

Reservasi menghubungkan **penyewa** dengan **perangkat** yang ingin digunakan.

Saat reservasi berhasil dibuat, status perangkat berubah dari:

`Tersedia → Direservasi`

Sistem juga menghitung total biaya berdasarkan harga sewa perangkat dan lama penyewaan.

### 📦 Pengambilan

Pengambilan merupakan tahap lanjutan setelah reservasi dibuat.

Ketika perangkat berhasil diambil:

`Status Reservasi: Dikonfirmasi → Selesai`

dan status perangkat berubah menjadi:

`Direservasi → Disewa`

Dengan demikian, perubahan status dalam program menggambarkan perubahan kondisi perangkat selama proses penyewaan.

---

# 🧩 5. Struktur Class

Program dibagi menjadi tiga package utama:

    Source Packages
    │
    ├── Logic
    │   ├── KelolaPerangkat.java
    │   ├── KelolaReservasi.java
    │   └── KelolaPengambilan.java
    │
    ├── Main
    │   └── SistemPenyewaanPerangkat.java
    │
    └── Model
        ├── Perangkat.java
        ├── Kamera.java
        ├── Drone.java
        ├── Penyewa.java
        ├── Reservasi.java
        └── Pengambilan.java

Pembagian tersebut membuat program memiliki tanggung jawab yang lebih jelas. Package `Model` berisi objek dan data, `Logic` menangani proses pengelolaan data, sedangkan `Main` menjadi pusat interaksi pengguna dengan sistem.

---

# 🌳 6. Hierarki dan Relasi Class

## Hierarki Inheritance

    Perangkat
       ├── Kamera
       └── Drone

`Kamera` dan `Drone` merupakan turunan dari `Perangkat`.

Keduanya mewarisi informasi umum perangkat, kemudian menambahkan karakteristik khusus sesuai jenis perangkat.

## Relasi Antarobjek

    Penyewa
        │
        ▼
    Reservasi ───────► Perangkat
        │
        ▼
    Pengambilan

`Reservasi` menyimpan hubungan antara penyewa dan perangkat yang digunakan.

`Pengambilan` kemudian menggunakan data reservasi sebagai dasar untuk mencatat proses pengambilan perangkat.

---

# 🧱 7. Penjelasan Setiap Class

## `Perangkat`

Merupakan **superclass** yang menjadi dasar bagi jenis perangkat dalam sistem.

Class ini menyimpan atribut umum yang dimiliki oleh semua perangkat dan menyediakan method `tampilkanInfo()` sebagai method yang dapat digunakan oleh subclass.

---

## `Kamera`

Merupakan subclass dari `Perangkat`.

Selain mewarisi atribut dan method dari `Perangkat`, kamera memiliki informasi khusus seperti resolusi dan jenis kamera.

Class ini juga melakukan **method overriding** terhadap `tampilkanInfo()` agar informasi khusus kamera dapat ditampilkan.

---

## `Drone`

Merupakan subclass dari `Perangkat`.

Drone memiliki karakteristik tambahan berupa resolusi kamera dan durasi terbang.

Sama seperti `Kamera`, class `Drone` melakukan overriding terhadap method `tampilkanInfo()`.

---

## `Penyewa`

Menyimpan informasi mengenai pihak yang melakukan penyewaan.

Data penyewa digunakan ketika proses reservasi dibuat sehingga sebuah reservasi dapat dikaitkan dengan penyewa tertentu.

---

## `Reservasi`

Berfungsi merepresentasikan proses pemesanan perangkat.

Class ini menghubungkan:

- penyewa;
- perangkat;
- tanggal reservasi;
- lama sewa;
- status reservasi.

Class `Reservasi` juga memiliki method `hitungTotalHarga()` yang digunakan untuk menghitung biaya berdasarkan harga sewa perangkat dan lama penyewaan.

---

## `Pengambilan`

Merepresentasikan proses pengambilan perangkat setelah reservasi dibuat.

Data pengambilan terhubung dengan objek `Reservasi`, sehingga informasi penyewa dan perangkat dapat diperoleh melalui reservasi tersebut.

---

# 🧠 8. Penerapan Konsep OOP

## 🔹 Inheritance

Inheritance diterapkan dengan menggunakan `extends`.

    Kamera extends Perangkat
    Drone extends Perangkat

Konsep ini memungkinkan atribut dan method umum yang terdapat pada `Perangkat` digunakan kembali oleh `Kamera` dan `Drone`.

Pendekatan ini menghindari penulisan atribut umum yang sama secara berulang pada setiap jenis perangkat.

---

## 🔹 `super`

Constructor pada `Kamera` dan `Drone` menggunakan `super()` untuk memanggil constructor dari superclass `Perangkat`.

Selain itu, method `tampilkanInfo()` pada subclass menggunakan `super.tampilkanInfo()` agar informasi umum perangkat tetap ditampilkan sebelum informasi khusus masing-masing perangkat.

---

## 🔹 Polymorphism

Polymorphism diterapkan melalui overriding method `tampilkanInfo()`.

Contohnya:

    Perangkat perangkat1 = new Kamera(...);
    Perangkat perangkat2 = new Drone(...);

Walaupun tipe referensinya adalah `Perangkat`, Java akan menjalankan method `tampilkanInfo()` sesuai objek sebenarnya.

Dengan demikian:

- objek `Kamera` menampilkan informasi kamera;
- objek `Drone` menampilkan informasi drone.

Implementasi ini dapat diuji melalui menu **Demo Polymorphism** pada program.

---

## 🔹 Encapsulation

Setiap atribut pada class model dibuat menggunakan access modifier `private`.

Akses terhadap data dilakukan melalui getter dan setter.

Pendekatan ini membuat data objek tidak dapat diubah secara langsung dari luar class dan memberikan kontrol terhadap bagaimana data tersebut digunakan.

Contohnya terdapat pada atribut seperti:

    private String status;

Perubahan status dilakukan melalui:

    setStatus()

bukan dengan mengakses atribut secara langsung.

---

# ⚙️ 9. Implementasi Control Flow

Struktur kontrol digunakan untuk mengatur bagaimana program menerima input dan menentukan proses yang harus dijalankan.

### `switch-case`

Digunakan pada menu utama untuk menentukan fitur berdasarkan pilihan pengguna.

Setiap nomor menu memiliki proses yang berbeda, seperti menambah perangkat, melakukan reservasi, hingga keluar dari program.

### `if-else`

Digunakan untuk menangani kondisi tertentu, misalnya:

- memeriksa apakah perangkat tersedia;
- memeriksa validitas lama sewa;
- menentukan perubahan status;
- memeriksa apakah data ditemukan.

### `for`

Digunakan ketika program perlu melakukan iterasi terhadap data yang tersimpan dalam `ArrayList`.

### `while`

Digunakan dalam proses seperti:

- validasi input;
- pencarian ID yang tersedia;
- pembuatan ID otomatis.

### `do-while`

Digunakan pada menu utama agar menu tetap ditampilkan dan program terus berjalan sampai pengguna memilih menu **Keluar**.

---

# 🗂️ 10. Pengelolaan Data dengan ArrayList

Data perangkat, reservasi, dan pengambilan dikelola menggunakan `ArrayList`.

Pendekatan ini dipilih karena jumlah data dalam sistem tidak ditentukan sejak awal.

Ketika pengguna menambahkan perangkat baru, objek tersebut dapat langsung dimasukkan ke dalam `ArrayList`.

Hal ini membuat program lebih fleksibel dibandingkan menggunakan array dengan ukuran tetap.

Pengelolaan data dipisahkan melalui class:

- `KelolaPerangkat`
- `KelolaReservasi`
- `KelolaPengambilan`

Dengan pemisahan tersebut, proses pengelolaan tidak menumpuk di dalam class `Main`.

---

# 🔄 11. Alur Proses Bisnis Sistem

Secara umum, proses sistem dapat digambarkan sebagai berikut:

    Mulai
      │
      ▼
    Menu Utama
      │
      ├── Kelola Perangkat
      │      ├── Tambah
      │      ├── Cari
      │      ├── Ubah Status
      │      └── Hapus
      │
      ├── Buat Reservasi
      │      │
      │      ▼
      │   Periksa Status Perangkat
      │      │
      │      ▼
      │   Reservasi Berhasil
      │      │
      │      ▼
      │   Status = Direservasi
      │
      ├── Catat Pengambilan
      │      │
      │      ▼
      │   Reservasi Diproses
      │      │
      │      ▼
      │   Status Reservasi = Selesai
      │   Status Perangkat = Disewa
      │
      └── Keluar
             │
             ▼
           Selesai

Alur tersebut menunjukkan bahwa fitur dalam program tidak berdiri sendiri, tetapi saling berhubungan melalui objek dan perubahan status.

---

# 🛠️ 12. Fitur Utama Program

Program menyediakan beberapa fitur utama:

| Menu | Fitur | Fungsi |
|---|---|---|
| 1 | Tampilkan Semua Perangkat | Melihat seluruh perangkat |
| 2 | Tambah Kamera | Menambahkan kamera |
| 3 | Tambah Drone | Menambahkan drone |
| 4 | Cari Perangkat | Mencari perangkat berdasarkan ID |
| 5 | Ubah Status | Mengubah status perangkat |
| 6 | Hapus Perangkat | Menghapus data perangkat |
| 7 | Dashboard Sistem | Melihat ringkasan sistem |
| 8 | Rekomendasi Perangkat | Menampilkan rekomendasi berdasarkan kebutuhan |
| 9 | Buat Reservasi | Membuat reservasi perangkat |
| 10 | Tampilkan Reservasi | Melihat data reservasi |
| 11 | Catat Pengambilan | Mencatat pengambilan perangkat |
| 12 | Tampilkan Pengambilan | Melihat data pengambilan |
| 13 | Demo Polymorphism | Menunjukkan penerapan polymorphism |
| 14 | Keluar | Mengakhiri program |

---

# 💡 13. Insight dan Analisis Perancangan

Perancangan program tidak hanya berfokus pada bagaimana membuat menu berjalan, tetapi juga bagaimana setiap objek memiliki peran yang jelas.

### 1. Mengapa `Kamera` dan `Drone` dibuat sebagai subclass?

Kedua perangkat memiliki informasi dasar yang sama, seperti ID, nama, harga sewa, dan status. Namun, keduanya memiliki karakteristik khusus yang berbeda.

Dengan menggunakan inheritance, informasi umum cukup diletakkan pada `Perangkat`, sedangkan karakteristik khusus diletakkan pada subclass masing-masing.

Hal ini membuat struktur program lebih mudah diperluas apabila di kemudian hari terdapat jenis perangkat lain.

---

### 2. Mengapa `Reservasi` dibuat sebagai class tersendiri?

Reservasi bukan hanya sekadar data perangkat atau data penyewa.

Reservasi merupakan objek yang menghubungkan kedua data tersebut sekaligus menyimpan informasi proses penyewaan seperti tanggal, lama sewa, dan status.

Dengan menjadikannya class tersendiri, hubungan tersebut dapat direpresentasikan secara lebih jelas.

---

### 3. Mengapa status perangkat perlu berubah?

Status digunakan untuk merepresentasikan kondisi perangkat dalam proses penyewaan.

Perangkat yang awalnya tersedia dapat berubah menjadi `Direservasi` ketika berhasil dipesan, kemudian menjadi `Disewa` ketika telah diambil.

Perubahan tersebut membuat program tidak hanya berfungsi sebagai penyimpanan data, tetapi juga dapat menggambarkan kondisi perangkat selama proses bisnis berlangsung.

---

### 4. Mengapa proses pengelolaan dipisahkan dari Model?

Class pada package `Model` berfokus pada representasi objek dan datanya.

Sementara class pada package `Logic` bertanggung jawab terhadap proses seperti menambah, mencari, menghapus, dan mengelola data.

Pemisahan ini membuat `Main` tidak perlu menangani seluruh proses secara langsung sehingga struktur program menjadi lebih terorganisasi.

---

### 5. Potensi pengembangan sistem

Struktur program masih dapat dikembangkan lebih lanjut.

Jika sistem dikembangkan menjadi aplikasi yang lebih besar, beberapa pengembangan yang memungkinkan antara lain:

- penyimpanan data menggunakan database;
- antarmuka berbasis GUI atau web;
- sistem login untuk admin dan penyewa;
- validasi data yang lebih lengkap;
- pengelolaan pengembalian perangkat;
- perhitungan denda keterlambatan;
- laporan transaksi;
- pencarian dan filter perangkat berdasarkan kategori.

Dengan struktur class yang sudah dipisahkan, pengembangan tersebut dapat dilakukan tanpa harus mengubah seluruh bagian program dari awal.

---

# 🧪 14. Skenario Pengujian

Pengujian dilakukan dengan menjalankan setiap fitur utama pada program dan memastikan hasil yang ditampilkan sesuai dengan fungsi yang dirancang.

| Fitur | Tujuan Pengujian | Hasil |
|---|---|---|
| Tampilkan Perangkat | Memastikan data perangkat dapat ditampilkan | ✅ Berhasil |
| Tambah Kamera | Memastikan kamera baru dapat disimpan | ✅ Berhasil |
| Tambah Drone | Memastikan drone baru dapat disimpan | ✅ Berhasil |
| Cari Perangkat | Memastikan pencarian berdasarkan ID berjalan | ✅ Berhasil |
| Ubah Status | Memastikan status perangkat dapat diperbarui | ✅ Berhasil |
| Hapus Perangkat | Memastikan perangkat dapat dihapus | ✅ Berhasil |
| Dashboard | Memastikan ringkasan sistem dapat ditampilkan | ✅ Berhasil |
| Rekomendasi | Memastikan rekomendasi perangkat dapat ditampilkan | ✅ Berhasil |
| Reservasi | Memastikan perangkat tersedia dapat dipesan | ✅ Berhasil |
| Pengambilan | Memastikan reservasi dapat diproses | ✅ Berhasil |
| Polymorphism | Memastikan overriding berjalan sesuai objek | ✅ Berhasil |

Detail input dan output dari pengujian ditunjukkan pada dokumentasi screenshot di bawah.

---

# 🖥️ 15. Dokumentasi Output Program

## 15.1 Menu Utama

Menampilkan daftar fitur yang dapat dipilih pengguna.

**Screenshot:**

![Menu Utama](screenshots/menu-utama.png)

---

## 15.2 Data Perangkat

Menampilkan data perangkat yang tersimpan dalam sistem.

**Screenshot:**

![Data Perangkat](screenshots/data-perangkat.png)

---

## 15.3 Tambah Kamera

Menunjukkan proses penambahan perangkat kamera baru ke dalam sistem.

**Screenshot:**

![Tambah Kamera](screenshots/tambah-kamera.png)

---

## 15.4 Tambah Drone

Menunjukkan proses penambahan perangkat drone.

**Screenshot:**

![Tambah Drone](screenshots/tambah-drone.png)

---

## 15.5 Cari Perangkat

Menunjukkan proses pencarian perangkat berdasarkan ID.

**Screenshot:**

![Cari Perangkat](screenshots/cari-perangkat.png)

---

## 15.6 Ubah Status Perangkat

Menunjukkan proses perubahan status perangkat.

**Screenshot:**

![Ubah Status](screenshots/ubah-status.png)

---

## 15.7 Hapus Perangkat

Menunjukkan proses penghapusan data perangkat.

**Screenshot:**

![Hapus Perangkat](screenshots/hapus-perangkat.png)

---

## 15.8 Dashboard Sistem

Menampilkan ringkasan kondisi data dalam sistem.

**Screenshot:**

![Dashboard](screenshots/dashboard.png)

---

## 15.9 Rekomendasi Perangkat

Menampilkan rekomendasi perangkat berdasarkan kebutuhan pengguna.

**Screenshot:**

![Rekomendasi](screenshots/rekomendasi.png)

---

## 15.10 Pembuatan Reservasi

Menunjukkan proses pembuatan reservasi perangkat.

**Screenshot:**

![Buat Reservasi](screenshots/buat-reservasi.png)

---

## 15.11 Data Reservasi

Menampilkan reservasi yang telah dibuat.

**Screenshot:**

![Data Reservasi](screenshots/data-reservasi.png)

---

## 15.12 Pencatatan Pengambilan

Menunjukkan proses pencatatan pengambilan berdasarkan reservasi.

**Screenshot:**

![Catat Pengambilan](screenshots/catat-pengambilan.png)

---

## 15.13 Data Pengambilan

Menampilkan data pengambilan yang telah dicatat.

**Screenshot:**

![Data Pengambilan](screenshots/data-pengambilan.png)

---

## 15.14 Demo Polymorphism

Menunjukkan bagaimana method yang sama dapat menghasilkan informasi berbeda berdasarkan objek turunannya.

**Screenshot:**

![Demo Polymorphism](screenshots/demo-polymorphism.png)

---

## 15.15 Keluar dari Program

Menampilkan pesan ketika pengguna memilih menu keluar.

**Screenshot:**

![Keluar](screenshots/keluar.png)

---

# 📚 16. Dokumentasi Implementasi Konsep PBO

Selain dokumentasi output, implementasi konsep OOP dapat ditunjukkan melalui screenshot kode berikut:

### Inheritance

Screenshot:

![Inheritance](screenshots/inheritance.png)

Menunjukkan hubungan `Perangkat` sebagai superclass dengan `Kamera` dan `Drone` sebagai subclass.

### Polymorphism

Screenshot:

![Polymorphism](screenshots/polymorphism.png)

Menunjukkan penggunaan overriding method `tampilkanInfo()`.

### Encapsulation

Screenshot:

![Encapsulation](screenshots/encapsulation.png)

Menunjukkan penggunaan atribut `private`, getter, dan setter.

### Pengelolaan ArrayList

Screenshot:

![ArrayList](screenshots/arraylist.png)

Menunjukkan penyimpanan objek menggunakan `ArrayList`.

---


# 📊 17. Ringkasan Implementasi

| Konsep / Komponen | Implementasi |
|---|---|
| **Inheritance** | `Kamera` dan `Drone` mewarisi `Perangkat` |
| **Polymorphism** | Overriding `tampilkanInfo()` |
| **Encapsulation** | Atribut `private`, getter, dan setter |
| **ArrayList** | Menyimpan perangkat, reservasi, dan pengambilan |
| **If-Else** | Validasi dan pengambilan keputusan |
| **Switch-Case** | Pengaturan menu utama |
| **For** | Iterasi data |
| **While** | Validasi dan pembuatan ID |
| **Do-While** | Perulangan menu utama |
| **Class & Object** | Seluruh entitas sistem direpresentasikan sebagai object |
| **Package** | Pemisahan Model, Logic, dan Main |

---

# 📝 18. Kesimpulan

Program **Sistem Penyewaan Perangkat** berhasil dibuat sebagai aplikasi Java Console dengan menerapkan konsep dasar Pemrograman Berorientasi Objek.

Program tidak hanya menerapkan konsep OOP pada struktur class, tetapi juga menghubungkan antarobjek melalui alur proses penyewaan. `Perangkat` menjadi dasar untuk jenis perangkat `Kamera` dan `Drone`, sedangkan `Penyewa`, `Reservasi`, dan `Pengambilan` membentuk alur proses bisnis sistem.

Penerapan inheritance, polymorphism, encapsulation, ArrayList, serta berbagai struktur kontrol membuat program memiliki struktur yang lebih terorganisasi dan menggambarkan bagaimana konsep OOP dapat digunakan untuk membangun sebuah sistem sederhana.

---

# 🚀 19. Penutup

Pembuatan proyek ini memberikan gambaran bahwa konsep Pemrograman Berorientasi Objek dapat digunakan untuk memodelkan permasalahan nyata ke dalam bentuk program.

Melalui studi kasus penyewaan perangkat, setiap class dirancang berdasarkan peran yang dimilikinya sehingga hubungan antarobjek dapat direpresentasikan secara lebih terstruktur.

Program ini masih dapat dikembangkan menjadi sistem yang lebih kompleks, terutama dengan penambahan database, antarmuka pengguna, proses pengembalian perangkat, denda keterlambatan, serta sistem laporan. Dengan struktur yang telah dibuat, pengembangan tersebut dapat dilakukan secara bertahap tanpa mengubah keseluruhan rancangan program.
`[Masukkan link GitHub di sini]`

> Repository berisi source code program, README, serta dokumentasi screenshot hasil pengujian.
