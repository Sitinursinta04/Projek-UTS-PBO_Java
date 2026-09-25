/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 */
package Main;

import java.util.Scanner;

import Logic.KelolaPerangkat;
import Logic.KelolaReservasi;
import Logic.KelolaPengambilan;

import Model.Perangkat;
import Model.Kamera;
import Model.Drone;
import Model.Penyewa;
import Model.Reservasi;

/**
 *
 * @author Lenovo
 */
public class SistemPenyewaanPerangkat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat object dari class Logic
        KelolaPerangkat kelolaPerangkat =
                new KelolaPerangkat();

        KelolaReservasi kelolaReservasi =
                new KelolaReservasi();

        KelolaPengambilan kelolaPengambilan =
                new KelolaPengambilan();

        // =====================================================
        // DUMMY DATA PERANGKAT
        // =====================================================

        Kamera kamera1 = new Kamera(
                "K001",
                "Canon EOS R6",
                250000,
                "Tersedia",
                "24 MP",
                "Mirrorless"
        );

        Kamera kamera2 = new Kamera(
                "K002",
                "Sony A7 III",
                300000,
                "Tersedia",
                "24 MP",
                "Mirrorless"
        );

        Kamera kamera3 = new Kamera(
                "K003",
                "Fujifilm X-T5",
                275000,
                "Tersedia",
                "40 MP",
                "Mirrorless"
        );

        Drone drone1 = new Drone(
                "D001",
                "DJI Mini 4 Pro",
                400000,
                "Tersedia",
                "48 MP",
                34
        );

        Drone drone2 = new Drone(
                "D002",
                "DJI Air 3",
                500000,
                "Tersedia",
                "48 MP",
                46
        );

        // Memasukkan dummy data
        kelolaPerangkat.tambahPerangkat(kamera1);
        kelolaPerangkat.tambahPerangkat(kamera2);
        kelolaPerangkat.tambahPerangkat(kamera3);
        kelolaPerangkat.tambahPerangkat(drone1);
        kelolaPerangkat.tambahPerangkat(drone2);

        // =====================================================
        // MENU UTAMA
        // =====================================================

        int pilihan;

        do {

            System.out.println();
            System.out.println(
                    "==============================================");
            System.out.println(
                    "       SISTEM PENYEWAAN PERANGKAT");
            System.out.println(
                    "==============================================");
            System.out.println("1.  Tampilkan Semua Perangkat");
            System.out.println("2.  Tambah Kamera");
            System.out.println("3.  Tambah Drone");
            System.out.println("4.  Cari Perangkat");
            System.out.println("5.  Ubah Status Perangkat");
            System.out.println("6.  Hapus Perangkat");
            System.out.println("7.  Dashboard Sistem");
            System.out.println("8.  Rekomendasi Perangkat");
            System.out.println("9.  Buat Reservasi");
            System.out.println("10. Tampilkan Semua Reservasi");
            System.out.println("11. Catat Pengambilan");
            System.out.println("12. Tampilkan Semua Pengambilan");
            System.out.println("13. Demo Polymorphism");
            System.out.println("14. Keluar");
            System.out.println(
                    "==============================================");

            System.out.print("Pilih menu : ");

            // Validasi input angka
            while (!input.hasNextInt()) {

                System.out.println(
                        "Input harus berupa angka.");

                input.nextLine();

                System.out.print(
                        "Pilih menu : ");
            }

            pilihan = input.nextInt();
            input.nextLine();

            // =================================================
            // SWITCH CASE
            // =================================================

            switch (pilihan) {

                // =================================================
                // 1. TAMPILKAN SEMUA PERANGKAT
                // =================================================

                case 1:

                    System.out.println();
                    System.out.println(
                            "=== DAFTAR SEMUA PERANGKAT ===");

                    kelolaPerangkat
                            .tampilkanSemuaPerangkat();

                    break;

                // =================================================
                // 2. TAMBAH KAMERA
                // =================================================

                case 2:

                    System.out.println();
                    System.out.println(
                            "=== TAMBAH KAMERA ===");

                    String idKamera =
                            kelolaPerangkat
                                    .generateIdKamera();

                    System.out.println(
                            "ID Kamera : "
                            + idKamera);

                    System.out.print(
                            "Nama Kamera : ");

                    String namaKamera =
                            input.nextLine();

                    System.out.print(
                            "Harga Sewa per Hari : Rp");

                    double hargaKamera =
                            input.nextDouble();

                    input.nextLine();

                    System.out.print(
                            "Resolusi : ");

                    String resolusi =
                            input.nextLine();

                    System.out.print(
                            "Jenis Kamera : ");

                    String jenisKamera =
                            input.nextLine();

                    Kamera kameraBaru =
                            new Kamera(
                                    idKamera,
                                    namaKamera,
                                    hargaKamera,
                                    "Tersedia",
                                    resolusi,
                                    jenisKamera
                            );

                    kelolaPerangkat
                            .tambahPerangkat(
                                    kameraBaru);

                    break;

                // =================================================
                // 3. TAMBAH DRONE
                // =================================================

                case 3:

                    System.out.println();
                    System.out.println(
                            "=== TAMBAH DRONE ===");

                    String idDrone =
                            kelolaPerangkat
                                    .generateIdDrone();

                    System.out.println(
                            "ID Drone : "
                            + idDrone);

                    System.out.print(
                            "Nama Drone : ");

                    String namaDrone =
                            input.nextLine();

                    System.out.print(
                            "Harga Sewa per Hari : Rp");

                    double hargaDrone =
                            input.nextDouble();

                    input.nextLine();

                    System.out.print(
                            "Resolusi Kamera : ");

                    String resolusiDrone =
                            input.nextLine();

                    System.out.print(
                            "Durasi Terbang (menit) : ");

                    int durasiTerbang =
                            input.nextInt();

                    input.nextLine();

                    Drone droneBaru =
                            new Drone(
                                    idDrone,
                                    namaDrone,
                                    hargaDrone,
                                    "Tersedia",
                                    resolusiDrone,
                                    durasiTerbang
                            );

                    kelolaPerangkat
                            .tambahPerangkat(
                                    droneBaru);

                    break;

                // =================================================
                // 4. CARI PERANGKAT
                // =================================================

                case 4:

                    System.out.println();
                    System.out.println(
                            "=== CARI PERANGKAT ===");

                    System.out.print(
                            "Masukkan ID Perangkat : ");

                    String idCari =
                            input.nextLine();

                    Perangkat perangkatCari =
                            kelolaPerangkat
                                    .cariPerangkat(
                                            idCari);

                    if (perangkatCari != null) {

                        System.out.println();
                        System.out.println(
                                "Perangkat ditemukan:");

                        System.out.println(
                                "----------------------------");

                        perangkatCari
                                .tampilkanInfo();

                        System.out.println(
                                "----------------------------");

                    } else {

                        System.out.println(
                                "Perangkat tidak ditemukan.");
                    }

                    break;

                // =================================================
                // 5. UBAH STATUS
                // =================================================

                case 5:

                    System.out.println();
                    System.out.println(
                            "=== UBAH STATUS PERANGKAT ===");

                    System.out.print(
                            "Masukkan ID Perangkat : ");

                    String idStatus =
                            input.nextLine();

                    Perangkat perangkatStatus =
                            kelolaPerangkat
                                    .cariPerangkat(
                                            idStatus);

                    if (perangkatStatus == null) {

                        System.out.println(
                                "Perangkat tidak ditemukan.");

                        break;
                    }

                    System.out.println();
                    System.out.println(
                            "Status saat ini : "
                            + perangkatStatus
                                    .getStatus());

                    System.out.println();
                    System.out.println(
                            "Pilihan Status:");

                    System.out.println(
                            "1. Tersedia");

                    System.out.println(
                            "2. Direservasi");

                    System.out.println(
                            "3. Disewa");

                    System.out.print(
                            "Pilih status : ");

                    int pilihStatus =
                            input.nextInt();

                    input.nextLine();

                    String statusBaru;

                    if (pilihStatus == 1) {

                        statusBaru = "Tersedia";

                    } else if (pilihStatus == 2) {

                        statusBaru = "Direservasi";

                    } else if (pilihStatus == 3) {

                        statusBaru = "Disewa";

                    } else {

                        System.out.println(
                                "Pilihan status tidak valid.");

                        break;
                    }

                    kelolaPerangkat
                            .ubahStatus(
                                    idStatus,
                                    statusBaru);

                    break;

                // =================================================
                // 6. HAPUS PERANGKAT
                // =================================================

                case 6:

                    System.out.println();
                    System.out.println(
                            "=== HAPUS PERANGKAT ===");

                    System.out.print(
                            "Masukkan ID Perangkat : ");

                    String idHapus =
                            input.nextLine();

                    Perangkat perangkatHapus =
                            kelolaPerangkat
                                    .cariPerangkat(
                                            idHapus);

                    if (perangkatHapus == null) {

                        System.out.println(
                                "Perangkat tidak ditemukan.");

                    } else {

                        kelolaPerangkat
                                .hapusPerangkat(
                                        idHapus);
                    }

                    break;

                // =================================================
                // 7. DASHBOARD
                // =================================================

                case 7:

                    kelolaPerangkat
                            .tampilkanDashboard();

                    break;

                // =================================================
                // 8. REKOMENDASI
                // =================================================

                case 8:

                    System.out.println();
                    System.out.println(
                            "=== REKOMENDASI PERANGKAT ===");

                    System.out.println(
                            "1. Fotografi");

                    System.out.println(
                            "2. Videografi");

                    System.out.println(
                            "3. Dokumentasi Udara");

                    System.out.print(
                            "Pilih kebutuhan : ");

                    int pilihanRekomendasi =
                            input.nextInt();

                    input.nextLine();

                    kelolaPerangkat
                            .tampilkanRekomendasi(
                                    pilihanRekomendasi);

                    break;

                // =================================================
                // 9. BUAT RESERVASI
                // =================================================

                case 9:

                    System.out.println();
                    System.out.println(
                            "=== BUAT RESERVASI ===");

                    // Data penyewa
                    System.out.print(
                            "ID Penyewa : ");

                    String idPenyewa =
                            input.nextLine();

                    System.out.print(
                            "Nama Penyewa : ");

                    String namaPenyewa =
                            input.nextLine();

                    System.out.print(
                            "No. Telepon : ");

                    String noTelepon =
                            input.nextLine();

                    System.out.print(
                            "Alamat : ");

                    String alamat =
                            input.nextLine();

                    Penyewa penyewa =
                            new Penyewa(
                                    idPenyewa,
                                    namaPenyewa,
                                    noTelepon,
                                    alamat
                            );

                    // Data perangkat
                    System.out.print(
                            "Masukkan ID Perangkat "
                            + "yang ingin disewa : ");

                    String idPerangkatReservasi =
                            input.nextLine();

                    Perangkat perangkatReservasi =
                            kelolaPerangkat
                                    .cariPerangkat(
                                            idPerangkatReservasi);

                    if (perangkatReservasi == null) {

                        System.out.println(
                                "Perangkat tidak ditemukan.");

                        break;
                    }

                    System.out.println();
                    System.out.println(
                            "Perangkat yang dipilih:");

                    perangkatReservasi
                            .tampilkanInfo();

                    System.out.print(
                            "Tanggal Reservasi "
                            + "(dd-mm-yyyy) : ");

                    String tanggalReservasi =
                            input.nextLine();

                    System.out.print(
                            "Lama Sewa (hari) : ");

                    int lamaSewa =
                            input.nextInt();

                    input.nextLine();

                    if (lamaSewa <= 0) {

                        System.out.println(
                                "Lama sewa harus lebih "
                                + "dari 0 hari.");

                        break;
                    }

                    // Membuat reservasi
                    kelolaReservasi
                            .buatReservasi(
                                    penyewa,
                                    perangkatReservasi,
                                    tanggalReservasi,
                                    lamaSewa
                            );

                    break;

                // =================================================
                // 10. TAMPILKAN RESERVASI
                // =================================================

                case 10:

                    System.out.println();
                    System.out.println(
                            "=== DAFTAR RESERVASI ===");

                    kelolaReservasi
                            .tampilkanSemuaReservasi();

                    break;

                // =================================================
                // 11. CATAT PENGAMBILAN
                // =================================================

                case 11:

                    System.out.println();
                    System.out.println(
                            "=== CATAT PENGAMBILAN ===");

                    System.out.print(
                            "Masukkan ID Reservasi : ");

                    String idReservasi =
                            input.nextLine();

                    Reservasi reservasi =
                            kelolaReservasi
                                    .cariReservasi(
                                            idReservasi);

                    if (reservasi == null) {

                        System.out.println(
                                "Reservasi tidak ditemukan.");

                        break;
                    }

                    System.out.println();
                    System.out.println(
                            "Data Reservasi:");

                    reservasi.tampilkanInfo();

                    System.out.println();

                    System.out.print(
                            "Tanggal Pengambilan "
                            + "(dd-mm-yyyy) : ");

                    String tanggalPengambilan =
                            input.nextLine();

                    System.out.print(
                            "Jam Pengambilan "
                            + "(HH:mm) : ");

                    String jamPengambilan =
                            input.nextLine();

                    kelolaPengambilan
                            .buatPengambilan(
                                    reservasi,
                                    tanggalPengambilan,
                                    jamPengambilan
                            );

                    break;

                // =================================================
                // 12. TAMPILKAN PENGAMBILAN
                // =================================================

                case 12:

                    System.out.println();
                    System.out.println(
                            "=== DAFTAR PENGAMBILAN ===");

                    kelolaPengambilan
                            .tampilkanSemuaPengambilan();

                    break;

                // =================================================
                // 13. DEMO POLYMORPHISM
                // =================================================

                case 13:

                    System.out.println();
                    System.out.println(
                            "========================================");

                    System.out.println(
                            "        DEMO POLYMORPHISM");

                    System.out.println(
                            "========================================");

                    // Object subclass disimpan
                    // dalam reference superclass
                    Perangkat perangkat1 =
                            new Kamera(
                                    "DEMO-K01",
                                    "Canon Demo",
                                    250000,
                                    "Tersedia",
                                    "24 MP",
                                    "Mirrorless"
                            );

                    Perangkat perangkat2 =
                            new Drone(
                                    "DEMO-D01",
                                    "DJI Demo",
                                    400000,
                                    "Tersedia",
                                    "48 MP",
                                    34
                            );

                    System.out.println();
                    System.out.println(
                            "=== OBJECT KAMERA ===");

                    perangkat1.tampilkanInfo();

                    System.out.println();
                    System.out.println(
                            "=== OBJECT DRONE ===");

                    perangkat2.tampilkanInfo();

                    System.out.println();
                    System.out.println(
                            "Method tampilkanInfo() "
                            + "berjalan sesuai object "
                            + "masing-masing.");

                    System.out.println(
                            "========================================");

                    break;

                // =================================================
                // 14. KELUAR
                // =================================================

                case 14:

                    System.out.println();
                    System.out.println(
                            "Terima kasih telah "
                            + "menggunakan sistem.");

                    break;

                // =================================================
                // DEFAULT
                // =================================================

                default:

                    System.out.println();
                    System.out.println(
                            "Menu tidak tersedia.");

                    break;
            }

        } while (pilihan != 14);

        input.close();
    }
}