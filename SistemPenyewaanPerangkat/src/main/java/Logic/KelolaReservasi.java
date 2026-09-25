/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Logic;

import java.util.ArrayList;
import Model.Perangkat;
import Model.Penyewa;
import Model.Reservasi;

/**
 *
 * @author Lenovo
 */
public class KelolaReservasi {

    private ArrayList<Reservasi> daftarReservasi;

    // Constructor
    public KelolaReservasi() {

        daftarReservasi =
                new ArrayList<>();
    }

    // =================================
    // ID OTOMATIS RESERVASI
    // =================================

    public String generateIdReservasi() {

        int nomor = 1;

        while (true) {

            String id =
                    String.format(
                            "R%03d",
                            nomor);

            if (cariReservasi(id) == null) {

                return id;
            }

            nomor++;
        }
    }

    // =================================
    // CREATE RESERVASI
    // =================================

    public void buatReservasi(
            Penyewa penyewa,
            Perangkat perangkat,
            String tanggalReservasi,
            int lamaSewa) {

        // Mengecek apakah perangkat tersedia
        if (perangkat.getStatus()
                .equalsIgnoreCase(
                        "Tersedia")) {

            // Membuat ID otomatis
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

            daftarReservasi.add(
                    reservasi);

            // Mengubah status perangkat
            perangkat.setStatus(
                    "Direservasi");

            System.out.println();

            System.out.println(
                    "Reservasi berhasil dibuat.");

            System.out.println(
                    "ID Reservasi : "
                    + idReservasi);

            System.out.println(
                    "Total Harga  : Rp"
                    + reservasi
                            .hitungTotalHarga());

        } else {

            System.out.println(
                    "Perangkat tidak dapat "
                    + "direservasi.");

            System.out.println(
                    "Status perangkat saat ini: "
                    + perangkat.getStatus());
        }
    }

    // =================================
    // READ
    // =================================

    public void tampilkanSemuaReservasi() {

        if (daftarReservasi.isEmpty()) {

            System.out.println(
                    "Belum ada data reservasi.");

        } else {

            for (Reservasi reservasi
                    : daftarReservasi) {

                System.out.println(
                        "----------------------------");

                reservasi.tampilkanInfo();
            }

            System.out.println(
                    "----------------------------");
        }
    }

    // =================================
    // SEARCH
    // =================================

    public Reservasi cariReservasi(
            String idReservasi) {

        for (Reservasi reservasi
                : daftarReservasi) {

            if (reservasi.getIdReservasi()
                    .equalsIgnoreCase(
                            idReservasi)) {

                return reservasi;
            }
        }

        return null;
    }
}