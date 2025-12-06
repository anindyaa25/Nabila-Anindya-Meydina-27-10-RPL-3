/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer1;

import java.util.Scanner;

/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        
     System.out.println("Masukkan angka ");
     int a = scanner.nextInt();
     
     System.out.print("Masukkan angka");
int b = scanner.nextInt();

        // Meminta jumlah elemen
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = scanner.nextInt();
        
        if (a>= 1000){
        System.out.println("Jumlah elemen yang anda masukkan terlalu banyak");
        }
                
        // Jika input kurang dari 1
        if (b >= 1000) {
            System.out.println("Jumlah elemen yang anda masukkan terlalu banyak");
            return;
            
            
        }
// dua elemen awal Fibonacci
        
        int genap = 0, ganjil = 0;
        System.out.println("Deret Fibonacci:");
        
                // Menghitung ganjil/genap
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            if (a % 2 == 0){
            genap ++;
            }else{
            ganjil ++;
            }

           
            // Menggeser nilai Fibonacci
            int c = a + b;
            a = b;
            b = c;
        }

        // Hasil akhir
        System.out.println("\nJumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);

        scanner.close();
    }
}
    

