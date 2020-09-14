/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author Asus
 */
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik();
        k1.jenis = 'A' ; 
        k1.panjang = 30 ; 
        k1.lebar = 30 ;
        k1.harga = 54000 ;
        k1.isi = 10 ;
        k1.beli = 112 ;
        k1.luasKeramik();
        
        Keramik k2 = new Keramik();
        k2.jenis = 'B' ; 
        k2.panjang = 40 ; 
        k2.lebar = 40 ;
        k2.harga = 65000 ;
        k2.isi = 5 ;
        k2.beli = 125 ;
        k2.luasKeramik();
        
        Keramik k3 = new Keramik();
        k3.jenis = 'C' ; 
        k3.panjang = 30 ; 
        k3.lebar = 40 ;
        k3.harga = 60000;
        k3.isi = 8;
        k3.beli = 105 ;
        k3.luasKeramik();
    }
    
}
