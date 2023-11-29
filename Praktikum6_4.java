package pemrogramandasar;

import java.util.Scanner;

public class Praktikum6_4 {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0;
        int banyak = 0;
        char pilih;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Masukan angka : ");
            int angka = keyboard.nextInt();
            System.out.print("Apakah anda ingin melanjutkan ? [y/n] ");
            pilih = keyboard.next().charAt(0);
            total += angka;
            if (angka < min) {
                min = angka;
            }
            if (angka > max) {
                max = angka;
            }

            banyak++;

        } while (pilih == 'y' || pilih == 'Y');
        String answma = min < max ? ("Nilai terkecil : " + min) : ("Nilai terbesar : " + max);
        String answmi = min > max ? ("Nilai terkecil : " + min) : ("Nilai terbesar : " + max);
        total = total / banyak;
        System.out.println("Stop");
        System.out.println("Rata - rata nilai : " + (double) total);
        System.out.println(answma);
        System.out.println(answmi);

    }
}
