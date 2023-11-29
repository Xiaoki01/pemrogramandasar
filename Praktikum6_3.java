package pemrogramandasar;

import java.util.Scanner;

public class Praktikum6_3 {

    public static void main(String[] args) {
        int pilih;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Apakah anda ingin melanjutkan ? ");
            System.out.print("1. Lanjut \t 2. Berhenti : ");
            pilih = keyboard.nextInt();
            if (pilih == 1) {
                System.out.println("Lanjut !");
            }
        } while (pilih <= 1);
        System.out.println("Program berhenti");
    }
}
