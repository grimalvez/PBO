package project03;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Asus
 */
public class Task1 {
    Random acak = new Random();
    int jawaban = acak.nextInt(20);
    
    void input(){
        Scanner input = new Scanner(System.in);
        int i = 1;
        
        System.out.println("Hai ! Saya telah memilih bilangan bulat dari 1 s/d 20. Silahkan ditebak !");
        
        while(1 < 5){
            int num;
            System.out.println("Masukkan angka : " );
            num = input.nextInt();
            if (num == jawaban){
                System.out.println("Selamat tebakan anda benar !!");
                break;
            } else if(num > jawaban){
                System.out.println("Tebakan anda terlalu besar !!");
            } else if(num < jawaban){
                System.out.println("Tebakan anda terlalu kecil !!");
            }
            
            }
        }
    }
    
    

