package pemrogramandasar;

import java.util.Scanner;

public class Praktikum6_2 {

    public static void main(String[] args) {
        int bunga;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukan sebuah angka : ");
        bunga = keyboard.nextInt();

        if (bunga <= 0) {
            System.out.println("Angka yang anda masukan tidak sesuai ketentuan ");
        } else {
            while (bunga > 1) {
                System.out.println("Bunga mawar mekarlah " + bunga + ", layu 1 tinggalah " + (bunga - 1));
                bunga--;

                if (bunga == 1) {
                    System.out.println("Bunga mawar mekarlah " + bunga + ", layu 1 habis semua");
                }
            }
        }
    }
}
