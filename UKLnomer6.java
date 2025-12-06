/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer6;

import java.util.Scanner;
/**
 *
 * @author Nabila Anindya
 */
public class UKLnomer6 {

    public static void main(String[] args) {
        

    
        Scanner scanner = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan golongan listrik (A/B/C): ");
        String golongan = scanner.nextLine().toUpperCase();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double pemakaian = scanner.nextDouble();

        // Validasi golongan
        if (!golongan.equals("A") && !golongan.equals("B") && !golongan.equals("C")) {
            System.out.println("Golongan tidak valid! Harap masukkan A, B, atau C.");
            scanner.close();
            return;
        }

        // Menentukan tarif per kWh berdasarkan golongan
        double tarifPerKwh = 0;
        switch (golongan) {
            case "A":
                tarifPerKwh = 1200;
                break;
            case "B":
                tarifPerKwh = 1500;
                break;
            case "C":
                tarifPerKwh = 1800;
                break;
        }

        // Menghitung total tagihan sebelum tambahan
        double tagihanAwal = pemakaian * tarifPerKwh;

        // Cek apakah ada biaya tambahan (pemakaian > 500 kWh)
        double totalTagihan = tagihanAwal;
        if (pemakaian > 500) {
            totalTagihan += tagihanAwal * 0.10; // tambah 10%
        }

        // Menampilkan hasil
        System.out.println("\n--- Detail Tagihan Listrik ---");
        System.out.println("Nama Pelanggan    : " + nama);
        System.out.println("Golongan Listrik  : " + golongan);
        System.out.println("Pemakaian Listrik : " + (int) pemakaian + " kWh");
        System.out.println("Tagihan Awal      : Rp " + String.format("%.0f", tagihanAwal));
        System.out.println("Total Tagihan     : Rp " + String.format("%.0f", totalTagihan));

        scanner.close();
    }
}
        
    














