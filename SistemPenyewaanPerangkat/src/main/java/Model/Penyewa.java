/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Penyewa {

    // Atribut
    private String idPenyewa;
    private String namaPenyewa;
    private String noTelepon;
    private String alamat;

    // Constructor
    public Penyewa(
            String idPenyewa,
            String namaPenyewa,
            String noTelepon,
            String alamat) {

        this.idPenyewa = idPenyewa;
        this.namaPenyewa = namaPenyewa;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    // Getter
    public String getIdPenyewa() {
        return idPenyewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setNamaPenyewa(
            String namaPenyewa) {

        this.namaPenyewa = namaPenyewa;
    }

    public void setNoTelepon(
            String noTelepon) {

        this.noTelepon = noTelepon;
    }

    public void setAlamat(
            String alamat) {

        this.alamat = alamat;
    }

    // Method
    public void tampilkanInfo() {

        System.out.println(
                "ID Penyewa  : "
                + idPenyewa);

        System.out.println(
                "Nama        : "
                + namaPenyewa);

        System.out.println(
                "No. Telepon : "
                + noTelepon);

        System.out.println(
                "Alamat      : "
                + alamat);
    }
}