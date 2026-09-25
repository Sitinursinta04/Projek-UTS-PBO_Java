# 📷 SISTEM PENYEWAAN PERANGKAT

### Aplikasi Java Console untuk Pengelolaan Penyewaan Kamera dan Drone

---

## 👤 IDENTITAS

| Keterangan | Informasi |
|---|---|
| **Nama** | Siti Nursinta |
| **NIM** | `[Isi NIM]` |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Bahasa Pemrograman** | Java |
| **IDE** | NetBeans |
| **Jenis Program** | Console / Command Line Interface |
| **Studi Kasus** | Sistem Penyewaan Perangkat |

---

# 📌 1. DESKRIPSI PROYEK

**Sistem Penyewaan Perangkat** merupakan aplikasi berbasis Java Console yang dibuat untuk mensimulasikan proses pengelolaan penyewaan perangkat fotografi dan videografi, khususnya **kamera dan drone**.

Program menerapkan konsep **Object-Oriented Programming (OOP)** dengan membagi sistem menjadi beberapa class yang memiliki data dan tanggung jawab berbeda.

Sistem mencakup:

- pengelolaan perangkat;
- penambahan kamera dan drone;
- pencarian perangkat;
- perubahan status perangkat;
- penghapusan perangkat;
- dashboard sistem;
- rekomendasi perangkat;
- pembuatan reservasi;
- perhitungan total harga;
- pencatatan pengambilan;
- demonstrasi polymorphism.

---

# 🎯 2. LATAR BELAKANG

Dalam proses penyewaan kamera dan drone, data yang perlu dikelola tidak hanya berupa nama dan harga perangkat. Sistem juga perlu mengetahui identitas penyewa, perangkat yang dipilih, tanggal reservasi, lama penyewaan, total harga, dan status perangkat.

Agar setiap bagian sistem lebih mudah dikelola, program menggunakan pendekatan **Object-Oriented Programming**.

Objek yang terdapat dalam proses bisnis dimodelkan menjadi beberapa class. `Perangkat` menjadi dasar untuk `Kamera` dan `Drone`, sedangkan `Penyewa`, `Reservasi`, dan `Pengambilan` digunakan untuk menggambarkan proses penyewaan.

Dengan rancangan tersebut, program tidak hanya menjalankan fungsi penyewaan, tetapi juga menunjukkan penerapan konsep OOP pada sebuah studi kasus yang memiliki beberapa objek dan hubungan antarobjek.

---

# 💡 3. TUJUAN PROYEK

Program dibuat untuk:

- menerapkan class dan object;
- menerapkan inheritance;
- menggunakan `extends` dan `super`;
- menerapkan polymorphism melalui overriding;
- menerapkan encapsulation;
- menggunakan constructor, getter, dan setter;
- menggunakan `ArrayList`;
- menerapkan `if-else`, `switch-case`, `for`, `while`, dan `do-while`;
- menghubungkan beberapa object dalam satu alur bisnis;
- memisahkan bagian `Model`, `Logic`, dan `Main`.

---

# 🧩 4. STRUKTUR PROJECT

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

### Pembagian tanggung jawab

| Package | Tanggung Jawab |
|---|---|
| `Model` | Merepresentasikan objek dan data |
| `Logic` | Mengatur proses pengelolaan objek |
| `Main` | Menjalankan program dan interaksi pengguna |

---

# 🌳 5. HIERARKI CLASS

    Perangkat
    ├── Kamera
    └── Drone

Relasi objek:

    Penyewa
       │
       ▼
    Reservasi ─────────► Perangkat
       │
       ▼
    Pengambilan

Alur utama:

    Penyewa
       ↓
    Membuat Reservasi
       ↓
    Memilih Perangkat
       ↓
    Reservasi Tersimpan
       ↓
    Pengambilan Perangkat

---

# 🧱 6. CLASS DAN TANGGUNG JAWABNYA

## 6.1 `Perangkat`

Superclass yang menyimpan informasi umum seluruh perangkat.

**Atribut:**

    idPerangkat
    namaPerangkat
    hargaSewa
    status

**Tanggung jawab:**

- menyimpan informasi dasar perangkat;
- menyediakan getter dan setter;
- menampilkan informasi perangkat;
- menjadi superclass untuk `Kamera` dan `Drone`.

---

## 6.2 `Kamera`

Subclass dari `Perangkat`.

**Atribut tambahan:**

    resolusi
    jenisKamera

**Tanggung jawab:**

- menyimpan karakteristik kamera;
- mewarisi data umum dari `Perangkat`;
- melakukan overriding terhadap `tampilkanInfo()`.

---

## 6.3 `Drone`

Subclass dari `Perangkat`.

**Atribut tambahan:**

    resolusiKamera
    durasiTerbang

**Tanggung jawab:**

- menyimpan karakteristik drone;
- mewarisi data umum dari `Perangkat`;
- melakukan overriding terhadap `tampilkanInfo()`.

---

## 6.4 `Penyewa`

Menyimpan data orang yang melakukan penyewaan.

**Atribut:**

    idPenyewa
    namaPenyewa
    noTelepon
    alamat

---

## 6.5 `Reservasi`

Mencatat proses pemesanan perangkat.

**Atribut:**

    idReservasi
    penyewa
    perangkat
    tanggalReservasi
    lamaSewa
    statusReservasi

**Tanggung jawab:**

- menyimpan data reservasi;
- menghubungkan `Penyewa` dengan `Perangkat`;
- menghitung total harga;
- menyimpan status reservasi.

---

## 6.6 `Pengambilan`

Mencatat proses pengambilan perangkat.

**Atribut:**

    idPengambilan
    reservasi
    tanggalPengambilan
    jamPengambilan
    statusPengambilan

**Tanggung jawab:**

- menghubungkan proses pengambilan dengan reservasi;
- menyimpan waktu pengambilan;
- menyimpan status pengambilan.

---

# 🧬 7. IMPLEMENTASI KONSEP OOP

## 7.1 Inheritance

Inheritance digunakan agar `Kamera` dan `Drone` dapat mewarisi karakteristik umum dari `Perangkat`.

    public class Kamera extends Perangkat

    public class Drone extends Perangkat

Dengan demikian, atribut seperti ID, nama, harga sewa, dan status tidak perlu dibuat ulang pada masing-masing subclass.

---

## 7.2 `super`

Constructor subclass menggunakan `super()`:

    super(
        idPerangkat,
        namaPerangkat,
        hargaSewa,
        status
    );

`super()` digunakan untuk memanggil constructor superclass.

Subclass juga menggunakan:

    super.tampilkanInfo();

untuk menjalankan method milik `Perangkat` sebelum menampilkan informasi khusus subclass.

---

## 7.3 Polymorphism

Polymorphism diterapkan melalui overriding.

Pada `Kamera`:

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

Pada `Drone`:

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

Penggunaan referensi superclass juga ditunjukkan melalui:

    Perangkat perangkat1 =
            new Kamera(...);

    Perangkat perangkat2 =
            new Drone(...);

    perangkat1.tampilkanInfo();
    perangkat2.tampilkanInfo();

Walaupun referensinya bertipe `Perangkat`, method yang dijalankan menyesuaikan object sebenarnya.

---

## 7.4 Encapsulation

Atribut pada model dibuat `private`.

Contoh:

    private String status;

Akses dilakukan melalui getter:

    public String getStatus() {
        return status;
    }

Perubahan nilai dilakukan melalui setter:

    public void setStatus(String status) {
        this.status = status;
    }

Pendekatan ini membuat data object tidak diubah secara langsung dari luar class.

---

# 🗃️ 8. PENGELOLAAN DATA DENGAN ARRAYLIST

Data yang jumlahnya dapat berubah selama program berjalan dikelola menggunakan `ArrayList`.

Contoh pada `KelolaReservasi`:

    private ArrayList<Reservasi> daftarReservasi;

    public KelolaReservasi() {
        daftarReservasi = new ArrayList<>();
    }

Data ditambahkan dengan:

    daftarReservasi.add(reservasi);

Data ditampilkan menggunakan perulangan:

    for (Reservasi reservasi : daftarReservasi) {
        reservasi.tampilkanInfo();
    }

Konsep yang sama digunakan pada pengelolaan perangkat dan pengambilan.

---

# 🆔 9. GENERATE ID OTOMATIS

Program menggunakan ID otomatis untuk reservasi dan pengambilan.

### Reservasi

Format ID:

    R001
    R002
    R003

Kode:

    String id = String.format("R%03d", nomor);

Program kemudian memastikan ID belum digunakan:

    if (cariReservasi(id) == null) {
        return id;
    }

### Pengambilan

Format ID:

    PG001
    PG002
    PG003

Pendekatan ini mengurangi kemungkinan terjadinya ID yang sama dan membuat pengguna tidak perlu menentukan ID reservasi atau pengambilan secara manual.

---

# 🔄 10. IMPLEMENTASI CONTROL FLOW

Program menggunakan beberapa bentuk control flow yang saling melengkapi.

### `switch-case`

Digunakan untuk menentukan proses berdasarkan menu yang dipilih pengguna.

    switch (pilihan) {
        case 1:
            // tampilkan perangkat
            break;

        case 2:
            // tambah kamera
            break;

        case 9:
            // buat reservasi
            break;

        case 14:
            // keluar
            break;
    }

### `if-else`

Digunakan untuk menentukan apakah suatu kondisi terpenuhi.

Contohnya ketika melakukan reservasi:

    if (perangkat.getStatus()
            .equalsIgnoreCase("Tersedia")) {

        // proses reservasi

    } else {

        System.out.println(
            "Perangkat tidak dapat direservasi."
        );
    }

### `for`

Digunakan untuk membaca kumpulan data:

    for (Reservasi reservasi : daftarReservasi) {
        reservasi.tampilkanInfo();
    }

### `while`

Digunakan ketika proses harus dilakukan berulang sampai kondisi tertentu terpenuhi.

Contohnya pada pembuatan ID:

    while (true) {

        String id =
                String.format("R%03d", nomor);

        if (cariReservasi(id) == null) {
            return id;
        }

        nomor++;
    }

### `do-while`

Menu utama menggunakan:

    do {

        // tampilkan menu
        // input pilihan
        // jalankan proses

    } while (pilihan != 14);

Dengan demikian, menu tetap berjalan sampai pengguna memilih menu keluar.

---

# 📅 11. ALUR PROSES PENYEWAAN

Alur utama sistem:

    ┌──────────────────────┐
    │       Perangkat      │
    │   Kamera / Drone     │
    └──────────┬───────────┘
               │
               ▼
    ┌──────────────────────┐
    │        Penyewa       │
    └──────────┬───────────┘
               │
               ▼
    ┌──────────────────────┐
    │       Reservasi      │
    │                      │
    │ Pilih perangkat      │
    │ Tentukan tanggal     │
    │ Tentukan lama sewa   │
    └──────────┬───────────┘
               │
               ▼
    ┌──────────────────────┐
    │    Pengambilan       │
    │       Perangkat      │
    └──────────┬───────────┘
               │
               ▼
    ┌──────────────────────┐
    │       Selesai        │
    └──────────────────────┘

Status perangkat dalam proses:

    Tersedia
       ↓
    Direservasi
       ↓
    Disewa

Status tersebut menjadi bagian penting dalam sistem karena menentukan apakah perangkat masih dapat dipilih untuk reservasi.

---

# 💰 12. PERHITUNGAN TOTAL HARGA

Total harga dihitung berdasarkan:

    Harga Sewa × Lama Sewa

Implementasinya:

    public double hitungTotalHarga() {
        return perangkat.getHargaSewa() * lamaSewa;
    }

Contoh:

    Harga Sewa = Rp250.000
    Lama Sewa  = 2 hari

    Total = Rp250.000 × 2
          = Rp500.000

Perhitungan diletakkan pada class `Reservasi` karena informasi harga perangkat dan lama penyewaan merupakan bagian dari proses reservasi.

---

# 🔐 13. VALIDASI PROSES

Program melakukan pemeriksaan sebelum menjalankan beberapa proses.

Contoh pada reservasi:

    if (perangkat.getStatus()
            .equalsIgnoreCase("Tersedia")) {

        // reservasi berhasil diproses

    } else {

        System.out.println(
            "Perangkat tidak dapat direservasi."
        );
    }

Program juga memeriksa lama sewa:

    if (lamaSewa <= 0) {
        System.out.println(
            "Lama sewa harus lebih dari 0."
        );
    }

Validasi tersebut digunakan agar data yang masuk tidak langsung diproses tanpa pemeriksaan kondisi.

---

# ⚙️ 14. FITUR UTAMA PROGRAM

| Menu | Fitur | Fungsi |
|---:|---|---|
| 1 | Tampilkan Semua Perangkat | Menampilkan seluruh perangkat |
| 2 | Tambah Kamera | Menambahkan data kamera |
| 3 | Tambah Drone | Menambahkan data drone |
| 4 | Cari Perangkat | Mencari perangkat berdasarkan ID |
| 5 | Ubah Status | Mengubah status perangkat |
| 6 | Hapus Perangkat | Menghapus perangkat |
| 7 | Dashboard Sistem | Menampilkan ringkasan sistem |
| 8 | Rekomendasi | Memberikan rekomendasi berdasarkan kebutuhan |
| 9 | Buat Reservasi | Membuat reservasi penyewaan |
| 10 | Data Reservasi | Menampilkan seluruh reservasi |
| 11 | Catat Pengambilan | Mencatat proses pengambilan |
| 12 | Data Pengambilan | Menampilkan seluruh pengambilan |
| 13 | Demo Polymorphism | Menunjukkan overriding |
| 14 | Keluar | Mengakhiri program |

---

# 🧪 15. SKENARIO PENGUJIAN PROGRAM

Pengujian dilakukan melalui beberapa skenario agar fitur utama program dapat ditampilkan.

> **Catatan:** Data input tidak perlu ditulis ulang secara panjang di bagian ini karena data dan hasil proses sudah dapat dilihat pada screenshot output program.

## 15.1 Pengelolaan Perangkat

Pengujian meliputi:

- menampilkan perangkat awal;
- menambahkan kamera;
- menambahkan drone;
- mencari perangkat;
- mengubah status perangkat;
- menghapus perangkat.

## 15.2 Reservasi

Pengujian dilakukan dengan memilih perangkat yang tersedia, mengisi data penyewa, tanggal reservasi, dan lama sewa.

Program kemudian menghasilkan ID reservasi dan menghitung total harga.

## 15.3 Pengambilan

Pengujian dilakukan menggunakan ID reservasi yang telah dibuat.

Program mencatat tanggal dan jam pengambilan serta memperbarui status terkait.

## 15.4 Polymorphism

Pengujian dilakukan dengan membuat object `Kamera` dan `Drone` menggunakan referensi bertipe `Perangkat`.

Hasil overriding dapat dilihat pada output menu **Demo Polymorphism**.

---

# 🖥️ 16. DOKUMENTASI OUTPUT PROGRAM

Bagian ini digunakan untuk menempatkan screenshot hasil program dari NetBeans.

## 16.1 Menu Utama

**File:** `menu-utama.png`

![Menu Utama](screenshots/menu-utama.png)

Menampilkan seluruh pilihan menu yang tersedia pada sistem.

---

## 16.2 Data Perangkat

**File:** `data-perangkat.png`

![Data Perangkat](screenshots/data-perangkat.png)

Menampilkan daftar kamera dan drone yang tersedia pada sistem.

---

## 16.3 Tambah Kamera

**File:** `tambah-kamera.png`

![Tambah Kamera](screenshots/tambah-kamera.png)

Menampilkan proses penambahan perangkat kamera.

---

## 16.4 Tambah Drone

**File:** `tambah-drone.png`

![Tambah Drone](screenshots/tambah-drone.png)

Menampilkan proses penambahan perangkat drone.

---

## 16.5 Cari Perangkat

**File:** `cari-perangkat.png`

![Cari Perangkat](screenshots/cari-perangkat.png)

Menampilkan proses pencarian perangkat berdasarkan ID.

---

## 16.6 Ubah Status Perangkat

**File:** `ubah-status.png`

![Ubah Status](screenshots/ubah-status.png)

Menampilkan proses perubahan status perangkat.

---

## 16.7 Hapus Perangkat

**File:** `hapus-perangkat.png`

![Hapus Perangkat](screenshots/hapus-perangkat.png)

Menampilkan proses penghapusan perangkat.

---

## 16.8 Dashboard Sistem

**File:** `dashboard.png`

![Dashboard](screenshots/dashboard.png)

Menampilkan ringkasan kondisi data pada sistem.

---

## 16.9 Rekomendasi Perangkat

**File:** `rekomendasi.png`

![Rekomendasi](screenshots/rekomendasi.png)

Menampilkan rekomendasi perangkat berdasarkan kebutuhan pengguna.

---

## 16.10 Pembuatan Reservasi

**File:** `buat-reservasi.png`

![Buat Reservasi](screenshots/buat-reservasi.png)

Menampilkan proses pembuatan reservasi.

---

## 16.11 Data Reservasi

**File:** `data-reservasi.png`

![Data Reservasi](screenshots/data-reservasi.png)

Menampilkan data reservasi yang telah dibuat.

---

## 16.12 Pencatatan Pengambilan

**File:** `catat-pengambilan.png`

![Catat Pengambilan](screenshots/catat-pengambilan.png)

Menampilkan proses pencatatan pengambilan perangkat.

---

## 16.13 Data Pengambilan

**File:** `data-pengambilan.png`

![Data Pengambilan](screenshots/data-pengambilan.png)

Menampilkan data pengambilan yang telah dicatat.

---

## 16.14 Demo Polymorphism

**File:** `demo-polymorphism.png`

![Demo Polymorphism](screenshots/demo-polymorphism.png)

Menampilkan hasil method overriding pada object `Kamera` dan `Drone`.

---

## 16.15 Keluar Program

**File:** `keluar.png`

![Keluar Program](screenshots/keluar.png)

Menampilkan output ketika pengguna memilih menu keluar.

---

# 🧠 17. INSIGHT DAN ANALISIS PERANCANGAN

Program ini tidak hanya dibuat agar menu dapat berjalan, tetapi juga dirancang berdasarkan hubungan antarobjek dalam proses penyewaan.

### 17.1 Mengapa `Kamera` dan `Drone` menjadi subclass?

Kamera dan drone sama-sama merupakan perangkat yang dapat disewa. Keduanya memiliki informasi umum seperti ID, nama, harga, dan status.

Namun, keduanya mempunyai karakteristik khusus yang berbeda.

Kamera memiliki:

    resolusi
    jenisKamera

Sedangkan drone memiliki:

    resolusiKamera
    durasiTerbang

Karena terdapat data yang sama sekaligus data khusus, inheritance menjadi pendekatan yang sesuai untuk menghindari pengulangan atribut umum.

---

### 17.2 Mengapa `Reservasi` menyimpan object `Penyewa` dan `Perangkat`?

Reservasi merupakan titik yang menghubungkan pihak yang menyewa dengan perangkat yang dipilih.

Daripada hanya menyimpan nama penyewa dan nama perangkat sebagai `String`, program menyimpan object:

    private Penyewa penyewa;
    private Perangkat perangkat;

Dengan pendekatan tersebut, `Reservasi` dapat mengakses informasi object secara langsung.

Contohnya:

    penyewa.getNamaPenyewa()

dan:

    perangkat.getNamaPerangkat()

Hal ini membuat hubungan antarobjek lebih jelas.

---

### 17.3 Mengapa status perangkat perlu diubah?

Status digunakan untuk menggambarkan kondisi perangkat dalam proses penyewaan.

    Tersedia
        ↓
    Direservasi
        ↓
    Disewa

Status tersebut juga digunakan dalam pengambilan keputusan program.

Contohnya, perangkat yang tidak berstatus `Tersedia` tidak dapat langsung dibuatkan reservasi.

Dengan demikian, status bukan hanya informasi tampilan, tetapi juga menjadi bagian dari aturan bisnis sistem.

---

### 17.4 Mengapa proses pengambilan menggunakan `Reservasi`?

`Pengambilan` tidak dibuat sebagai proses yang berdiri sendiri.

Pengambilan harus mengacu pada reservasi yang telah dibuat karena informasi perangkat dan penyewa sudah tersedia pada reservasi.

Hubungannya:

    Reservasi
       │
       ├── Penyewa
       │
       └── Perangkat
              ↓
         Pengambilan

Pendekatan ini menghindari penginputan ulang data penyewa dan perangkat ketika melakukan pengambilan.

---

### 17.5 Mengapa logic dipisahkan dari model?

Class model bertanggung jawab terhadap object dan datanya, sedangkan class logic menangani proses pengelolaan.

Contohnya:

    Model
    └── Reservasi

    Logic
    └── KelolaReservasi

`Reservasi` menyimpan informasi reservasi, sedangkan `KelolaReservasi` menangani proses seperti membuat, mencari, dan menampilkan reservasi.

Pemisahan ini membuat kode lebih mudah dipahami dan lebih mudah dikembangkan.

---

# 📊 19. RINGKASAN PENERAPAN PBO

| Konsep | Implementasi |
|---|---|
| **Class** | `Perangkat`, `Kamera`, `Drone`, `Penyewa`, `Reservasi`, `Pengambilan` |
| **Object** | Object kamera, drone, penyewa, reservasi, dan pengambilan |
| **Inheritance** | `Kamera extends Perangkat`, `Drone extends Perangkat` |
| **Super** | Constructor dan method superclass dipanggil menggunakan `super` |
| **Polymorphism** | Overriding `tampilkanInfo()` |
| **Encapsulation** | Atribut `private`, getter, dan setter |
| **Constructor** | Digunakan pada seluruh class model |
| **ArrayList** | Menyimpan kumpulan perangkat, reservasi, dan pengambilan |
| **If-Else** | Validasi status perangkat dan input |
| **Switch-Case** | Pengaturan menu utama |
| **For** | Menampilkan dan mencari data dalam collection |
| **While** | Generate ID dan validasi proses tertentu |
| **Do-While** | Menjalankan menu utama sampai pengguna keluar |

---

# 🔍 20. CONTOH ALUR PROGRAM

Salah satu alur penggunaan sistem:

    1. Program dijalankan
           ↓
    2. Menu utama ditampilkan
           ↓
    3. Pengguna melihat perangkat
           ↓
    4. Pengguna memilih perangkat
           ↓
    5. Pengguna membuat reservasi
           ↓
    6. Sistem menghitung total harga
           ↓
    7. Status perangkat menjadi Direservasi
           ↓
    8. Pengguna mencatat pengambilan
           ↓
    9. Status reservasi diperbarui
           ↓
    10. Status perangkat diperbarui
           ↓
    11. Pengguna dapat melihat data
           ↓
    12. Pengguna keluar dari program

Alur tersebut menunjukkan bahwa setiap fitur saling berhubungan dan bukan sekadar kumpulan menu yang berdiri sendiri.

---

# 📝 23. KESIMPULAN

Sistem Penyewaan Perangkat merupakan aplikasi Java Console yang mengimplementasikan konsep Object-Oriented Programming melalui beberapa class yang saling berhubungan.

Konsep **inheritance** diterapkan melalui hubungan `Perangkat` dengan `Kamera` dan `Drone`. **Polymorphism** diterapkan melalui overriding method `tampilkanInfo()`. **Encapsulation** diterapkan melalui penggunaan atribut `private` serta getter dan setter.

Selain konsep utama PBO, program juga menerapkan constructor, `ArrayList`, percabangan, perulangan, validasi, serta hubungan antarobject.

Dari sisi perancangan, pembagian `Model`, `Logic`, dan `Main` membuat program lebih terstruktur karena setiap bagian memiliki tanggung jawab yang berbeda.

Alur `Penyewa → Reservasi → Perangkat → Pengambilan` juga membuat program memiliki proses bisnis yang saling terhubung sehingga program tidak hanya menampilkan data, tetapi mampu mensimulasikan proses penyewaan dari awal sampai pengambilan perangkat.

---

# 🎓 24. PENUTUP

Melalui proyek ini, konsep-konsep Pemrograman Berorientasi Objek tidak hanya diterapkan secara terpisah, tetapi digunakan untuk membangun sebuah sistem yang memiliki hubungan antarclass dan alur proses yang jelas.

Perancangan sistem menunjukkan bahwa pemilihan struktur class sangat berpengaruh terhadap keteraturan program. Dengan adanya superclass, subclass, encapsulation, polymorphism, collection, serta pemisahan logic, program menjadi lebih mudah dipahami dan memiliki dasar yang lebih baik untuk dikembangkan.

Pengembangan selanjutnya dapat diarahkan pada penggunaan database, antarmuka GUI atau web, autentikasi pengguna, sistem pembayaran, pengembalian perangkat, serta pengelolaan riwayat penyewaan.

---
       Status Perangkat

**Konsep utama:** Class, Object, Inheritance, Encapsulation, Polymorphism, Constructor, ArrayList, Percabangan, dan Perulangan.
