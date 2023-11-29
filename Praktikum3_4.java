package pemrogramandasar;

import java.util.Scanner;

public class Praktikum3_4 {

    public static void main(String[] args) {
        int pembelian, menit, stok, potongan, harga;
        double hasil;
        Scanner keyboard = new Scanner(System.in);

        potongan = 0;
        stok = 150;
        harga = 100000;
        System.out.println("======== Toko Buah A ========");
        System.out.print("Enter jumlah pembelian : ");
        pembelian = keyboard.nextInt();
        System.out.print("Enter menit : ");
        menit = keyboard.nextInt();
        System.out.println("===========================");

        if (menit <= 0 || pembelian < 0) {
            System.out.println("ERROR - inputan tidak valid !");
        } else if (menit > 420) {
            System.out.println("Toko telah tutup !");
        } else {
            if (pembelian > 0 || menit > 0 ) {
                if (menit >= 40) {
                    potongan = harga * pembelian * 5 / 100;
                    hasil = harga * pembelian - potongan;
                    stok = stok - pembelian;
                    System.out.println("Jumlah Pembelian : " + pembelian);
                    System.out.println("Stok Tersisa : " + stok);
                    System.out.println("Hasil Pembelian : Rp." + (hasil - potongan));
                } else {
                    hasil = harga * pembelian - potongan;
                    stok = stok - pembelian;
                    System.out.println("Jumlah Pembelian : " + pembelian);
                    System.out.println("Stok Tersisa : " + stok);
                    System.out.println("Hasil Pembelian : Rp." + hasil);
                }
            }
        }
    }
}
