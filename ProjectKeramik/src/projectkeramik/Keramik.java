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
public class Keramik {
    /* Membuat atribut*/
    double panjang;
    double lebar;
    char jenis;
    double harga;
    double isi;
    double beli;
    /* Menggunakan double karena terdapat banyak desimal */
    
    /* Membuat method keramik*/
    void luasKeramik() {
        double luas;
        luas = this.panjang * this.lebar * isi / 10000 * beli;
        /* Kode diatas digunakan untuk mengetahui berapa panjang luas keramik yang terbeli untunk memasang keramik dengan luas 100m2*/
       
        double total;
        total = beli * harga;
        /* Kode diatas digunakan untuk menentukan total harga keramik*/
        System.out.println("Total harga keramik " + jenis +" adalah Rp." + total + " dengan total luas " + luas + "m2");
        
                
}
}