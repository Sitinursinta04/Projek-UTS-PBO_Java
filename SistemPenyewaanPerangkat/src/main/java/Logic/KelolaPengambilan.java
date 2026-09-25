/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Logic;

import java.util.ArrayList;
import Model.Pengambilan;
import Model.Perangkat;
import Model.Reservasi;

/**
 *
 * @author Lenovo
 */
public class KelolaPengambilan {

    private ArrayList<Pengambilan>
            daftarPengambilan;

    // Constructor
    public KelolaPengambilan() {

        daftarPengambilan =
                new ArrayList<>();
    }

    // =================================
    // ID OTOMATIS
    // =================================

    public String generateIdPengambilan() {

        int nomor = 1;

        while (true) {

            String id =
                    String.format(
                            "PG%03d",
                            nomor);

            boolean sudahAda = false;

            for (Pengambilan pengambilan
                    : daftarPengambilan) {

                if (pengambilan
                        .getIdPengambilan()
                        .equalsIgnoreCase(id)) {

                    sudahAda = true;
                    break;
                }
            }

            if (!sudahAda) {

                return id;
            }

            nomor++;
        }
    }

    // =================================
    // CREATE
    // =================================

    public void buatPengambilan(
            Reservasi reservasi,
            String tanggalPengambilan,
            String jamPengambilan) {

        if (reservasi != null) {

            // Reservasi harus sudah dikonfirmasi
            if (reservasi
                    .getStatusReservasi()
                    .equalsIgnoreCase(
                            "Dikonfirmasi")) {

                // Membuat ID otomatis
                String idPengambilan =
                        generateIdPengambilan();

                Pengambilan pengambilan =
                        new Pengambilan(
                                idPengambilan,
                                reservasi,
                                tanggalPengambilan,
                                jamPengambilan,
                                "Sudah Diambil"
                        );

                daftarPengambilan.add(
                        pengambilan);

                // Reservasi selesai
                reservasi.setStatusReservasi(
                        "Selesai");

                // Perangkat sedang disewa
                Perangkat perangkat =
                        reservasi.getPerangkat();

                perangkat.setStatus(
                        "Disewa");

                System.out.println();

                System.out.println(
                        "Pengambilan berhasil dicatat.");

                System.out.println(
                        "ID Pengambilan : "
                        + idPengambilan);

            } else {

                System.out.println(
                        "Reservasi belum dapat "
                        + "diambil.");

            }

        } else {

            System.out.println(
                    "Reservasi tidak ditemukan.");
        }
    }

    // =================================
    // READ
    // =================================

    public void tampilkanSemuaPengambilan() {

        if (daftarPengambilan.isEmpty()) {

            System.out.println(
                    "Belum ada data pengambilan.");

        } else {

            for (Pengambilan pengambilan
                    : daftarPengambilan) {

                System.out.println(
                        "----------------------------");

                pengambilan.tampilkanInfo();
            }

            System.out.println(
                    "----------------------------");
        }
    }
}