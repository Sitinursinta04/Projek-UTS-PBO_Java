/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Drone extends Perangkat {

    // Atribut tambahan
    private String resolusiKamera;
    private int durasiTerbang;

    // Constructor
    public Drone(
            String idPerangkat,
            String namaPerangkat,
            double hargaSewa,
            String status,
            String resolusiKamera,
            int durasiTerbang) {

        // Memanggil constructor superclass
        super(
                idPerangkat,
                namaPerangkat,
                hargaSewa,
                status
        );

        this.resolusiKamera = resolusiKamera;
        this.durasiTerbang = durasiTerbang;
    }

    // Getter
    public String getResolusiKamera() {
        return resolusiKamera;
    }

    public int getDurasiTerbang() {
        return durasiTerbang;
    }

    // Setter
    public void setResolusiKamera(
            String resolusiKamera) {

        this.resolusiKamera = resolusiKamera;
    }

    public void setDurasiTerbang(
            int durasiTerbang) {

        this.durasiTerbang = durasiTerbang;
    }

    // Polymorphism - Method Overriding
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
}