# 📷 SISTEM PENYEWAAN PERANGKAT

### Aplikasi Java Console untuk Pengelolaan Penyewaan Kamera dan Drone

---

# 👤 IDENTITAS

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

**Sistem Penyewaan Perangkat** merupakan aplikasi berbasis Java Console yang dibuat untuk membantu proses pengelolaan penyewaan perangkat, khususnya kamera dan drone.

Program ini menerapkan konsep **Object-Oriented Programming (OOP)** dengan beberapa class yang saling berhubungan, yaitu `Perangkat`, `Kamera`, `Drone`, `Penyewa`, `Reservasi`, dan `Pengambilan`.

Program tidak hanya digunakan untuk menyimpan data perangkat, tetapi juga mengatur proses reservasi, menghitung total harga, mencatat pengambilan perangkat, serta mengubah status perangkat sesuai proses penyewaan.

Program juga menerapkan konsep PBO seperti **class, object, inheritance, superclass, subclass, `extends`, `super`, polymorphism, overriding, encapsulation, constructor, getter, setter, ArrayList, percabangan, dan perulangan**.

## Fitur Utama

- Menampilkan seluruh perangkat
- Menambahkan kamera
- Menambahkan drone
- Mencari perangkat
- Mengubah status perangkat
- Menghapus perangkat
- Menampilkan dashboard sistem
- Memberikan rekomendasi perangkat
- Membuat reservasi
- Menghitung total harga
- Menampilkan data reservasi
- Mencatat pengambilan perangkat
- Menampilkan data pengambilan
- Mendemonstrasikan polymorphism
- Keluar dari program

---

# 🎯 2. LATAR BELAKANG

Dalam proses penyewaan kamera dan drone terdapat beberapa data yang perlu dikelola, seperti data perangkat, data penyewa, reservasi, lama penyewaan, total harga, dan status perangkat.

Apabila seluruh data dan proses tersebut dibuat dalam satu class, program akan menjadi sulit dipahami karena setiap bagian memiliki tanggung jawab yang berbeda.

Oleh karena itu, program dirancang menggunakan pendekatan **Object-Oriented Programming** dengan membagi objek dan proses ke dalam beberapa class.

Class `Perangkat` digunakan untuk menyimpan karakteristik umum perangkat. Kemudian `Kamera` dan `Drone` dibuat sebagai subclass karena keduanya merupakan perangkat yang dapat disewa, tetapi memiliki karakteristik khusus yang berbeda.

Selain itu, class `Penyewa` digunakan untuk menyimpan identitas penyewa, `Reservasi` digunakan untuk menghubungkan penyewa dengan perangkat, sedangkan `Pengambilan` digunakan untuk mencatat proses pengambilan perangkat berdasarkan reservasi.

Dengan rancangan tersebut, setiap class mempunyai tanggung jawab yang lebih jelas dan program menjadi lebih terstruktur.

---

# 🎯 3. TUJUAN PROYEK

Tujuan pembuatan program ini adalah:

1. Menerapkan konsep class dan object dalam Java.
2. Menerapkan konsep inheritance.
3. Menggunakan `extends` untuk hubungan pewarisan.
4. Menggunakan `super` untuk mengakses constructor dan method superclass.
5. Menerapkan polymorphism melalui method overriding.
6. Menerapkan encapsulation menggunakan atribut `private`.
7. Menggunakan getter dan setter.
8. Menggunakan constructor untuk membuat object.
9. Menggunakan `ArrayList` untuk menyimpan data.
10. Menerapkan `if-else`.
11. Menerapkan `switch-case`.
12. Menerapkan perulangan `for`.
13. Menerapkan perulangan `while`.
14. Menerapkan perulangan `do-while`.
15. Menghubungkan beberapa object dalam satu alur proses penyewaan.
16. Memisahkan program menjadi bagian `Model`, `Logic`, dan `Main`.

---

# 🧩 4. STRUKTUR PROJECT

~~~text
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
~~~

## 4.1 Package `Model`

Package `Model` berisi class yang merepresentasikan objek dalam sistem.

Class yang terdapat pada package ini adalah:

- `Perangkat`
- `Kamera`
- `Drone`
- `Penyewa`
- `Reservasi`
- `Pengambilan`

Class pada package `Model` bertanggung jawab terhadap data object, constructor, getter, setter, dan method yang berhubungan dengan object.

## 4.2 Package `Logic`

Package `Logic` berisi class yang digunakan untuk mengelola object dan menjalankan proses sistem.

Class yang terdapat pada package ini adalah:

- `KelolaPerangkat`
- `KelolaReservasi`
- `KelolaPengambilan`

## 4.3 Package `Main`

Package `Main` berisi class utama:

~~~text
SistemPenyewaanPerangkat.java
~~~

Class tersebut menjadi titik awal program dan digunakan untuk menjalankan menu serta menerima input dari pengguna.

### Insight

Pemisahan package dilakukan agar setiap bagian mempunyai tanggung jawab yang jelas.

`Model` berfokus pada representasi data dan object, `Logic` berfokus pada proses pengelolaan object, sedangkan `Main` berfokus pada interaksi dengan pengguna.

Dengan struktur tersebut, apabila terdapat perubahan pada proses reservasi, perubahan dapat dilakukan pada bagian `Logic` tanpa harus mengubah seluruh class.

---

# 🌳 5. HIERARKI CLASS

Struktur inheritance pada program:

~~~text
                 Perangkat
                /         \
               /           \
          Kamera           Drone
~~~

Hubungan object dalam proses penyewaan:

~~~text
Penyewa
   │
   ▼
Reservasi ─────────► Perangkat
   │
   ▼
Pengambilan
~~~

Alur proses:

~~~text
Penyewa
   ↓
Memilih Perangkat
   ↓
Membuat Reservasi
   ↓
Reservasi Tersimpan
   ↓
Mencatat Pengambilan
   ↓
Status Perangkat Diperbarui
~~~

### Insight

Class dalam program saling berhubungan dan tidak berdiri sendiri.

`Reservasi` menghubungkan `Penyewa` dengan `Perangkat`, sedangkan `Pengambilan` menggunakan `Reservasi`.

Hubungan tersebut membuat alur program lebih sesuai dengan proses penyewaan sebenarnya.

---

# 🧱 6. CLASS DAN TANGGUNG JAWABNYA

## 6.1 `Perangkat`

`Perangkat` merupakan superclass yang menyimpan informasi umum seluruh perangkat.

### Atribut

~~~text
idPerangkat
namaPerangkat
hargaSewa
status
~~~

### Tanggung Jawab

- Menyimpan identitas perangkat.
- Menyimpan nama perangkat.
- Menyimpan harga sewa.
- Menyimpan status perangkat.
- Menyediakan getter dan setter.
- Menyediakan method `tampilkanInfo()`.
- Menjadi superclass untuk `Kamera` dan `Drone`.

### Insight

`Perangkat` menjadi superclass karena kamera dan drone memiliki karakteristik umum yang sama.

Dengan menempatkan data umum pada superclass, atribut tersebut tidak perlu ditulis ulang pada masing-masing subclass.

---

## 6.2 `Kamera`

`Kamera` merupakan subclass dari `Perangkat`.

### Atribut Tambahan

~~~text
resolusi
jenisKamera
~~~

### Tanggung Jawab

- Menyimpan karakteristik khusus kamera.
- Menggunakan data umum dari `Perangkat`.
- Melakukan overriding method `tampilkanInfo()`.

### Insight

Kamera tetap memiliki ID, nama, harga sewa, dan status karena kamera merupakan perangkat yang disewakan.

Namun kamera juga mempunyai karakteristik khusus seperti resolusi dan jenis kamera. Oleh karena itu, atribut tersebut ditempatkan pada subclass `Kamera`.

---

## 6.3 `Drone`

`Drone` merupakan subclass dari `Perangkat`.

### Atribut Tambahan

~~~text
resolusiKamera
durasiTerbang
~~~

### Tanggung Jawab

- Menyimpan karakteristik khusus drone.
- Menggunakan data umum dari `Perangkat`.
- Melakukan overriding method `tampilkanInfo()`.

### Insight

Drone memiliki data umum seperti ID, nama, harga, dan status, tetapi juga memiliki karakteristik khusus berupa resolusi kamera dan durasi terbang.

Karakteristik khusus tersebut ditempatkan pada subclass agar superclass tidak menjadi terlalu kompleks.

---

## 6.4 `Penyewa`

`Penyewa` digunakan untuk menyimpan informasi orang yang melakukan penyewaan.

### Atribut

~~~text
idPenyewa
namaPenyewa
noTelepon
alamat
~~~

### Tanggung Jawab

- Menyimpan identitas penyewa.
- Menyediakan informasi yang dibutuhkan dalam proses reservasi.

### Insight

Data penyewa dibuat dalam class tersendiri agar informasi penyewa tidak bercampur dengan data perangkat atau reservasi.

---

## 6.5 `Reservasi`

`Reservasi` digunakan untuk mencatat proses pemesanan perangkat.

### Atribut

~~~text
idReservasi
penyewa
perangkat
tanggalReservasi
lamaSewa
statusReservasi
~~~

### Tanggung Jawab

- Menyimpan informasi reservasi.
- Menghubungkan `Penyewa` dengan `Perangkat`.
- Menyimpan tanggal reservasi.
- Menyimpan lama penyewaan.
- Menyimpan status reservasi.
- Menghitung total harga.

### Insight

`Reservasi` menjadi penghubung antara penyewa dan perangkat.

Karena `Reservasi` menyimpan object `Penyewa` dan `Perangkat`, data tidak perlu digandakan dalam bentuk atribut `String` terpisah.

---

## 6.6 `Pengambilan`

`Pengambilan` digunakan untuk mencatat proses pengambilan perangkat.

### Atribut

~~~text
idPengambilan
reservasi
tanggalPengambilan
jamPengambilan
statusPengambilan
~~~

### Tanggung Jawab

- Menyimpan data pengambilan.
- Menghubungkan pengambilan dengan reservasi.
- Menyimpan tanggal pengambilan.
- Menyimpan jam pengambilan.
- Menyimpan status pengambilan.

### Insight

`Pengambilan` menggunakan object `Reservasi` karena pengambilan merupakan kelanjutan dari proses reservasi.

Dengan begitu, informasi penyewa dan perangkat dapat diperoleh melalui object reservasi tanpa meminta input yang sama kembali.

---

# 🧬 7. IMPLEMENTASI INHERITANCE

Inheritance diterapkan melalui hubungan antara `Perangkat`, `Kamera`, dan `Drone`.

### Implementasi pada `Kamera`

~~~java
public class Kamera extends Perangkat {
~~~

### Implementasi pada `Drone`

~~~java
public class Drone extends Perangkat {
~~~

Keyword `extends` menunjukkan bahwa `Kamera` dan `Drone` merupakan subclass dari `Perangkat`.

Kedua subclass dapat menggunakan method dan karakteristik yang diwariskan dari superclass.

### Mengapa menggunakan inheritance?

Kamera dan drone sama-sama merupakan perangkat yang dapat disewa.

Keduanya mempunyai karakteristik umum:

~~~text
ID Perangkat
Nama Perangkat
Harga Sewa
Status
~~~

Jika data tersebut ditulis ulang pada masing-masing subclass, akan terjadi duplikasi kode.

### Insight

Inheritance menunjukkan hubungan **is-a**:

~~~text
Kamera adalah Perangkat
Drone adalah Perangkat
~~~

Dengan demikian:

- `Perangkat` menangani karakteristik umum.
- `Kamera` menangani karakteristik khusus kamera.
- `Drone` menangani karakteristik khusus drone.

---

# ⚙️ 8. IMPLEMENTASI `SUPER`

Pada constructor `Kamera` dan `Drone` digunakan:

~~~java
super(
    idPerangkat,
    namaPerangkat,
    hargaSewa,
    status
);
~~~

Method superclass juga dapat dipanggil menggunakan:

~~~java
super.tampilkanInfo();
~~~

## Fungsi `super()`

`super()` digunakan untuk memanggil constructor milik superclass `Perangkat`.

Dengan cara tersebut, data umum seperti ID, nama, harga, dan status dapat diinisialisasi melalui constructor superclass.

## Fungsi `super.tampilkanInfo()`

`super.tampilkanInfo()` digunakan untuk menjalankan method `tampilkanInfo()` milik superclass sebelum subclass menambahkan informasi khusus.

### Insight

Penggunaan `super` membuat subclass dapat menggunakan kembali kode yang telah dibuat pada superclass.

Contohnya, `Kamera` tidak perlu menuliskan ulang proses untuk menampilkan ID, nama, harga, dan status.

---

# 🔄 9. IMPLEMENTASI POLYMORPHISM

Polymorphism diterapkan melalui **method overriding**.

## 9.1 Overriding pada `Kamera`

~~~java
@Override
public void tampilkanInfo() {

    super.tampilkanInfo();

    System.out.println(
        "Resolusi       : "
        + resolusi
    );

    System.out.println(
        "Jenis Kamera   : "
        + jenisKamera
    );
}
~~~

## 9.2 Overriding pada `Drone`

~~~java
@Override
public void tampilkanInfo() {

    super.tampilkanInfo();

    System.out.println(
        "Resolusi Kamera: "
        + resolusiKamera
    );

    System.out.println(
        "Durasi Terbang : "
        + durasiTerbang
        + " menit"
    );
}
~~~

## 9.3 Pengujian Polymorphism

Polymorphism dapat ditunjukkan menggunakan referensi superclass:

~~~java
Perangkat perangkat1 =
        new Kamera(
            "K001",
            "Canon EOS",
            250000,
            "Tersedia",
            "24 MP",
            "Mirrorless"
        );

Perangkat perangkat2 =
        new Drone(
            "D001",
            "DJI Mini",
            350000,
            "Tersedia",
            "4K",
            30
        );

perangkat1.tampilkanInfo();
perangkat2.tampilkanInfo();
~~~

### Insight

Walaupun `perangkat1` dan `perangkat2` menggunakan tipe referensi `Perangkat`, object sebenarnya berbeda.

`perangkat1` merupakan object `Kamera`, sehingga method `tampilkanInfo()` milik `Kamera` dijalankan.

`perangkat2` merupakan object `Drone`, sehingga method `tampilkanInfo()` milik `Drone` dijalankan.

Hal tersebut menunjukkan bahwa satu nama method dapat menghasilkan perilaku yang berbeda berdasarkan object yang digunakan.

---

# 🔐 10. IMPLEMENTASI ENCAPSULATION

Atribut pada class model dibuat menggunakan access modifier `private`.

Contoh:

~~~java
private String status;
~~~

Untuk mengambil nilai digunakan getter:

~~~java
public String getStatus() {
    return status;
}
~~~

Untuk mengubah nilai digunakan setter:

~~~java
public void setStatus(String status) {
    this.status = status;
}
~~~

### Fungsi

`private` membatasi akses langsung terhadap data internal object.

Getter digunakan untuk membaca data, sedangkan setter digunakan untuk mengubah data.

### Contoh

Akses langsung seperti berikut tidak digunakan:

~~~java
perangkat.status = "Disewa";
~~~

Perubahan dilakukan melalui setter:

~~~java
perangkat.setStatus("Disewa");
~~~

### Insight

Encapsulation membuat data internal object lebih terkontrol.

Class dari luar tidak dapat mengubah atribut `private` secara langsung, tetapi harus menggunakan method yang disediakan oleh class.

---

# 🏗️ 11. IMPLEMENTASI CONSTRUCTOR

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

Contoh constructor pada `Perangkat`:

~~~java
public Perangkat(
        String idPerangkat,
        String namaPerangkat,
        double hargaSewa,
        String status) {

    this.idPerangkat = idPerangkat;
    this.namaPerangkat = namaPerangkat;
    this.hargaSewa = hargaSewa;
    this.status = status;
}
~~~

### Fungsi

Constructor memastikan object dapat dibuat dengan data awal yang dibutuhkan.

### Insight

Dengan constructor, data dapat langsung diberikan ketika object dibuat.

Hal tersebut membuat object mempunyai kondisi awal yang jelas dan mengurangi kebutuhan untuk mengisi atribut satu per satu setelah object dibuat.

---

# 🗃️ 12. PENGELOLAAN DATA DENGAN `ARRAYLIST`

Program menggunakan `ArrayList` untuk menyimpan kumpulan object.

Contoh pada `KelolaReservasi`:

~~~java
private ArrayList<Reservasi> daftarReservasi;
~~~

Inisialisasi:

~~~java
public KelolaReservasi() {
    daftarReservasi = new ArrayList<>();
}
~~~

Menambahkan data:

~~~java
daftarReservasi.add(reservasi);
~~~

Menampilkan data:

~~~java
for (Reservasi reservasi
        : daftarReservasi) {

    reservasi.tampilkanInfo();
}
~~~

### Fungsi

`ArrayList` digunakan karena jumlah perangkat, reservasi, dan pengambilan dapat berubah selama program berjalan.

### Insight

`ArrayList` lebih fleksibel dibandingkan array biasa karena jumlah data dapat bertambah atau berkurang.

Pada program ini terdapat collection seperti:

~~~text
daftarPerangkat
daftarReservasi
daftarPengambilan
~~~

Masing-masing digunakan untuk mengelola jenis object yang berbeda.

---

# 🆔 13. GENERATE ID OTOMATIS

Program membuat ID reservasi dan pengambilan secara otomatis.

## 13.1 ID Reservasi

Format:

~~~text
R001
R002
R003
~~~

Implementasi:

~~~java
String id =
        String.format("R%03d", nomor);
~~~

Pengecekan:

~~~java
if (cariReservasi(id) == null) {
    return id;
}

nomor++;
~~~

## 13.2 ID Pengambilan

Format:

~~~text
PG001
PG002
PG003
~~~

### Insight

Pengguna tidak perlu menentukan ID secara manual.

Program memulai nomor dari `1`, kemudian memeriksa apakah ID tersebut sudah digunakan.

Jika sudah digunakan, nomor akan bertambah sampai ditemukan ID yang belum digunakan.

Hal tersebut membantu menjaga konsistensi dan mengurangi kemungkinan ID yang sama.

---

# 💰 14. PERHITUNGAN TOTAL HARGA

Total harga dihitung dengan rumus:

~~~text
Total Harga = Harga Sewa × Lama Sewa
~~~

Implementasi:

~~~java
public double hitungTotalHarga() {
    return perangkat.getHargaSewa()
            * lamaSewa;
}
~~~

### Contoh

~~~text
Harga Sewa = Rp250.000
Lama Sewa  = 2 hari

Total Harga
= Rp250.000 × 2
= Rp500.000
~~~

### Insight

Perhitungan ditempatkan pada class `Reservasi` karena total harga berhubungan langsung dengan perangkat yang dipilih dan lama penyewaan.

Dengan demikian, `Main` tidak perlu mengetahui detail perhitungan tersebut.

---

# 🔄 15. PERUBAHAN STATUS PERANGKAT

Status perangkat berubah mengikuti proses penyewaan:

~~~text
Tersedia
   ↓
Direservasi
   ↓
Disewa
~~~

Ketika reservasi berhasil:

~~~java
perangkat.setStatus("Direservasi");
~~~

Ketika pengambilan berhasil:

~~~java
perangkat.setStatus("Disewa");
~~~

### Insight

Status perangkat digunakan untuk menunjukkan kondisi perangkat sekaligus menjadi bagian dari logika bisnis.

Contohnya:

~~~text
Tersedia
↓
Boleh dibuat reservasi

Direservasi
↓
Tidak dapat dibuat reservasi baru

Disewa
↓
Sedang digunakan
~~~

Dengan demikian, status bukan hanya informasi yang ditampilkan, tetapi juga digunakan untuk menentukan apakah suatu proses dapat dilakukan.

---

# 🔐 16. VALIDASI PROSES RESERVASI

Sebelum membuat reservasi, program memeriksa status perangkat.

~~~java
if (perangkat.getStatus()
        .equalsIgnoreCase("Tersedia")) {

    String idReservasi =
            generateIdReservasi();

    Reservasi reservasi =
            new Reservasi(
                idReservasi,
                penyewa,
                perangkat,
                tanggalReservasi,
                lamaSewa,
                "Dikonfirmasi"
            );

    daftarReservasi.add(reservasi);

    perangkat.setStatus("Direservasi");

} else {

    System.out.println(
        "Perangkat tidak dapat direservasi."
    );
}
~~~

### Fungsi

Validasi memastikan hanya perangkat dengan status `Tersedia` yang dapat dibuatkan reservasi.

### Insight

Program tidak langsung membuat reservasi.

Status perangkat diperiksa terlebih dahulu. Jika perangkat tidak tersedia, proses ditolak. Jika tersedia, reservasi dibuat dan status perangkat diubah menjadi `Direservasi`.

---

# 🔄 17. IMPLEMENTASI CONTROL FLOW

Program menggunakan beberapa bentuk control flow.

## 17.1 `switch-case`

~~~java
switch (pilihan) {

    case 1:
        // Tampilkan perangkat
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
~~~

### Insight

`switch-case` digunakan untuk mengatur pilihan menu utama karena program mempunyai banyak pilihan dengan nomor yang berbeda.

---

## 17.2 `if-else`

~~~java
if (perangkat.getStatus()
        .equalsIgnoreCase("Tersedia")) {

    // Proses reservasi

} else {

    System.out.println(
        "Perangkat tidak dapat direservasi."
    );
}
~~~

### Insight

`if-else` digunakan ketika program harus mengambil keputusan berdasarkan kondisi tertentu.

Dalam program ini, kondisi tersebut adalah status perangkat.

---

## 17.3 `for`

~~~java
for (Reservasi reservasi
        : daftarReservasi) {

    reservasi.tampilkanInfo();
}
~~~

### Insight

`for` digunakan untuk menelusuri setiap object yang terdapat di dalam `ArrayList`.

---

## 17.4 `while`

~~~java
while (true) {

    String id =
            String.format("R%03d", nomor);

    if (cariReservasi(id) == null) {
        return id;
    }

    nomor++;
}
~~~

### Insight

`while` digunakan dalam proses generate ID karena jumlah percobaan tidak diketahui sebelumnya.

Perulangan berhenti ketika ditemukan ID yang belum digunakan.

---

## 17.5 `do-while`

Menu utama menggunakan:

~~~java
do {

    // Tampilkan menu
    // Input pilihan
    // Jalankan proses

} while (pilihan != 14);
~~~

### Insight

`do-while` memastikan menu ditampilkan minimal satu kali.

Program akan terus berjalan sampai pengguna memilih menu `14`.

---

# 🧭 18. ALUR PROSES RESERVASI

~~~text
Pengguna
   ↓
Pilih Menu Reservasi
   ↓
Pilih Penyewa
   ↓
Pilih Perangkat
   ↓
Periksa Status Perangkat
   ↓
Apakah Tersedia?
   │
   ├── Tidak → Reservasi ditolak
   │
   └── Ya
        ↓
     Generate ID
        ↓
     Buat Object Reservasi
        ↓
     Hitung Total Harga
        ↓
     Simpan Reservasi
        ↓
     Status Perangkat = Direservasi
~~~

### Insight

Validasi dilakukan sebelum data reservasi disimpan.

Jika perangkat tidak tersedia, proses berhenti.

Jika perangkat tersedia, sistem membuat object reservasi, menghitung harga, menyimpan data, kemudian mengubah status perangkat.

---

# 📦 19. ALUR PROSES PENGAMBILAN

~~~text
Pilih Reservasi
      ↓
Periksa Status Reservasi
      ↓
Reservasi Dikonfirmasi?
      │
      ├── Tidak → Pengambilan ditolak
      │
      └── Ya
           ↓
      Generate ID Pengambilan
           ↓
      Buat Object Pengambilan
           ↓
      Simpan Pengambilan
           ↓
      Status Reservasi = Selesai
           ↓
      Status Perangkat = Disewa
~~~

### Insight

Pengambilan dilakukan berdasarkan reservasi yang sudah dibuat.

Dengan menggunakan object `Reservasi`, program dapat memperoleh informasi penyewa dan perangkat tanpa meminta input yang sama kembali.

---

# 🔗 20. HUBUNGAN ANTAR-CLASS

Hubungan object dalam program:

~~~text
                    Perangkat
                   /         \
              Kamera         Drone
                   \         /
                    \       /
                     Reservasi
                    /        \
                   /          \
              Penyewa      Perangkat
                              │
                              ▼
                        Pengambilan
~~~

Pada `Reservasi`:

~~~java
private Penyewa penyewa;
private Perangkat perangkat;
~~~

Pada `Pengambilan`:

~~~java
private Reservasi reservasi;
~~~

### Contoh akses object

Mengambil nama penyewa:

~~~java
reservasi.getPenyewa().getNamaPenyewa();
~~~

Mengambil nama perangkat:

~~~java
reservasi.getPerangkat().getNamaPerangkat();
~~~

### Insight

Hubungan antarobject membuat data dapat digunakan kembali.

Saat pengambilan dilakukan, program tidak perlu meminta kembali nama penyewa dan perangkat karena informasi tersebut sudah tersimpan pada object `Reservasi`.

---

# 🧠 21. PEMISAHAN `MODEL`, `LOGIC`, DAN `MAIN`

Struktur program:

~~~text
Model
  ↓
Data dan representasi object

Logic
  ↓
Pengelolaan dan proses object

Main
  ↓
Interaksi pengguna
~~~

## Model

Berisi:

- `Perangkat`
- `Kamera`
- `Drone`
- `Penyewa`
- `Reservasi`
- `Pengambilan`

## Logic

Berisi:

- `KelolaPerangkat`
- `KelolaReservasi`
- `KelolaPengambilan`

## Main

Berisi:

- menu utama;
- input pengguna;
- pemanggilan fitur;
- pengendalian alur program.

### Insight

Pemisahan tersebut membuat setiap bagian mempunyai tanggung jawab yang jelas.

Jika proses reservasi ingin diperbaiki, perubahan dapat difokuskan pada `KelolaReservasi` tanpa harus mengubah seluruh class model.

---

# ⚙️ 22. FITUR UTAMA PROGRAM

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

# 🧪 23. SKENARIO PENGUJIAN PROGRAM

## 23.1 Pengujian Pengelolaan Perangkat

Pengujian dilakukan dengan:

1. Menampilkan data perangkat.
2. Menambahkan kamera.
3. Menambahkan drone.
4. Mencari perangkat berdasarkan ID.
5. Mengubah status perangkat.
6. Menghapus perangkat.

### Hasil yang Diharapkan

Data perangkat dapat ditampilkan, ditambahkan, dicari, diubah, dan dihapus melalui menu yang tersedia.

---

## 23.2 Pengujian Reservasi

Pengujian dilakukan dengan:

1. Memilih menu reservasi.
2. Memasukkan data penyewa.
3. Memilih perangkat.
4. Memasukkan tanggal reservasi.
5. Memasukkan lama sewa.
6. Membuat reservasi.

### Hasil yang Diharapkan

- ID reservasi dibuat otomatis.
- Data reservasi tersimpan.
- Total harga dihitung.
- Status perangkat berubah menjadi `Direservasi`.

---

## 23.3 Pengujian Perangkat Tidak Tersedia

Pengguna mencoba melakukan reservasi pada perangkat yang statusnya bukan `Tersedia`.

### Hasil yang Diharapkan

Program menolak proses reservasi dan menampilkan:

~~~text
Perangkat tidak dapat direservasi.
~~~

Hal ini menunjukkan bahwa validasi status perangkat berjalan.

---

## 23.4 Pengujian Pengambilan

Pengujian dilakukan menggunakan reservasi yang telah dibuat.

### Hasil yang Diharapkan

- ID pengambilan dibuat otomatis.
- Data pengambilan tersimpan.
- Status reservasi berubah menjadi `Selesai`.
- Status perangkat berubah menjadi `Disewa`.

---

## 23.5 Pengujian Polymorphism

Pengujian dilakukan menggunakan object `Kamera` dan `Drone` dengan referensi bertipe `Perangkat`.

### Hasil yang Diharapkan

Object `Kamera` menjalankan method `tampilkanInfo()` milik `Kamera`, sedangkan object `Drone` menjalankan method `tampilkanInfo()` milik `Drone`.

---

# 🖥️ 24. DOKUMENTASI OUTPUT PROGRAM

Screenshot hasil pengujian disimpan dalam folder:

~~~text
screenshots/
~~~

## 24.1 Menu Utama

**File:** `menu-utama.png`

![Menu Utama](screenshots/menu-utama.png)

Menampilkan seluruh pilihan fitur yang tersedia dalam program.

---

## 24.2 Data Perangkat

**File:** `data-perangkat.png`

![Data Perangkat](screenshots/data-perangkat.png)

Menampilkan seluruh perangkat yang tersimpan dalam sistem.

---

## 24.3 Tambah Kamera

**File:** `tambah-kamera.png`

![Tambah Kamera](screenshots/tambah-kamera.png)

Menampilkan proses penambahan data kamera.

---

## 24.4 Tambah Drone

**File:** `tambah-drone.png`

![Tambah Drone](screenshots/tambah-drone.png)

Menampilkan proses penambahan data drone.

---

## 24.5 Cari Perangkat

**File:** `cari-perangkat.png`

![Cari Perangkat](screenshots/cari-perangkat.png)

Menampilkan proses pencarian perangkat berdasarkan ID.

---

## 24.6 Ubah Status Perangkat

**File:** `ubah-status.png`

![Ubah Status](screenshots/ubah-status.png)

Menampilkan proses perubahan status perangkat.

---

## 24.7 Hapus Perangkat

**File:** `hapus-perangkat.png`

![Hapus Perangkat](screenshots/hapus-perangkat.png)

Menampilkan proses penghapusan perangkat.

---

## 24.8 Dashboard Sistem

**File:** `dashboard.png`

![Dashboard](screenshots/dashboard.png)

Menampilkan ringkasan data yang terdapat dalam sistem.

---

## 24.9 Rekomendasi Perangkat

**File:** `rekomendasi.png`

![Rekomendasi](screenshots/rekomendasi.png)

Menampilkan hasil rekomendasi perangkat berdasarkan kebutuhan pengguna.

---

## 24.10 Pembuatan Reservasi

**File:** `buat-reservasi.png`

![Buat Reservasi](screenshots/buat-reservasi.png)

Menampilkan proses pembuatan reservasi, generate ID, dan perhitungan total harga.

---

## 24.11 Data Reservasi

**File:** `data-reservasi.png`

![Data Reservasi](screenshots/data-reservasi.png)

Menampilkan seluruh reservasi yang telah tersimpan.

---

## 24.12 Pencatatan Pengambilan

**File:** `catat-pengambilan.png`

![Catat Pengambilan](screenshots/catat-pengambilan.png)

Menampilkan proses pencatatan pengambilan perangkat.

---

## 24.13 Data Pengambilan

**File:** `data-pengambilan.png`

![Data Pengambilan](screenshots/data-pengambilan.png)

Menampilkan seluruh data pengambilan yang telah tersimpan.

---

## 24.14 Demo Polymorphism

**File:** `demo-polymorphism.png`

![Demo Polymorphism](screenshots/demo-polymorphism.png)

Menampilkan hasil overriding method `tampilkanInfo()` pada `Kamera` dan `Drone`.

---

## 24.15 Keluar Program

**File:** `keluar.png`

![Keluar Program](screenshots/keluar.png)

Menampilkan output ketika pengguna memilih menu keluar.

---

# 📝 25. KETERBATASAN PROGRAM

Program saat ini masih menggunakan `ArrayList`, sehingga data hanya tersimpan selama aplikasi sedang berjalan.

Ketika program ditutup, data yang telah dimasukkan belum disimpan secara permanen.

Program juga belum menggunakan:

- database;
- sistem login;
- sistem pembayaran;
- proses pengembalian perangkat;
- perhitungan denda;
- GUI.

### Insight

Keterbatasan tersebut merupakan batasan dari versi aplikasi console yang dibuat untuk kebutuhan tugas PBO.

Walaupun belum menggunakan database atau GUI, program sudah menerapkan konsep dasar PBO dan memiliki alur proses penyewaan yang dapat dikembangkan lebih lanjut.

---

# 🚀 26. PENGEMBANGAN SELANJUTNYA

Program dapat dikembangkan menjadi sistem yang lebih lengkap.

~~~text
Aplikasi Console
      ↓
Database
      ↓
Login Pengguna
      ↓
Reservasi
      ↓
Pengambilan
      ↓
Pengembalian
      ↓
Denda
      ↓
Laporan
~~~

Pengembangan yang dapat dilakukan:

- Menyimpan data menggunakan database.
- Menambahkan sistem login.
- Menambahkan proses pengembalian perangkat.
- Menambahkan perhitungan denda.
- Menambahkan sistem pembayaran.
- Membuat laporan transaksi.
- Membuat GUI.
- Mengembangkan program menjadi aplikasi berbasis web.

---

# 📊 27. RINGKASAN PENERAPAN KONSEP PBO

| Konsep | Implementasi |
|---|---|
| **Class** | `Perangkat`, `Kamera`, `Drone`, `Penyewa`, `Reservasi`, `Pengambilan` |
| **Object** | Object kamera, drone, penyewa, reservasi, dan pengambilan |
| **Inheritance** | `Kamera extends Perangkat` dan `Drone extends Perangkat` |
| **Superclass** | `Perangkat` |
| **Subclass** | `Kamera` dan `Drone` |
| **`extends`** | Membuat hubungan pewarisan |
| **`super`** | Memanggil constructor dan method superclass |
| **Polymorphism** | Overriding `tampilkanInfo()` |
| **Encapsulation** | Atribut `private`, getter, dan setter |
| **Constructor** | Menginisialisasi object |
| **ArrayList** | Menyimpan kumpulan object |
| **If-Else** | Validasi status perangkat |
| **Switch-Case** | Menu utama |
| **For** | Menelusuri data |
| **While** | Generate ID |
| **Do-While** | Perulangan menu |
| **Object Relationship** | `Reservasi` memiliki `Penyewa` dan `Perangkat` |
| **Object Relationship** | `Pengambilan` memiliki `Reservasi` |

---

# 🔍 28. ANALISIS PERANCANGAN

## 28.1 Mengapa `Kamera` dan `Drone` menjadi subclass?

Kamera dan drone sama-sama merupakan perangkat yang dapat disewa.

Keduanya mempunyai atribut umum:

~~~text
idPerangkat
namaPerangkat
hargaSewa
status
~~~

Namun terdapat atribut khusus:

~~~text
Kamera
├── resolusi
└── jenisKamera
~~~

dan:

~~~text
Drone
├── resolusiKamera
└── durasiTerbang
~~~

Karena terdapat data umum dan data khusus, `Perangkat` digunakan sebagai superclass.

### Insight

Inheritance mengurangi duplikasi kode sekaligus membuat struktur class mencerminkan hubungan objek pada dunia nyata.

---

## 28.2 Mengapa `Reservasi` menyimpan object `Penyewa` dan `Perangkat`?

Pada `Reservasi` terdapat:

~~~java
private Penyewa penyewa;
private Perangkat perangkat;
~~~

Reservasi membutuhkan informasi mengenai siapa yang menyewa dan perangkat apa yang dipilih.

Dengan menyimpan object, data dapat diakses melalui method yang tersedia:

~~~java
penyewa.getNamaPenyewa();
~~~

dan:

~~~java
perangkat.getNamaPerangkat();
~~~

### Insight

Cara tersebut lebih terstruktur dibandingkan menyimpan semua informasi sebagai `String` terpisah.

---

## 28.3 Mengapa `Pengambilan` menggunakan `Reservasi`?

Pada `Pengambilan` terdapat:

~~~java
private Reservasi reservasi;
~~~

Pengambilan merupakan proses lanjutan dari reservasi.

Reservasi sudah menyimpan informasi mengenai:

- penyewa;
- perangkat;
- tanggal reservasi;
- lama sewa;
- status reservasi.

Karena itu, `Pengambilan` tidak perlu meminta kembali seluruh informasi tersebut.

### Insight

Hubungan ini mengurangi pengulangan input dan membuat alur program lebih realistis.

---

## 28.4 Mengapa status perangkat perlu dikelola?

Status perangkat berubah berdasarkan proses:

~~~text
Tersedia
   ↓
Direservasi
   ↓
Disewa
~~~

Status digunakan untuk menentukan apakah perangkat dapat digunakan pada proses berikutnya.

### Insight

Status bukan hanya informasi tampilan, tetapi juga digunakan sebagai bagian dari aturan bisnis program.

---

## 28.5 Mengapa perhitungan harga berada pada `Reservasi`?

Implementasi:

~~~java
public double hitungTotalHarga() {
    return perangkat.getHargaSewa()
            * lamaSewa;
}
~~~

Total harga bergantung pada:

~~~text
Harga Perangkat
       +
Lama Penyewaan
~~~

Kedua informasi tersebut tersedia pada `Reservasi`.

### Insight
Dengan menempatkan perhitungan di `Reservasi`, tanggung jawab class menjadi lebih jelas dan `Main` tidak perlu menangani detail perhitungan.

---

## 28.6 Mengapa `Logic` dipisahkan dari `Model`?

~~~text
Model
  ↓
Data dan object

Logic
  ↓
Proses pengelolaan

Main
  ↓
Interaksi pengguna
~~~

Contohnya:

~~~text
Model
└── Reservasi

Logic
└── KelolaReservasi
~~~

`Reservasi` menyimpan data reservasi, sedangkan `KelolaReservasi` menangani proses seperti:

- membuat reservasi;
- mencari reservasi;
- menampilkan reservasi;
- membuat ID reservasi.

### Insight
Pemisahan tanggung jawab membuat program lebih terstruktur dan memudahkan pengembangan.

---

# 🧾 29. KESIMPULAN

**Sistem Penyewaan Perangkat** merupakan aplikasi Java Console yang dibuat untuk mensimulasikan proses penyewaan kamera dan drone dengan menerapkan konsep Pemrograman Berorientasi Objek.

Konsep **inheritance** diterapkan melalui `Perangkat` sebagai superclass dan `Kamera` serta `Drone` sebagai subclass. Dengan inheritance, atribut dan method umum dapat digunakan kembali oleh subclass.

Konsep **polymorphism** diterapkan melalui method overriding `tampilkanInfo()`. `Kamera` dan `Drone` memiliki method dengan nama yang sama tetapi memberikan informasi tambahan yang berbeda sesuai karakteristik masing-masing.

Konsep **encapsulation** diterapkan dengan menggunakan atribut `private` serta getter dan setter sebagai mekanisme akses data.

Program juga menerapkan constructor, `ArrayList`, `if-else`, `switch-case`, `for`, `while`, dan `do-while`.

Selain itu, terdapat hubungan antarobject yang menggambarkan proses penyewaan:

~~~text
Penyewa
   ↓
Reservasi
   ↓
Perangkat
   ↓
Pengambilan
~~~

Dengan struktur tersebut, setiap class memiliki tanggung jawab yang berbeda tetapi tetap saling berhubungan.

---

# 🎓 30. PENUTUP

Melalui proyek ini, konsep Pemrograman Berorientasi Objek diterapkan tidak hanya sebagai syntax Java, tetapi juga sebagai dasar dalam merancang struktur program.

Pemilihan `Perangkat` sebagai superclass memungkinkan `Kamera` dan `Drone` berbagi karakteristik umum. Sementara itu, `Reservasi` menghubungkan penyewa dengan perangkat dan `Pengambilan` melanjutkan proses dari reservasi.

Pemisahan `Model`, `Logic`, dan `Main` membantu membagi tanggung jawab program sehingga kode menjadi lebih terstruktur dan lebih mudah dikembangkan.

Program ini masih dapat dikembangkan menggunakan database, sistem login, proses pengembalian, pembayaran, denda, laporan, dan antarmuka yang lebih interaktif.

---

# ✨ KONSEP UTAMA

`Class` · `Object` · `Inheritance` · `Superclass` · `Subclass` · `extends` · `super` · `Encapsulation` · `Polymorphism` · `Constructor` · `ArrayList` · `Percabangan` · `Perulangan`
