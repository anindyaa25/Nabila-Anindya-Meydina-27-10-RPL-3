package com.mycompany.uklnomer2;

import java.util.Scanner;

/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer2 {


public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal  : ");
        int awal = input.nextInt();

        System.out.print("Masukkan batas akhir  : ");
        int akhir = input.nextInt();
      if (awal>akhir){
          System.out.println("angka akhir lebih besar");
      return;
      }
        for (int i = akhir; i <= awal; i++) {

            System.out.print(i + ". ");

            if (i == akhir) {      // 
                System.out.println("saya senang");
                break;
            }

            int pola = i % 3;

            switch (pola) {
                case 2:
                    System.out.println("saya anak wikusama");
                    break;
                case 1:
                    System.out.println("saya angkatan 34");
                    break;
                default:
                    System.out.println("saya anak moklet");
                    break;
            }
        }
}
}
        
    