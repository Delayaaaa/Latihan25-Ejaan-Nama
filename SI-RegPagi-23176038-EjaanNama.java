/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programtunjangan;

/**
 * NAMA  : DELA MELATI PUSPA
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176038
 * Deskripsi Program : Program ini akan mengeja nama yang dimasukkan oleh pengguna, huruf per huruf, dengan urutan yang sesuai.
 */

import java.util.Scanner;

public class EjaanNama {
    public static void main(String[] args) {
        // Meminta input nama dari pengguna
        try (Scanner input = new Scanner(System.in)) {
            // Meminta input nama dari pengguna
            System.out.print("Masukkan nama depan anda untuk dieja: ");
            String nama = input.nextLine();
            
            // Menampilkan ejaan per huruf
            System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
            for (int i = 0; i < nama.length(); i++) {
                System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
            }
        }
    }
}

