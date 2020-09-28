/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik2;

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
    Keramik(double p, double l, char jenis, double h, double i, double b){
        this.panjang = p;
        this.lebar = l;
        this.harga = h;
        this.isi = i;
        this.beli = b;
    }
    /* Membuat method keramik*/
    double hitungLuas(){
        double luas;
        luas = this.panjang * this.lebar * isi / 10000 * beli;
        return luas;
    }
    /* Kode diatas digunakan untuk mengetahui berapa panjang luas keramik yang terbeli untunk memasang keramik dengan luas 100m2*/

    
    double hitungTotal(){
        double total;
        total = beli * harga;
        return total;
    }
    /* Kode diatas digunakan untuk menentukan total harga keramik*/
        
} 