package project03;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Asus
 */
public class Task2 {
    Random acak = new Random();
    int jawaban = acak.nextInt(20);
    int score = 100;
    int totalCoba = 0;
    
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
                if (totalCoba <= 5){
                    score+=50;
                    System.out.println("Bonus 50 score !!");
                }
                System.out.println("Total Score : " + Integer.toString(score));
                break;
            } else if(num > jawaban){
                System.out.println("Tebakan anda terlalu besar !!");
                ++totalCoba;
                score-=2;
            } else if(num < jawaban){
                System.out.println("Tebakan anda terlalu kecil !!");
                ++totalCoba;
                score-=2;
            }
            
            }
        }
    }
    
    

