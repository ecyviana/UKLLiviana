import java.util.Scanner;

public class RevisiSoalMudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Pengecekan Ganjil atau Genap ===");
        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP.");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL.");
        }

        input.close();
    }
}
