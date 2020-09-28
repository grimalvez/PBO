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
public class ProjectKeramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik(30, 30, 'A', 54000, 10, 112);
        System.out.println("Total harga keramik " + k1.jenis +" adalah Rp." + k1.hitungTotal() + " dengan total luas " + k1.hitungLuas() + "m2");
        
        Keramik k2 = new Keramik(40, 40, 'B', 65000, 5, 125 );
        System.out.println("Total harga keramik " + k2.jenis +" adalah Rp." + k2.hitungTotal() + " dengan total luas " + k2.hitungLuas() + "m2");
        
        Keramik k3 = new Keramik(30, 40, 'C', 60000, 8, 105);
        System.out.println("Total harga keramik " + k3.jenis +" adalah Rp." + k3.hitungTotal() + " dengan total luas " + k3.hitungLuas() + "m2");
    }
    
}
