/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi_observer_tugasbesar;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Subject {
    private List<Pelanggan> pelanggan = new ArrayList<>();
    String pesan;
    
    @Override
    public void terdaftar(Pelanggan plgn){
        pelanggan.add(plgn);
    }
    
    @Override
    public void tidakTerdaftar(Pelanggan plgn){
        pelanggan.remove(plgn);
    }
    
    @Override
    public void notifyPelanggan(){
        for(Pelanggan plgn: pelanggan){
           plgn.update(); 
        }
    }
    
    @Override
    public void kirim(String pesan){
        this.pesan = pesan;
        notifyPelanggan();
    }
}
