package pemrogramandasar;

import java.util.Scanner;

public class Praktikum5_1 {

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0;
        System.out.print("Masukkan Jumlah Bilangan : ");
        int jumlah = masukkan.nextInt();

        for (int a = 1; a <= jumlah; a++) {
            System.out.print("Masukkan angka ke " + a + " : ");
            int angka = masukkan.nextInt();
            total += angka;

            if (angka < min) {
                min = angka;
            }
            if (angka > max) {
                max = angka;
            }
        }
        double val = total / jumlah;

        System.out.println("Angka Minimal Adalah :  " + min);
        System.out.println("Angka Maksimal adalah : " + max);
        System.out.println("Rata rata adalah : " + val);

    }

}
