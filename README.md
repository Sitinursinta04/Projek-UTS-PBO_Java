# 📷 SISTEM PENYEWAAN PERANGKAT

# 👤 Identitas

**Nama:** Siti Nursinta  
**NIM:** [Isi NIM]  
**Mata Kuliah:** Pemrograman Berorientasi Objek  
**Studi Kasus:** Sistem Penyewaan Perangkat

## 📌 Deskripsi Proyek

**Sistem Penyewaan Perangkat** merupakan aplikasi berbasis **Java Console/CLI** yang dibuat untuk membantu proses pengelolaan penyewaan perangkat, khususnya **kamera dan drone**.

Program ini dibuat sebagai penerapan konsep **Object-Oriented Programming (OOP)** ke dalam sebuah studi kasus yang dekat dengan proses bisnis nyata. Sistem tidak hanya digunakan untuk menampilkan data perangkat, tetapi juga mengelola proses penyewaan mulai dari pengelolaan perangkat, data penyewa, reservasi, hingga pengambilan perangkat.

Konsep PBO yang diterapkan dalam program meliputi:

- 🧬 Inheritance
- 🔄 Polymorphism
- 🔐 Encapsulation
- 🏗️ Constructor
- 📋 ArrayList
- 🔀 If-Else
- 🔀 Switch-Case
- 🔁 For
- 🔁 While
- 🔁 Do-While
- 🔗 Relasi antarobject

Melalui proyek ini, konsep PBO tidak hanya diterapkan secara sintaksis, tetapi digunakan untuk membangun struktur program yang menggambarkan hubungan antarobjek dalam sistem penyewaan.

---

# 🎯 Tujuan Pembuatan Program

Program ini dibuat dengan tujuan:

- 📦 Mengelola data perangkat yang dapat disewa.
- 📷 Mengelola perangkat berupa kamera.
- 🚁 Mengelola perangkat berupa drone.
- 👤 Mengelola data penyewa.
- 📅 Membuat dan mengelola reservasi perangkat.
- 📦 Mencatat proses pengambilan perangkat.
- 💰 Menghitung total biaya penyewaan.
- 🧬 Menerapkan konsep inheritance.
- 🔄 Menerapkan polymorphism melalui method overriding.
- 🔐 Menerapkan encapsulation menggunakan `private`, getter, dan setter.
- 🔀 Menerapkan percabangan `if-else` dan `switch-case`.
- 🔁 Menerapkan perulangan `for`, `while`, dan `do-while`.
- 📋 Menggunakan `ArrayList` untuk menyimpan data secara dinamis.
- 🧩 Membagi program ke dalam beberapa class berdasarkan tanggung jawabnya.

---

# 🏪 Latar Belakang Studi Kasus

Penyewaan kamera dan drone membutuhkan pengelolaan data yang cukup banyak. Data tersebut meliputi informasi perangkat, harga sewa, status perangkat, data penyewa, reservasi, hingga proses pengambilan perangkat.

Apabila proses tersebut dilakukan secara manual, pengelolaan data dapat menjadi kurang terstruktur, terutama ketika jumlah perangkat dan penyewa semakin bertambah.

Berdasarkan permasalahan tersebut, dibuat **Sistem Penyewaan Perangkat** yang dapat membantu menggambarkan proses penyewaan secara terstruktur menggunakan Java.

Sistem ini memiliki alur yang saling berhubungan. Perangkat yang awalnya berstatus **Tersedia** dapat dibuatkan reservasi sehingga statusnya berubah menjadi **Direservasi**. Setelah proses pengambilan dilakukan, status reservasi berubah menjadi **Selesai** dan perangkat berubah menjadi **Disewa**.

Dengan demikian, program tidak hanya berfungsi sebagai penyimpanan data, tetapi juga menggambarkan proses bisnis sederhana dari sebuah sistem penyewaan.

---

# 🏪 Studi Kasus dan Ruang Lingkup Sistem

Studi kasus yang digunakan adalah **sistem penyewaan perangkat kamera dan drone**.

Objek utama dalam sistem terdiri dari:

### 📷 1. Perangkat

`Perangkat` merupakan superclass yang menyimpan karakteristik umum dari perangkat.

Atribut yang dimiliki:

- ID perangkat
- Nama perangkat
- Harga sewa
- Status perangkat

### 📸 2. Kamera

`Kamera` merupakan subclass dari `Perangkat`.

Selain mewarisi informasi umum dari `Perangkat`, kamera memiliki atribut khusus:

- Resolusi
- Jenis kamera

### 🚁 3. Drone

`Drone` juga merupakan subclass dari `Perangkat`.

Atribut khusus yang dimiliki:

- Resolusi kamera
- Durasi terbang

### 👤 4. Penyewa

`Penyewa` digunakan untuk menyimpan informasi orang yang melakukan penyewaan.

Data yang disimpan:

- ID penyewa
- Nama penyewa
- Nomor telepon
- Alamat

### 📅 5. Reservasi

`Reservasi` digunakan untuk merepresentasikan proses pemesanan perangkat.

Data yang disimpan:

- ID reservasi
- Penyewa
- Perangkat
- Tanggal reservasi
- Lama sewa
- Status reservasi

Class ini juga memiliki method `hitungTotalHarga()` untuk menghitung total biaya penyewaan.

### 📦 6. Pengambilan

`Pengambilan` digunakan untuk mencatat proses ketika perangkat yang telah dipesan diambil oleh penyewa.

Data yang disimpan:

- ID pengambilan
- Reservasi
- Tanggal pengambilan
- Jam pengambilan
- Status pengambilan

---

# 🏗️ Struktur Class

Struktur class pada program dibagi menjadi tiga package utama:

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

Pembagian package tersebut dibuat berdasarkan tanggung jawab masing-masing bagian.

### 📁 Model

Berisi class yang merepresentasikan objek dalam sistem, seperti `Perangkat`, `Kamera`, `Drone`, `Penyewa`, `Reservasi`, dan `Pengambilan`.

### 📁 Logic

Berisi class yang menangani proses pengelolaan data, seperti menambah, mencari, menampilkan, dan mengelola reservasi serta pengambilan.

### 📁 Main

Berisi class utama yang menjalankan program dan menyediakan menu interaksi dengan pengguna.

### 💡 Insight

Pembagian tersebut membuat program tidak menumpuk dalam satu class. Jika suatu saat terjadi perubahan pada proses reservasi, bagian yang perlu diperbaiki dapat lebih mudah ditemukan tanpa harus mengubah keseluruhan program.

---

# 🧬 Hierarki Inheritance

Inheritance atau pewarisan diterapkan dengan menjadikan `Perangkat` sebagai superclass dan `Kamera` serta `Drone` sebagai subclass.

    Perangkat
       │
       ├──────────────┐
       ↓              ↓
    Kamera          Drone

Implementasi pada Java:

    public class Kamera extends Perangkat

dan:

    public class Drone extends Perangkat

Dengan menggunakan `extends`, class `Kamera` dan `Drone` dapat mewarisi atribut dan method yang berasal dari `Perangkat`.

### 📌 Atribut umum yang diwariskan

    Perangkat
    ├── idPerangkat
    ├── namaPerangkat
    ├── hargaSewa
    ├── status
    └── tampilkanInfo()

Kemudian masing-masing subclass memiliki atribut tambahan.

    Kamera
    ├── resolusi
    └── jenisKamera

    Drone
    ├── resolusiKamera
    └── durasiTerbang

### 💡 Insight Inheritance

Inheritance digunakan karena kamera dan drone memiliki karakteristik dasar yang sama. Keduanya merupakan perangkat yang memiliki ID, nama, harga sewa, dan status.

Jika atribut tersebut ditulis ulang pada setiap subclass, akan terjadi pengulangan kode.

Dengan inheritance, informasi umum cukup diletakkan pada `Perangkat`, sedangkan subclass hanya menambahkan karakteristik yang memang khusus untuk jenis perangkat tersebut.

Hal ini membuat struktur program menjadi lebih **efisien, terorganisasi, dan mudah dikembangkan**.

Apabila di masa depan ingin menambahkan perangkat lain seperti action camera atau microphone, perangkat tersebut dapat dikembangkan menggunakan struktur yang sudah ada.

---

# 🔄 Polymorphism

Polymorphism diterapkan menggunakan **method overriding**.

Pada superclass `Perangkat` terdapat method:

    public void tampilkanInfo()

Method tersebut kemudian di-override oleh subclass `Kamera` dan `Drone`.

Contoh pada `Kamera`:

    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println(
                "Resolusi       : "
                + resolusi);

        System.out.println(
                "Jenis Kamera   : "
                + jenisKamera);
    }

Sedangkan pada `Drone`:

    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println(
                "Resolusi Kamera: "
                + resolusiKamera);

        System.out.println(
                "Durasi Terbang : "
                + durasiTerbang
                + " menit");
    }

Program juga menunjukkan polymorphism melalui:

    Perangkat perangkat1 = new Kamera(...);
    Perangkat perangkat2 = new Drone(...);

Kemudian:

    perangkat1.tampilkanInfo();
    perangkat2.tampilkanInfo();

Meskipun referensinya menggunakan tipe `Perangkat`, method yang dijalankan mengikuti object sebenarnya, yaitu `Kamera` atau `Drone`.

### 💡 Insight Polymorphism

Polymorphism membuat satu method dapat memiliki perilaku yang berbeda sesuai dengan object yang digunakan.

Hal ini sesuai dengan kondisi sistem karena kamera dan drone sama-sama merupakan perangkat, tetapi informasi khusus yang perlu ditampilkan berbeda.

Kamera menampilkan informasi mengenai jenis kamera dan resolusi, sedangkan drone menampilkan resolusi kamera dan durasi terbang.

Dengan polymorphism, program tidak perlu membuat banyak nama method berbeda. Satu method `tampilkanInfo()` dapat digunakan dan disesuaikan oleh masing-masing subclass.

---

# 🔐 Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut class.

Contohnya:

    private String idPerangkat;
    private String namaPerangkat;
    private double hargaSewa;
    private String status;

Atribut tersebut tidak diakses secara langsung dari luar class.

Untuk mengambil data digunakan getter:

    public String getNamaPerangkat()

Untuk mengubah data tertentu digunakan setter:

    public void setStatus(String status)

### 💡 Insight Encapsulation

Encapsulation membantu menjaga data agar tidak dapat diubah secara sembarangan dari luar class.

Contohnya, status perangkat dapat diubah melalui method:

    perangkat.setStatus("Disewa");

Dengan pendekatan tersebut, akses terhadap data menjadi lebih terkontrol.

Selain itu, jika di masa depan diperlukan validasi sebelum sebuah data diubah, validasi dapat ditempatkan di dalam setter tanpa mengubah kode yang menggunakan object tersebut.

---

# 🔗 Relasi Antarobject

Selain inheritance, terdapat hubungan antarobject dalam sistem.

Relasi utama dapat digambarkan sebagai:

    Penyewa
       │
       ↓
    Reservasi
       │
       ↓
    Perangkat
       │
       ↓
    Pengambilan

Class `Reservasi` memiliki object `Penyewa` dan `Perangkat`:

    private Penyewa penyewa;
    private Perangkat perangkat;

Sedangkan `Pengambilan` memiliki object `Reservasi`:

    private Reservasi reservasi;

Hubungan tersebut menunjukkan bahwa object dalam program tidak berdiri sendiri.

### 💡 Insight

Relasi antarobject membuat program lebih dekat dengan kondisi nyata.

Dalam dunia nyata, seorang penyewa melakukan reservasi terhadap suatu perangkat. Setelah reservasi dibuat, proses berikutnya adalah pengambilan perangkat.

Hubungan tersebut kemudian diterjemahkan ke dalam object sehingga alur program menjadi lebih mudah dipahami.

---

# 📅 Alur Kerja Sistem

Alur utama penyewaan:

    📷 Perangkat tersedia
             ↓
    👤 Penyewa melakukan reservasi
             ↓
    📅 Reservasi dikonfirmasi
             ↓
    🔄 Status perangkat = Direservasi
             ↓
    📦 Penyewa melakukan pengambilan
             ↓
    ✅ Status reservasi = Selesai
             ↓
    🚁 Status perangkat = Disewa

Alur tersebut membuat setiap proses memiliki hubungan dengan proses berikutnya.

### 💡 Insight

Status perangkat digunakan sebagai salah satu bentuk pengendalian proses.

Program tidak hanya menyimpan bahwa suatu perangkat pernah dipesan, tetapi juga mengetahui kondisi perangkat saat ini.

Hal tersebut merupakan contoh sederhana bagaimana data dalam program dapat digunakan untuk merepresentasikan kondisi sebuah proses bisnis.

---

# 💰 Perhitungan Total Harga

Total biaya penyewaan dihitung menggunakan rumus:

    Total Harga = Harga Sewa × Lama Sewa

Implementasi:

    public double hitungTotalHarga() {
        return perangkat.getHargaSewa() * lamaSewa;
    }

Contoh:

    Harga Sewa : Rp250000/hari
    Lama Sewa  : 2 hari

    Total Harga : Rp500000

### 💡 Insight

Perhitungan total harga ditempatkan pada class `Reservasi` karena `Reservasi` memiliki informasi mengenai perangkat yang disewa dan lama penyewaan.

Dengan begitu, proses perhitungan menjadi bagian dari object yang memang bertanggung jawab terhadap data tersebut.

---

# 📋 ArrayList

Program menggunakan `ArrayList` untuk menyimpan data secara dinamis.

Contohnya:

    private ArrayList<Reservasi> daftarReservasi;

dan:

    private ArrayList<Pengambilan> daftarPengambilan;

Data kemudian ditambahkan menggunakan:

    daftarReservasi.add(reservasi);

### 💡 Insight

`ArrayList` dipilih karena jumlah perangkat, reservasi, dan pengambilan tidak selalu diketahui sejak awal.

Berbeda dengan array biasa yang memiliki ukuran tetap, `ArrayList` dapat bertambah ketika pengguna memasukkan data baru.

Hal tersebut membuat struktur penyimpanan data lebih sesuai dengan kebutuhan sistem penyewaan.

---

# 🔁 Implementasi Looping

Program menggunakan tiga jenis perulangan.

## 🔄 1. For

Digunakan untuk menelusuri data yang terdapat dalam `ArrayList`.

Contoh:

    for (Reservasi reservasi : daftarReservasi) {
        reservasi.tampilkanInfo();
    }

Perulangan ini cocok digunakan ketika program perlu memproses setiap data yang terdapat dalam daftar.

---

## 🔄 2. While

Digunakan untuk proses yang membutuhkan pengulangan sampai kondisi tertentu terpenuhi.

Contohnya pada proses pembuatan ID:

    while (true) {
        ...
    }

`while` juga digunakan untuk membantu proses validasi input.

---

## 🔄 3. Do-While

Menu utama menggunakan `do-while`:

    do {
        ...
    } while (pilihan != 14);

Dengan struktur tersebut, menu akan ditampilkan terlebih dahulu kemudian program memeriksa apakah pengguna memilih keluar.

### 💡 Insight

Pemilihan jenis looping disesuaikan dengan kebutuhan.

- `for` → menelusuri kumpulan data.
- `while` → mengulang proses selama kondisi masih terpenuhi.
- `do-while` → menjalankan menu minimal satu kali sebelum memeriksa kondisi keluar.

---

# 🔀 Implementasi If-Else

`if-else` digunakan untuk pengambilan keputusan berdasarkan kondisi.

Contoh pada proses reservasi:

    if (perangkat.getStatus()
            .equalsIgnoreCase("Tersedia")) {

        // Reservasi dibuat

    } else {

        // Perangkat tidak dapat direservasi
    }

Program juga menggunakan `if-else` untuk:

- mengecek perangkat tersedia atau tidak,
- mengecek reservasi ditemukan atau tidak,
- mengecek lama sewa valid atau tidak,
- mengecek apakah data sudah tersedia,
- menentukan status perangkat.

### 💡 Insight

Percabangan membuat program dapat memberikan respons yang berbeda berdasarkan keadaan sistem.

Misalnya, perangkat yang sudah `Direservasi` tidak seharusnya diperlakukan sama dengan perangkat yang masih `Tersedia`.

---

# 🔀 Implementasi Switch-Case

`switch-case` digunakan pada menu utama.

Contohnya:

    switch (pilihan) {

        case 1:
            // Tampilkan semua perangkat
            break;

        case 2:
            // Tambah kamera
            break;

        case 9:
            // Buat reservasi
            break;

        case 14:
            // Keluar
            break;
    }

Setiap nomor menu memiliki fungsi yang berbeda.

Penggunaan `switch-case` membuat pengelolaan pilihan menu menjadi lebih terstruktur dan mudah dibaca.

---

# 🖥️ Fitur Utama Program

| No. | Fitur | Keterangan |
|---|---|---|
| 1 | 📋 Tampilkan Semua Perangkat | Menampilkan seluruh perangkat |
| 2 | 📷 Tambah Kamera | Menambahkan perangkat kamera |
| 3 | 🚁 Tambah Drone | Menambahkan perangkat drone |
| 4 | 🔍 Cari Perangkat | Mencari perangkat berdasarkan ID |
| 5 | 🔄 Ubah Status Perangkat | Mengubah status perangkat |
| 6 | 🗑️ Hapus Perangkat | Menghapus data perangkat |
| 7 | 📊 Dashboard Sistem | Menampilkan ringkasan sistem |
| 8 | 💡 Rekomendasi Perangkat | Memberikan rekomendasi berdasarkan kebutuhan |
| 9 | 📅 Buat Reservasi | Membuat reservasi perangkat |
| 10 | 📋 Tampilkan Semua Reservasi | Menampilkan seluruh data reservasi |
| 11 | 📦 Catat Pengambilan | Mencatat proses pengambilan |
| 12 | 📋 Tampilkan Semua Pengambilan | Menampilkan seluruh data pengambilan |
| 13 | 🔄 Demo Polymorphism | Menampilkan penerapan polymorphism |
| 14 | 🚪 Keluar | Mengakhiri program |

---

# 💡 Insight dari Perancangan Program

Bagian terpenting dari proyek ini bukan hanya bagaimana program dapat dijalankan, tetapi bagaimana konsep PBO digunakan untuk **memodelkan masalah nyata menjadi objek yang saling berhubungan**.

## 🧠 Insight 1 — OOP membantu memecah masalah

Permasalahan penyewaan tidak dibuat menjadi satu proses besar.

Program memecahnya menjadi beberapa objek:

    Perangkat
    Kamera
    Drone
    Penyewa
    Reservasi
    Pengambilan

Setiap object mempunyai tanggung jawab masing-masing.

Dengan cara tersebut, kompleksitas program dapat dibagi menjadi bagian-bagian yang lebih kecil dan mudah dipahami.

---

## 🧠 Insight 2 — Inheritance mengurangi duplikasi

Kamera dan drone sama-sama memiliki informasi dasar sebagai perangkat.

Daripada membuat atribut yang sama berulang kali, atribut umum diletakkan pada `Perangkat`.

Subclass kemudian hanya menambahkan atribut yang spesifik.

Hal ini membuat program lebih ringkas dan struktur class lebih jelas.

---

## 🧠 Insight 3 — Polymorphism memberikan fleksibilitas

Method `tampilkanInfo()` digunakan oleh beberapa jenis perangkat.

Setiap subclass dapat menentukan informasi tambahan yang ditampilkan.

Dengan demikian, jika sistem memiliki jenis perangkat baru, struktur polymorphism dapat dikembangkan tanpa mengubah konsep dasar superclass.

---

## 🧠 Insight 4 — Encapsulation menjaga data

Data object dibuat `private` dan diakses menggunakan getter serta setter.

Hal ini membuat perubahan data lebih terkontrol.

Contohnya, perubahan status perangkat dilakukan melalui method `setStatus()`.

Pendekatan tersebut juga memberikan ruang untuk menambahkan validasi apabila sistem dikembangkan lebih lanjut.

---

## 🧠 Insight 5 — Status perangkat menggambarkan proses bisnis

Status perangkat bukan hanya data biasa.

Status tersebut menggambarkan kondisi perangkat dalam proses penyewaan:

    Tersedia
        ↓
    Direservasi
        ↓
    Disewa

Perubahan status menunjukkan bahwa program mencoba merepresentasikan kondisi nyata dari perangkat.

---

## 🧠 Insight 6 — Class memiliki tanggung jawab masing-masing

`Reservasi` bertanggung jawab terhadap proses reservasi.

`Pengambilan` bertanggung jawab terhadap proses pengambilan.

`KelolaReservasi` bertanggung jawab terhadap pengelolaan data reservasi.

`KelolaPengambilan` bertanggung jawab terhadap pengelolaan data pengambilan.

Pembagian tersebut membuat kode lebih terorganisasi dan mengurangi ketergantungan terhadap satu class saja.

---

## 🧠 Insight 7 — Program dapat dikembangkan

Sistem yang dibuat masih berupa aplikasi console, tetapi struktur class yang digunakan dapat menjadi dasar untuk pengembangan lebih lanjut.

Beberapa pengembangan yang memungkinkan:

- 💳 Sistem pembayaran
- 📄 Cetak bukti penyewaan
- 🔔 Notifikasi pengembalian
- 📊 Laporan pendapatan
- 👥 Login admin
- 🗄️ Database
- 📈 Riwayat penyewaan
- 🔎 Filter perangkat
- 📅 Kalender ketersediaan perangkat

Dengan demikian, proyek ini dapat menjadi dasar dari sistem penyewaan yang lebih kompleks.

---

# 🧪 Skenario Pengujian Program

Pengujian dilakukan menggunakan beberapa skenario untuk memastikan fitur utama berjalan.

## 📋 1. Menampilkan Data Perangkat

Program dijalankan kemudian memilih menu:

    1. Tampilkan Semua Perangkat

Data kamera dan drone yang tersedia ditampilkan.

---

## 📷 2. Menambahkan Kamera

Data yang digunakan:

    ID          : K004
    Nama        : Canon EOS R5
    Harga Sewa  : Rp300000
    Resolusi    : 45 MP
    Jenis       : Mirrorless

Data kemudian ditambahkan ke daftar perangkat.

---

## 🚁 3. Menambahkan Drone

Data yang digunakan:

    ID              : D003
    Nama            : DJI Mavic 3
    Harga Sewa      : Rp600000
    Resolusi Kamera : 48 MP
    Durasi Terbang  : 46 menit

Data kemudian ditambahkan ke daftar perangkat.

---

## 🔍 4. Mencari Perangkat

Perangkat `K004` dicari berdasarkan ID.

Jika ditemukan, program menampilkan informasi perangkat tersebut.

---

## 🔄 5. Mengubah Status

Perangkat `D003` digunakan sebagai contoh perubahan status.

    Tersedia → Disewa

Perubahan dilakukan melalui menu ubah status.

---

## 🗑️ 6. Menghapus Perangkat

Perangkat `K003` digunakan sebagai contoh penghapusan data.

Setelah proses berhasil, perangkat tersebut tidak lagi berada di dalam daftar perangkat.

---

## 💡 7. Menggunakan Rekomendasi

Pengguna memilih:

    1. Fotografi

Program kemudian menampilkan rekomendasi perangkat sesuai kategori yang dipilih.

---

## 📅 8. Membuat Reservasi

Data penyewa:

    ID Penyewa : P001
    Nama       : Andi Pratama
    No. Telepon: 081234567890
    Alamat     : Jl. Merdeka

Perangkat:

    ID         : K001
    Perangkat  : Canon EOS R6

Reservasi:

    Tanggal    : 25-09-2026
    Lama Sewa  : 2 hari

Harga:

    Rp250000 × 2 hari = Rp500000

Reservasi berhasil dibuat dengan:

    ID Reservasi : R001

Status perangkat kemudian berubah:

    Tersedia → Direservasi

---

## 📦 9. Mencatat Pengambilan

Reservasi `R001` digunakan untuk proses pengambilan.

Data:

    Tanggal Pengambilan : 25-09-2026
    Jam Pengambilan     : sesuai input pengguna

Jika berhasil, program menghasilkan:

    ID Pengambilan : PG001

Kemudian:

    Status Reservasi : Selesai
    Status Perangkat : Disewa

---

## 🔄 10. Demo Polymorphism

Program membuat object:

    Perangkat perangkat1 = new Kamera(...);
    Perangkat perangkat2 = new Drone(...);

Kemudian menjalankan:

    perangkat1.tampilkanInfo();
    perangkat2.tampilkanInfo();

Output menunjukkan bahwa method `tampilkanInfo()` memberikan informasi yang sesuai dengan jenis object.

---

# 📸 Dokumentasi Screenshot Output Program

Screenshot hasil running program dapat disimpan di dalam folder:

    screenshots/

Berikut daftar screenshot yang digunakan:

## 🖥️ 1. Menu Utama

File:

    screenshots/menu-utama.png

Menampilkan seluruh menu yang tersedia pada sistem.

---

## 📋 2. Data Perangkat

File:

    screenshots/data-perangkat.png

Menampilkan data kamera dan drone yang tersedia.

---

## 📷 3. Tambah Kamera

File:

    screenshots/tambah-kamera.png

Menampilkan proses penambahan kamera `K004`.

---

## 🚁 4. Tambah Drone

File:

    screenshots/tambah-drone.png

Menampilkan proses penambahan drone `D003`.

---

## 🔍 5. Cari Perangkat

File:

    screenshots/cari-perangkat.png

Menampilkan proses pencarian perangkat `K004`.

---

## 🔄 6. Ubah Status

File:

    screenshots/ubah-status.png

Menampilkan proses perubahan status perangkat `D003`.

---

## 🗑️ 7. Hapus Perangkat

File:

    screenshots/hapus-perangkat.png

Menampilkan proses penghapusan perangkat `K003`.

---

## 📊 8. Dashboard Sistem

File:

    screenshots/dashboard.png

Menampilkan ringkasan informasi sistem.

---

## 💡 9. Rekomendasi Perangkat

File:

    screenshots/rekomendasi.png

Menampilkan hasil rekomendasi untuk kebutuhan fotografi.

---

## 📅 10. Membuat Reservasi

File:

    screenshots/buat-reservasi.png

Menampilkan proses pembuatan reservasi `R001`.

---

## 📋 11. Data Reservasi

File:

    screenshots/data-reservasi.png

Menampilkan data reservasi yang telah dibuat.

---

## 📦 12. Catat Pengambilan

File:

    screenshots/catat-pengambilan.png

Menampilkan proses pencatatan pengambilan `PG001`.

---

## 📋 13. Data Pengambilan

File:

    screenshots/data-pengambilan.png

Menampilkan data pengambilan yang telah dicatat.

---

## 🔄 14. Demo Polymorphism

File:

    screenshots/demo-polymorphism.png

Menampilkan penerapan method overriding pada `Kamera` dan `Drone`.

---

## 🚪 15. Keluar

File:

    screenshots/keluar.png

Menampilkan pesan ketika pengguna memilih menu keluar.

---

# 🧬 Dokumentasi Implementasi Konsep PBO

Selain output program, source code juga dapat didokumentasikan melalui screenshot.

## 🧬 Inheritance

Screenshot bagian:

    public class Kamera extends Perangkat

dan:

    public class Drone extends Perangkat

Screenshot tersebut menunjukkan hubungan superclass dan subclass.

---

## 🔄 Polymorphism

Screenshot bagian:

    @Override
    public void tampilkanInfo()

pada class `Kamera` dan `Drone`.

---

## 🔐 Encapsulation

Screenshot bagian atribut:

    private String namaPerangkat;

serta getter dan setter yang digunakan untuk mengakses data.

---

## 🏗️ Constructor

Screenshot constructor pada masing-masing class untuk menunjukkan proses inisialisasi object.

---

## 🔗 Super

Screenshot penggunaan:

    super(...);

dan:

    super.tampilkanInfo();

untuk menunjukkan pemanggilan constructor dan method dari superclass.

---

# 📁 Struktur Repository GitHub

Struktur repository:

    SistemPenyewaanPerangkat/
    │
    ├── src/
    │   └── main/
    │       └── java/
    │           ├── Logic/
    │           │   ├── KelolaPerangkat.java
    │           │   ├── KelolaReservasi.java
    │           │   └── KelolaPengambilan.java
    │           │
    │           ├── Main/
    │           │   └── SistemPenyewaanPerangkat.java
    │           │
    │           └── Model/
    │               ├── Perangkat.java
    │               ├── Kamera.java
    │               ├── Drone.java
    │               ├── Penyewa.java
    │               ├── Reservasi.java
    │               └── Pengambilan.java
    │
    ├── screenshots/
    │   ├── menu-utama.png
    │   ├── data-perangkat.png
    │   ├── tambah-kamera.png
    │   ├── tambah-drone.png
    │   ├── cari-perangkat.png
    │   ├── ubah-status.png
    │   ├── hapus-perangkat.png
    │   ├── dashboard.png
    │   ├── rekomendasi.png
    │   ├── buat-reservasi.png
    │   ├── data-reservasi.png
    │   ├── catat-pengambilan.png
    │   ├── data-pengambilan.png
    │   ├── demo-polymorphism.png
    │   └── keluar.png
    │
    └── README.md

---

# 📊 Ringkasan Implementasi Ketentuan PBO

| Ketentuan | Implementasi dalam Program |
|---|---|
| 🧬 Inheritance | `Perangkat` menjadi superclass untuk `Kamera` dan `Drone` |
| 🔄 Polymorphism | Method overriding `tampilkanInfo()` |
| 🔐 Encapsulation | Atribut `private`, getter, dan setter |
| 🏗️ Constructor | Digunakan untuk membuat dan menginisialisasi object |
| 🔗 Super | Digunakan untuk memanggil constructor dan method superclass |
| 🔀 If-Else | Validasi status perangkat dan proses sistem |
| 🔀 Switch-Case | Pengaturan menu utama |
| 🔁 For | Menelusuri data pada `ArrayList` |
| 🔁 While | Generate ID dan proses validasi |
| 🔁 Do-While | Perulangan menu utama |
| 📋 ArrayList | Menyimpan data perangkat, reservasi, dan pengambilan |
| 🧩 Class & Object | Model sistem dibuat dalam beberapa class |
| 🔗 Relasi Object | Penyewa, Reservasi, Perangkat, dan Pengambilan saling berhubungan |

---

# 📌 Kesesuaian Program dengan Konsep PBO

Program ini menerapkan konsep PBO tidak hanya dalam bentuk teori, tetapi juga dalam bentuk implementasi yang saling berhubungan.

### 🧬 Inheritance

Hubungan:

    Perangkat
       ├── Kamera
       └── Drone

### 🔄 Polymorphism

Method:

    tampilkanInfo()

diimplementasikan kembali pada subclass dengan `@Override`.

### 🔐 Encapsulation

Data object disimpan menggunakan atribut `private` dan diakses melalui getter serta setter.

### 🏗️ Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

### 🔗 Object Relationship

Object `Penyewa` berhubungan dengan `Reservasi`, `Reservasi` berhubungan dengan `Perangkat`, dan `Pengambilan` berhubungan dengan `Reservasi`.

### 🔀 Control Flow

Program menggunakan:

    if-else
    switch-case
    for
    while
    do-while

sebagai bagian dari proses pengambilan keputusan dan pengulangan.

---

# 📝 Kesimpulan

**Sistem Penyewaan Perangkat** merupakan aplikasi Java Console/CLI yang mengimplementasikan konsep **Object-Oriented Programming** melalui studi kasus penyewaan kamera dan drone.

Program berhasil menggabungkan beberapa konsep PBO seperti **inheritance, polymorphism, encapsulation, constructor, penggunaan `super`, ArrayList, percabangan, dan perulangan** ke dalam sebuah sistem yang memiliki alur proses yang saling berhubungan.

Pembagian class menjadi `Model`, `Logic`, dan `Main` membuat program lebih terstruktur. Setiap class memiliki peran masing-masing sehingga program tidak hanya dapat berjalan, tetapi juga lebih mudah dipahami dan dikembangkan.

Dari sisi pemodelan, `Perangkat` digunakan sebagai superclass karena kamera dan drone memiliki karakteristik umum yang sama. Sementara itu, `Kamera` dan `Drone` menambahkan karakteristik masing-masing untuk menunjukkan perbedaan antarjenis perangkat.

Penggunaan polymorphism melalui method `tampilkanInfo()` juga menunjukkan bahwa satu method dapat memiliki perilaku yang berbeda sesuai dengan object yang digunakan.

---

# 🌱 Penutup

Melalui proyek ini, konsep PBO dapat dipahami sebagai lebih dari sekadar penggunaan syntax Java.

PBO membantu mengubah sebuah permasalahan nyata menjadi kumpulan object yang memiliki **data, perilaku, dan hubungan** satu sama lain.

Pada sistem ini, perangkat, penyewa, reservasi, dan pengambilan tidak dibuat secara terpisah tanpa hubungan. Semua object tersebut disusun untuk membentuk alur penyewaan yang lebih realistis.

✨ **Insight utama dari proyek ini adalah bahwa penerapan PBO dapat membuat program lebih terstruktur karena setiap bagian sistem dapat direpresentasikan melalui object yang memiliki tanggung jawab tertentu.**

Dengan struktur yang sudah dibuat, sistem masih dapat dikembangkan lebih lanjut menjadi aplikasi yang lebih kompleks, misalnya dengan penambahan database, sistem pembayaran, autentikasi pengguna, laporan penyewaan, maupun antarmuka berbasis GUI atau web.
