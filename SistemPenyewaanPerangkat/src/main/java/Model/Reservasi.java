/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Reservasi {

    // Atribut
    private String idReservasi;
    private Penyewa penyewa;
    private Perangkat perangkat;
    private String tanggalReservasi;
    private int lamaSewa;
    private String statusReservasi;

    // Constructor
    public Reservasi(
            String idReservasi,
            Penyewa penyewa,
            Perangkat perangkat,
            String tanggalReservasi,
            int lamaSewa,
            String statusReservasi) {

        this.idReservasi = idReservasi;
        this.penyewa = penyewa;
        this.perangkat = perangkat;
        this.tanggalReservasi = tanggalReservasi;
        this.lamaSewa = lamaSewa;
        this.statusReservasi = statusReservasi;
    }

    // Getter
    public String getIdReservasi() {
        return idReservasi;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public Perangkat getPerangkat() {
        return perangkat;
    }

    public String getTanggalReservasi() {
        return tanggalReservasi;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public String getStatusReservasi() {
        return statusReservasi;
    }

    // Setter
    public void setStatusReservasi(
            String statusReservasi) {

        this.statusReservasi = statusReservasi;
    }

    // Menghitung total harga
    public double hitungTotalHarga() {

        return perangkat.getHargaSewa()
                * lamaSewa;
    }

    // Method
    public void tampilkanInfo() {

        System.out.println(
                "ID Reservasi      : "
                + idReservasi);

        System.out.println(
                "Nama Penyewa      : "
                + penyewa.getNamaPenyewa());

        System.out.println(
                "Perangkat         : "
                + perangkat.getNamaPerangkat());

        System.out.println(
                "Tanggal Reservasi : "
                + tanggalReservasi);

        System.out.println(
                "Lama Sewa         : "
                + lamaSewa
                + " hari");

        System.out.println(
                "Total Harga       : Rp"
                + hitungTotalHarga());

        System.out.println(
                "Status Reservasi  : "
                + statusReservasi);
    }
}