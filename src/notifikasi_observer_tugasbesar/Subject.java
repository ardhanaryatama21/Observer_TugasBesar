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
public interface Subject {

    void kirim(String pesan);

    void notifyPelanggan();

    void terdaftar(Pelanggan plgn);

    void tidakTerdaftar(Pelanggan plgn);
    
}
