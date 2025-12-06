/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer5;

import java.util.Scanner;


/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer5 {

    public static void main(String[] args) {
       Scanner r = new Scanner(System.in);
        System.out.println("Masukkan jumlah array: ");
        int n = r.nextInt();
        int [] array = new int[n];
        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            array[i] = r.nextInt();
        }
        System.out.println("Angka yang sama dalam array: ");
        for (int i = 0; i < n; i++) {
            int o = 1;
            for (int j = i+1; j <n; j++) {
                if (array[i] == array[j]) {
                    o++;
                }
            }
            if (i == 0 || array[i] != array[i - 1]){
                System.out.println(array[i] + " muncul " +o+ " kali ");
            }
        }
        r.close();
    }
}
    

