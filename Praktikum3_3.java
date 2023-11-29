package pemrogramandasar;

import java.util.Scanner;

public class Praktikum3_3 {
    public static void main(String[] args) {
        int banyak, cashBack, tambahan, jumlah;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("========Selamat Datang di Toko Charlie========");
        System.out.print("Banyak Pembelian Barang : ");
        banyak = keyboard.nextInt();
        System.out.println("=======================================");
        
        if (banyak > 0 || banyak % 7 == 0) {
          tambahan = banyak / 3;
          cashBack = banyak / 7 * 5500;
          jumlah = banyak + tambahan;
        
        System.out.println("Cashback : Rp. " + cashBack);
        System.out.println("Tambahan Barang : " + tambahan);
        System.out.println("Jumlah Barang : " + jumlah);
        } else {
        }
        if (banyak < 0) {
            System.err.println("ERROR - Inputan harus lebih dari 0");
        }
        
    }
    
}
