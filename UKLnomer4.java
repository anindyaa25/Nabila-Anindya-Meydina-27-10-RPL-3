/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer4;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer4 {

    public static void main(String[] args) {
   Scanner z = new Scanner(System.in);
        Random random = new Random();
        boolean terus = true;

        while (terus) {
            int bilanganPertama = random.nextInt(10);
            int bilanganKedua = random.nextInt(10); 
            String operator;
            int jawabanBenar = 0;

            int jenisOperator = random.nextInt(3); 
            switch (jenisOperator) {
                case 0: 
                    operator = "*";
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case 1: 
                    operator = "/";
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case 2: 
                    operator = "%";
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
                default:
                    operator = "";
                    break;
            }

            System.out.print(bilanganPertama+ " "+operator+" "+bilanganKedua +" = ");
            int jawabanUser  = z.nextInt();

            if (jawabanUser  == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah anda ingin meneruskan kuis? (ya/tidak): ");
            String pilihan = z.next();
            if (pilihan.equalsIgnoreCase("tidak")) {
                 terus= false;
            }
        }

        z.close();
        System.out.println("Terima kasih mengikuti kuis!");
}
}     
    

