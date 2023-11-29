package pemrogramandasar;

import java.util.Scanner;

public class Praktikum7_3 {

    public static void main(String[] args) {
        int kelipatan, a, b, lanjut = 0, pilih = 1;
        Scanner keyboard = new Scanner(System.in);

        do {

            switch (pilih) {
                case 1:
                    System.out.print("Masukan kelipatan angka : ");
                    kelipatan = keyboard.nextInt();
                    System.out.println("Masukan rentang angka");
                    System.out.print("Dari : ");
                    a = keyboard.nextInt();
                    System.out.print("Sampai : ");
                    b = keyboard.nextInt();
                    angka(a, b, kelipatan);
                    System.out.println("Apakah anda ingin melanjutkan? ");
                    System.out.println("1. Ya\t2. Tidak");
                    System.out.print("Pilih :");
                    pilih = keyboard.nextInt();
                    break;
                case 2:
                    System.out.println("Program Berhenti !");
                    lanjut = 1;
                    break;
            }
        } while (lanjut < 1);
    }

    static void angka(int a, int b, int kelipatan) {
        for (int i = a; i <= b; i++) {
            if (i % kelipatan == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
