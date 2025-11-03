/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SoalSulit1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Program Rekapitulasi Nilai Produktif RPL ===");
            
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa = input.nextInt();
            double totalNilai = 0;
            for (int i = 1; i <= jumlahSiswa; i++) {
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }
            double rataRata = totalNilai / jumlahSiswa;
            
            System.out.println("\nJumlah siswa: " + jumlahSiswa);
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Nilai rata-rata: " + rataRata);
        }
    }
}