/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Hp
 */
public class UKL3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukkan jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        int totalKehadiran = 0;

        // Input jumlah hari hadir masing-masing siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
            totalKehadiran += kehadiran[i];
        }

        // Hitung rata-rata kehadiran
        double rataRataKehadiran = (double) totalKehadiran / jumlahSiswa;

        // Output hasil
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: 24 Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }

        System.out.printf("\nRata-rata kehadiran siswa: %.2f hari\n", rataRataKehadiran);

        // Output kesimpulan
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
                
                int[] angka = {1,2,3,4,5};
                int[][] matriks = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                };
                int[][][] kubus ={
                    {
                        {1,2},
                        {3,4}
                    },
                    {
                        {5,6},
                        {7, 8}
                    }
                };
            }
        }
    }
}
                        
                        
              