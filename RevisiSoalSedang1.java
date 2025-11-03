/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class RevisiSoalSedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penghitung Faktorial ===");

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Maaf, faktorial hanya bisa dihitung untuk bilangan positif.");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }

        input.close();
    }
}