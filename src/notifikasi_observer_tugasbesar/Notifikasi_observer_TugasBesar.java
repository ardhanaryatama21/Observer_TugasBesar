/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi_observer_tugasbesar;

/**
 *
 * @author FR13NDS
 */
public class Notifikasi_observer_TugasBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Admin adminPinjam = new Admin();
        
        Pelanggan pelanggan1 = new Pelanggan("Ardhan");
        Pelanggan pelanggan2 = new Pelanggan("Gamal");
        Pelanggan pelanggan3 = new Pelanggan("Gery");
        
        adminPinjam.terdaftar(pelanggan1);
        adminPinjam.terdaftar(pelanggan2);
        adminPinjam.terdaftar(pelanggan3);
        
        pelanggan1.Terdaftar(adminPinjam);
        pelanggan2.Terdaftar(adminPinjam);
        pelanggan3.Terdaftar(adminPinjam);
        
        adminPinjam.kirim("pinjam kamera terbaru dan raih voucher diskon 10%");
        
    }
}
