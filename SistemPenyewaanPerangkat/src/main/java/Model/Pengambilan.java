/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Pengambilan {

    // Atribut
    private String idPengambilan;
    private Reservasi reservasi;
    private String tanggalPengambilan;
    private String jamPengambilan;
    private String statusPengambilan;

    // Constructor
    public Pengambilan(
            String idPengambilan,
            Reservasi reservasi,
            String tanggalPengambilan,
            String jamPengambilan,
            String statusPengambilan) {

        this.idPengambilan = idPengambilan;
        this.reservasi = reservasi;
        this.tanggalPengambilan =
                tanggalPengambilan;
        this.jamPengambilan =
                jamPengambilan;
        this.statusPengambilan =
                statusPengambilan;
    }

    // Getter
    public String getIdPengambilan() {
        return idPengambilan;
    }

    public Reservasi getReservasi() {
        return reservasi;
    }

    public String getTanggalPengambilan() {
        return tanggalPengambilan;
    }

    public String getJamPengambilan() {
        return jamPengambilan;
    }

    public String getStatusPengambilan() {
        return statusPengambilan;
    }

    // Setter
    public void setStatusPengambilan(
            String statusPengambilan) {

        this.statusPengambilan =
                statusPengambilan;
    }

    // Method
    public void tampilkanInfo() {

        System.out.println(
                "ID Pengambilan     : "
                + idPengambilan);

        System.out.println(
                "ID Reservasi       : "
                + reservasi.getIdReservasi());

        System.out.println(
                "Nama Penyewa       : "
                + reservasi
                        .getPenyewa()
                        .getNamaPenyewa());

        System.out.println(
                "Perangkat          : "
                + reservasi
                        .getPerangkat()
                        .getNamaPerangkat());

        System.out.println(
                "Tanggal Pengambilan: "
                + tanggalPengambilan);

        System.out.println(
                "Jam Pengambilan    : "
                + jamPengambilan);

        System.out.println(
                "Status Pengambilan : "
                + statusPengambilan);
    }
}