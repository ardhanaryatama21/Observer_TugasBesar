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
public class Pelanggan implements Observer {
    String nama;
    private Admin admin = new Admin();

    public Pelanggan(String nama){
        super();
        this.nama = nama;
    }
    
    @Override
    public void update(){
        System.out.println("Hai " + nama + ", " + admin.pesan);
    }
    
    @Override
    public void Terdaftar(Admin adm){
        admin = adm;
    }
}
