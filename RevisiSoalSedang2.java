/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class RevisiSoalSedang2 {
    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume Tabung ===");
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jariJari, tinggi);

        System.out.println("Volume tabung dengan jari-jari " + jariJari + 
                           " cm dan tinggi " + tinggi + 
                           " cm adalah: " + volume + " cm³");

        input.close();
    }
}
