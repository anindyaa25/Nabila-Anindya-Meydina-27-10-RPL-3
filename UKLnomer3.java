/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer3;

import java.util.Scanner;

/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Bulat: ");
        int n = input.nextInt();
        
        long faktorial = + 1;
        for (int i = 1; i <=n; i++) {
                faktorial *=i;
                System.out.print(i);
                if(i<n){
                    System.out.print("*");
                }
                
            }
        
            
            System.out.println(" bilangan faktorial " +  faktorial);
        }
           
        }
    
    

