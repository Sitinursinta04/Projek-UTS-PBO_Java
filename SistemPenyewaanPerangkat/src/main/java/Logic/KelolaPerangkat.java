/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Logic;

import java.util.ArrayList;
import Model.Perangkat;
import Model.Kamera;
import Model.Drone;

/**
 *
 * @author Lenovo
 */
public class KelolaPerangkat {

    private ArrayList<Perangkat> daftarPerangkat;

    // Constructor
    public KelolaPerangkat() {

        daftarPerangkat =
                new ArrayList<>();
    }

    // =================================
    // CREATE
    // =================================

    public void tambahPerangkat(
            Perangkat perangkat) {

        daftarPerangkat.add(perangkat);

        System.out.println(
                "Perangkat berhasil ditambahkan.");

        System.out.println(
                "ID Perangkat : "
                + perangkat.getIdPerangkat());
    }

    // =================================
    // ID OTOMATIS KAMERA
    // =================================

    public String generateIdKamera() {

        int nomor = 1;

        while (true) {

            String id =
                    String.format(
                            "K%03d",
                            nomor);

            if (cariPerangkat(id) == null) {

                return id;
            }

            nomor++;
        }
    }

    // =================================
    // ID OTOMATIS DRONE
    // =================================

    public String generateIdDrone() {

        int nomor = 1;

        while (true) {

            String id =
                    String.format(
                            "D%03d",
                            nomor);

            if (cariPerangkat(id) == null) {

                return id;
            }

            nomor++;
        }
    }

    // =================================
    // READ
    // =================================

    public void tampilkanSemuaPerangkat() {

        if (daftarPerangkat.isEmpty()) {

            System.out.println(
                    "Belum ada perangkat.");

        } else {

            for (Perangkat perangkat
                    : daftarPerangkat) {

                System.out.println(
                        "----------------------------");

                // Polymorphism
                perangkat.tampilkanInfo();
            }

            System.out.println(
                    "----------------------------");
        }
    }

    // =================================
    // SEARCH
    // =================================

    public Perangkat cariPerangkat(
            String idPerangkat) {

        for (Perangkat perangkat
                : daftarPerangkat) {

            if (perangkat.getIdPerangkat()
                    .equalsIgnoreCase(
                            idPerangkat)) {

                return perangkat;
            }
        }

        return null;
    }

    // =================================
    // SEARCH BERDASARKAN JENIS
    // =================================

    public Perangkat cariPerangkatTersedia(
            String jenis) {

        for (Perangkat perangkat
                : daftarPerangkat) {

            if (perangkat.getStatus()
                    .equalsIgnoreCase(
                            "Tersedia")) {

                if (jenis.equalsIgnoreCase(
                        "Kamera")
                        && perangkat
                                instanceof Kamera) {

                    return perangkat;

                } else if (
                        jenis.equalsIgnoreCase(
                                "Drone")
                        && perangkat
                                instanceof Drone) {

                    return perangkat;
                }
            }
        }

        return null;
    }

    // =================================
    // UPDATE
    // =================================

    public void ubahStatus(
            String idPerangkat,
            String statusBaru) {

        Perangkat perangkat =
                cariPerangkat(idPerangkat);

        if (perangkat != null) {

            perangkat.setStatus(
                    statusBaru);

            System.out.println(
                    "Status perangkat "
                    + "berhasil diubah.");

        } else {

            System.out.println(
                    "Perangkat dengan ID tersebut "
                    + "tidak ditemukan.");
        }
    }

    // =================================
    // DELETE
    // =================================

    public void hapusPerangkat(
            String idPerangkat) {

        for (int i = 0;
                i < daftarPerangkat.size();
                i++) {

            if (daftarPerangkat.get(i)
                    .getIdPerangkat()
                    .equalsIgnoreCase(
                            idPerangkat)) {

                daftarPerangkat.remove(i);

                System.out.println(
                        "Perangkat berhasil dihapus.");

                return;
            }
        }

        System.out.println(
                "Perangkat dengan ID tersebut "
                + "tidak ditemukan.");
    }

    // =================================
    // DASHBOARD
    // =================================

    public int getJumlahPerangkat() {

        return daftarPerangkat.size();
    }

    public int hitungBerdasarkanStatus(
            String status) {

        int jumlah = 0;

        for (Perangkat perangkat
                : daftarPerangkat) {

            if (perangkat.getStatus()
                    .equalsIgnoreCase(status)) {

                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanDashboard() {

        int total =
                getJumlahPerangkat();

        int tersedia =
                hitungBerdasarkanStatus(
                        "Tersedia");

        int direservasi =
                hitungBerdasarkanStatus(
                        "Direservasi");

        int disewa =
                hitungBerdasarkanStatus(
                        "Disewa");

        System.out.println();

        System.out.println(
                "========================================");

        System.out.println(
                "          DASHBOARD SISTEM");

        System.out.println(
                "========================================");

        System.out.println(
                "Total Perangkat : "
                + total);

        System.out.println(
                "Tersedia        : "
                + tersedia);

        System.out.println(
                "Direservasi     : "
                + direservasi);

        System.out.println(
                "Disewa          : "
                + disewa);

        System.out.println(
                "========================================");
    }

    // =================================
    // REKOMENDASI
    // =================================

    public void tampilkanRekomendasi(
            int pilihan) {

        System.out.println();

        System.out.println(
                "========================================");

        System.out.println(
                "       REKOMENDASI PERANGKAT");

        System.out.println(
                "========================================");

        if (pilihan == 1) {

            System.out.println(
                    "Rekomendasi untuk FOTOGRAFI:");

            System.out.println();

            Perangkat kamera =
                    cariPerangkatTersedia(
                            "Kamera");

            if (kamera != null) {

                kamera.tampilkanInfo();

            } else {

                System.out.println(
                        "Tidak ada kamera "
                        + "yang tersedia.");
            }

        } else if (pilihan == 2) {

            System.out.println(
                    "Rekomendasi untuk VIDEOGRAFI:");

            System.out.println();

            Perangkat kamera =
                    cariPerangkatTersedia(
                            "Kamera");

            if (kamera != null) {

                kamera.tampilkanInfo();

            } else {

                System.out.println(
                        "Tidak ada kamera "
                        + "yang tersedia.");
            }

        } else if (pilihan == 3) {

            System.out.println(
                    "Rekomendasi untuk "
                    + "DOKUMENTASI UDARA:");

            System.out.println();

            Perangkat drone =
                    cariPerangkatTersedia(
                            "Drone");

            if (drone != null) {

                drone.tampilkanInfo();

            } else {

                System.out.println(
                        "Tidak ada drone "
                        + "yang tersedia.");
            }

        } else {

            System.out.println(
                    "Pilihan rekomendasi "
                    + "tidak tersedia.");
        }

        System.out.println(
                "========================================");
    }
}