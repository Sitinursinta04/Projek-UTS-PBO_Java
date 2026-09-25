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

# 🎯 3. TUJUAN PROYEK

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

```text
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
```

### Pembagian Tanggung Jawab

| Package | Tanggung Jawab |
|---|---|
| `Model` | Merepresentasikan objek dan data |
| `Logic` | Mengatur proses pengelolaan objek |
| `Main` | Menjalankan program dan interaksi pengguna |

---

# 🌳 5. HIERARKI CLASS

```text
Perangkat
├── Kamera
└── Drone
```

Hubungan antarobjek:

```text
Penyewa
   │
   ▼
Reservasi ─────────► Perangkat
   │
   ▼
Pengambilan
```

### Alur Utama

```text
Penyewa
   ↓
Membuat Reservasi
   ↓
Memilih Perangkat
   ↓
Reservasi Tersimpan
   ↓
Pengambilan Perangkat
```

---

# 🧱 6. CLASS DAN TANGGUNG JAWABNYA

## 6.1 `Perangkat`

`Perangkat` merupakan superclass yang menyimpan informasi umum dari seluruh perangkat.

**Atribut:**

```text
idPerangkat
namaPerangkat
hargaSewa
status
```

**Tanggung jawab:**

- menyimpan informasi dasar perangkat;
- menyediakan getter dan setter;
- menampilkan informasi perangkat;
- menjadi superclass untuk `Kamera` dan `Drone`.

---

## 6.2 `Kamera`

`Kamera` merupakan subclass dari `Perangkat`.

**Atribut tambahan:**

```text
resolusi
jenisKamera
```

**Tanggung jawab:**

- menyimpan karakteristik kamera;
- mewarisi data umum dari `Perangkat`;
- melakukan overriding terhadap `tampilkanInfo()`.

---

## 6.3 `Drone`

`Drone` merupakan subclass dari `Perangkat`.

**Atribut tambahan:**

```text
resolusiKamera
durasiTerbang
```

**Tanggung jawab:**

- menyimpan karakteristik drone;
- mewarisi data umum dari `Perangkat`;
- melakukan overriding terhadap `tampilkanInfo()`.

---

## 6.4 `Penyewa`

`Penyewa` digunakan untuk menyimpan data orang yang melakukan penyewaan.

**Atribut:**

```text
idPenyewa
namaPenyewa
noTelepon
alamat
```

---

## 6.5 `Reservasi`

`Reservasi` digunakan untuk mencatat proses pemesanan perangkat.

**Atribut:**

```text
idReservasi
penyewa
perangkat
tanggalReservasi
lamaSewa
statusReservasi
```

**Tanggung jawab:**

- menyimpan data reservasi;
- menghubungkan `Penyewa` dengan `Perangkat`;
- menghitung total harga;
- menyimpan status reservasi.

---

## 6.6 `Pengambilan`

`Pengambilan` digunakan untuk mencatat proses pengambilan perangkat.

**Atribut:**

```text
idPengambilan
reservasi
tanggalPengambilan
jamPengambilan
statusPengambilan
```

**Tanggung jawab:**

- menghubungkan proses pengambilan dengan reservasi;
- menyimpan waktu pengambilan;
- menyimpan status pengambilan.

---

# 🧬 7. IMPLEMENTASI KONSEP OOP

## 7.1 Inheritance

Inheritance digunakan agar `Kamera` dan `Drone` dapat mewarisi karakteristik umum dari `Perangkat`.

```java
public class Kamera extends Perangkat
```

```java
public class Drone extends Perangkat
```

Dengan inheritance, atribut seperti ID, nama, harga sewa, dan status tidak perlu dibuat ulang pada masing-masing subclass.

**Insight:**  
`Kamera` dan `Drone` sama-sama merupakan jenis perangkat yang dapat disewa sehingga memiliki data umum yang sama. Data yang sama ditempatkan pada `Perangkat`, sedangkan karakteristik khusus ditempatkan pada masing-masing subclass.

---

## 7.2 `super`

Constructor subclass menggunakan `super()`:

```java
super(
    idPerangkat,
    namaPerangkat,
    hargaSewa,
    status
);
```

`super()` digunakan untuk memanggil constructor milik superclass.

Subclass juga menggunakan:

```java
super.tampilkanInfo();
```

untuk menjalankan method milik `Perangkat` sebelum menampilkan informasi khusus subclass.

**Insight:**  
Penggunaan `super()` membuat subclass dapat memanfaatkan proses inisialisasi dan method yang sudah tersedia pada superclass tanpa menuliskan kembali kode yang sama.

---

## 7.3 Polymorphism

Polymorphism diterapkan melalui **method overriding**.

Pada `Kamera`:

```java
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
```

Pada `Drone`:

```java
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
```

Penggunaan referensi superclass juga ditunjukkan melalui:

```java
Perangkat perangkat1 =
        new Kamera(...);

Perangkat perangkat2 =
        new Drone(...);

perangkat1.tampilkanInfo();
perangkat2.tampilkanInfo();
```

Walaupun referensinya bertipe `Perangkat`, method yang dijalankan menyesuaikan object sebenarnya.

**Insight:**  
Overriding memungkinkan method dengan nama yang sama memberikan hasil yang berbeda sesuai jenis object. Dengan demikian, `Kamera` dapat menampilkan informasi khusus kamera dan `Drone` dapat menampilkan informasi khusus drone.

---

## 7.4 Encapsulation

Atribut pada model dibuat `private`.

Contoh:

```java
private String status;
```

Akses dilakukan melalui getter:

```java
public String getStatus() {
    return status;
}
```

Perubahan nilai dilakukan melalui setter:

```java
public void setStatus(String status) {
    this.status = status;
}
```

**Insight:**  
Encapsulation digunakan agar data internal object tidak dapat diakses dan diubah secara langsung dari luar class. Akses data dilakukan melalui method yang telah disediakan.

---

# 🗃️ 8. PENGELOLAAN DATA DENGAN ARRAYLIST

Data yang jumlahnya dapat berubah selama program berjalan dikelola menggunakan `ArrayList`.

Contoh pada `KelolaReservasi`:

```java
private ArrayList<Reservasi> daftarReservasi;

public KelolaReservasi() {
    daftarReservasi = new ArrayList<>();
}
```

Data ditambahkan dengan:

```java
daftarReservasi.add(reservasi);
```

Data ditampilkan menggunakan perulangan:

```java
for (Reservasi reservasi : daftarReservasi) {
    reservasi.tampilkanInfo();
}
```

Konsep yang sama digunakan pada pengelolaan perangkat dan pengambilan.

**Insight:**  
`ArrayList` dipilih karena jumlah data perangkat, reservasi, dan pengambilan dapat bertambah selama program berjalan. Dengan demikian, program tidak perlu menentukan jumlah data sejak awal.

---

# 🆔 9. GENERATE ID OTOMATIS

Program menggunakan ID otomatis untuk reservasi dan pengambilan.

### Reservasi

Format ID:

```text
R001
R002
R003
```

Kode:

```java
String id = String.format("R%03d", nomor);
```

Program kemudian memastikan ID belum digunakan:

```java
if (cariReservasi(id) == null) {
    return id;
}
```

### Pengambilan

Format ID:

```text
PG001
PG002
PG003
```

**Insight:**  
Pembuatan ID secara otomatis mengurangi kemungkinan terjadinya ID yang sama dan membuat pengguna tidak perlu menentukan ID reservasi atau pengambilan secara manual.

---

# 🔄 10. IMPLEMENTASI CONTROL FLOW

Program menggunakan beberapa bentuk control flow yang saling melengkapi.

## `switch-case`

Digunakan untuk menentukan proses berdasarkan menu yang dipilih pengguna.

```java
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
```

## `if-else`

Digunakan untuk menentukan apakah suatu kondisi terpenuhi.

Contohnya ketika melakukan reservasi:

```java
if (perangkat.getStatus()
        .equalsIgnoreCase("Tersedia")) {

    // proses reservasi

} else {

    System.out.println(
        "Perangkat tidak dapat direservasi."
    );
}
```

## `for`

Digunakan untuk membaca kumpulan data:

```java
for (Reservasi reservasi : daftarReservasi) {
    reservasi.tampilkanInfo();
}
```

## `while`

Digunakan ketika proses harus dilakukan berulang sampai kondisi tertentu terpenuhi.

Contohnya pada pembuatan ID:

```java
while (true) {

    String id =
            String.format("R%03d", nomor);

    if (cariReservasi(id) == null) {
        return id;
    }

    nomor++;
}
```

## `do-while`

Menu utama menggunakan perulangan `do-while`:

```java
do {

    // tampilkan menu
    // input pilihan
    // jalankan proses

} while (pilihan != 14);
```

**Insight:**  
Setiap control flow digunakan untuk kebutuhan yang berbeda. `switch-case` mengatur pilihan menu, `if-else` melakukan pemeriksaan kondisi, `for` menelusuri data, `while` membantu proses generate ID, sedangkan `do-while` menjaga menu utama tetap berjalan sampai pengguna memilih keluar.

---

# 📅 11. ALUR PROSES PENYEWAAN

Alur utama sistem:

```text
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
│     Pengambilan      │
│      Perangkat       │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│       Selesai        │
└──────────────────────┘
```

Status perangkat dalam proses:

```text
Tersedia
   ↓
Direservasi
   ↓
Disewa
```

**Insight:**  
Status perangkat tidak hanya digunakan sebagai informasi tampilan, tetapi juga menjadi bagian dari aturan bisnis. Perangkat yang tidak berstatus `Tersedia` tidak dapat langsung dibuatkan reservasi.

---

# 💰 12. PERHITUNGAN TOTAL HARGA

Total harga dihitung berdasarkan:

```text
Harga Sewa × Lama Sewa
```

Implementasinya:

```java
public double hitungTotalHarga() {
    return perangkat.getHargaSewa() * lamaSewa;
}
```

Contoh:

```text
Harga Sewa = Rp250.000
Lama Sewa  = 2 hari

Total = Rp250.000 × 2
      = Rp500.000
```

**Insight:**  
Perhitungan diletakkan pada class `Reservasi` karena harga perangkat dan lama penyewaan merupakan informasi yang berkaitan langsung dengan proses reservasi.

---

# 🔐 13. VALIDASI PROSES

Program melakukan pemeriksaan sebelum menjalankan beberapa proses.

Contoh pada reservasi:

```java
if (perangkat.getStatus()
        .equalsIgnoreCase("Tersedia")) {

    // reservasi berhasil diproses

} else {

    System.out.println(
        "Perangkat tidak dapat direservasi."
    );
}
```

**Insight:**  
Validasi digunakan agar proses tidak langsung dijalankan tanpa memeriksa kondisi perangkat. Dengan demikian, perangkat yang sedang tidak tersedia tidak dapat diproses sebagai reservasi baru.

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

Pengujian dilakukan melalui beberapa skenario untuk memastikan fitur utama program dapat berjalan.

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

Pengujian dilakukan menggunakan reservasi yang telah dibuat.

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

Bagian ini menjelaskan alasan di balik rancangan program, bukan hanya penggunaan syntax Java.

## 17.1 Mengapa `Kamera` dan `Drone` menjadi subclass?

Kamera dan drone sama-sama merupakan perangkat yang dapat disewa. Keduanya memiliki informasi umum seperti ID, nama, harga, dan status.

Namun, keduanya mempunyai karakteristik khusus yang berbeda.

**Kamera memiliki:**

```text
resolusi
jenisKamera
```

**Drone memiliki:**

```text
resolusiKamera
durasiTerbang
```

Karena terdapat data yang sama sekaligus data khusus, inheritance digunakan untuk menghindari pengulangan atribut umum.

---

## 17.2 Mengapa `Reservasi` menyimpan object `Penyewa` dan `Perangkat`?

Reservasi merupakan bagian yang menghubungkan pihak yang menyewa dengan perangkat yang dipilih.

Daripada hanya menyimpan nama penyewa dan nama perangkat sebagai `String`, program menyimpan object:

```java
private Penyewa penyewa;
private Perangkat perangkat;
```

Dengan pendekatan tersebut, `Reservasi` dapat mengakses informasi object secara langsung.

Contohnya:

```java
penyewa.getNamaPenyewa();
```

dan:

```java
perangkat.getNamaPerangkat();
```

**Insight:**  
Penggunaan object membuat hubungan antarclass lebih jelas dan mengurangi kebutuhan untuk menyimpan data yang sama berulang kali.

---

## 17.3 Mengapa status perangkat perlu diubah?

Status digunakan untuk menggambarkan kondisi perangkat dalam proses penyewaan.

```text
Tersedia
   ↓
Direservasi
   ↓
Disewa
```

Status tersebut juga digunakan dalam pengambilan keputusan program.

Contohnya, perangkat yang tidak berstatus `Tersedia` tidak dapat langsung dibuatkan reservasi.

**Insight:**  
Status perangkat bukan hanya informasi tampilan, tetapi juga menjadi bagian dari aturan bisnis sistem.

---

## 17.4 Mengapa proses pengambilan menggunakan `Reservasi`?

`Pengambilan` tidak dibuat sebagai proses yang berdiri sendiri.

Pengambilan mengacu pada reservasi yang telah dibuat karena informasi perangkat dan penyewa sudah tersedia pada reservasi.

Hubungannya:

```text
Reservasi
   │
   ├── Penyewa
   │
   └── Perangkat
          ↓
     Pengambilan
```

**Insight:**  
Pendekatan ini menghindari penginputan ulang data penyewa dan perangkat ketika melakukan pengambilan.

---

## 17.5 Mengapa `Logic` dipisahkan dari `Model`?

Class `Model` bertanggung jawab terhadap object dan datanya, sedangkan class `Logic` menangani proses pengelolaan.

Contohnya:

```text
Model
└── Reservasi

Logic
└── KelolaReservasi
```

`Reservasi` menyimpan informasi reservasi, sedangkan `KelolaReservasi` menangani proses seperti membuat, mencari, dan menampilkan reservasi.

**Insight:**  
Pemisahan tanggung jawab membuat struktur program lebih mudah dipahami dan lebih mudah dikembangkan.

---

# 📊 18. RINGKASAN PENERAPAN PBO

| Konsep | Implementasi |
|---|---|
| **Class** | `Perangkat`, `Kamera`, `Drone`, `Penyewa`, `Reservasi`, `Pengambilan` |
| **Object** | Object kamera, drone, penyewa, reservasi, dan pengambilan |
| **Inheritance** | `Kamera extends Perangkat`, `Drone extends Perangkat` |
| **Super** | Constructor dan method superclass dipanggil menggunakan `super` |
| **Polymorphism** | Overriding `tampilkanInfo()` |
| **Encapsulation** | Atribut `private`, getter, dan setter |
| **Constructor** | Digunakan pada class model |
| **ArrayList** | Menyimpan kumpulan perangkat, reservasi, dan pengambilan |
| **If-Else** | Validasi kondisi proses |
| **Switch-Case** | Pengaturan menu utama |
| **For** | Menampilkan dan mencari data dalam collection |
| **While** | Generate ID |
| **Do-While** | Menjalankan menu utama sampai pengguna keluar |

---

# 🔍 19. CONTOH ALUR PROGRAM

Salah satu alur penggunaan sistem:

```text
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
```

Alur tersebut menunjukkan bahwa setiap fitur saling berhubungan dan bukan sekadar kumpulan menu yang berdiri sendiri.

---

# 📝 20. KESIMPULAN

**Sistem Penyewaan Perangkat** merupakan aplikasi Java Console yang mengimplementasikan konsep **Object-Oriented Programming** melalui beberapa class yang saling berhubungan.

Konsep **inheritance** diterapkan melalui hubungan `Perangkat` dengan `Kamera` dan `Drone`. **Polymorphism** diterapkan melalui overriding method `tampilkanInfo()`. **Encapsulation** diterapkan melalui penggunaan atribut `private` serta getter dan setter.

Selain konsep utama PBO, program juga menerapkan constructor, `ArrayList`, percabangan, perulangan, validasi, serta hubungan antarobject.

Dari sisi perancangan, pembagian `Model`, `Logic`, dan `Main` membuat program lebih terstruktur karena setiap bagian memiliki tanggung jawab yang berbeda.

Alur `Penyewa → Reservasi → Perangkat → Pengambilan` membuat program memiliki proses bisnis yang saling terhubung sehingga program tidak hanya menampilkan data, tetapi juga mensimulasikan proses penyewaan hingga pengambilan perangkat.

---

# 🎓 21. PENUTUP

Melalui proyek ini, konsep-konsep Pemrograman Berorientasi Objek tidak hanya diterapkan secara terpisah, tetapi digunakan untuk membangun sebuah sistem yang memiliki hubungan antarclass dan alur proses yang jelas.

Perancangan sistem menunjukkan bahwa pemilihan struktur class berpengaruh terhadap keteraturan program. Dengan adanya superclass, subclass, encapsulation, polymorphism, collection, serta pemisahan logic, program menjadi lebih mudah dipahami dan memiliki dasar yang lebih baik untuk dikembangkan.

Pengembangan selanjutnya dapat diarahkan pada penggunaan database, antarmuka GUI atau web, autentikasi pengguna, sistem pembayaran, pengembalian perangkat, serta pengelolaan riwayat penyewaan.

### ✨ Konsep Utama

`Class` · `Object` · `Inheritance` · `Encapsulation` · `Polymorphism` · `Constructor` · `ArrayList` · `Percabangan` · `Perulangan`
