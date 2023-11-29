package pemrogramandasar;

import java.util.Scanner;

public class Praktikum3_2 {
    public static void main(String[] args) {
        double berat, laptop, bukuTulis, kotakPensil, smartphone, jumlah1, jumlah2, jumlah3, jumlah4;
        laptop = 850.56;
        bukuTulis = 250.11;
        kotakPensil = 25.31;
        smartphone = 200.00;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("========Indeks Berat Bawaan Tasku========");
        System.out.print("Laptop : ");
        jumlah1 = keyboard.nextDouble();
        System.out.print("Buku Tulis : ");
        jumlah2 = keyboard.nextDouble();
        System.out.print("Kotak Pensil : ");
        jumlah3 = keyboard.nextDouble();
        System.out.print("Smartphone : ");
        jumlah4 = keyboard.nextDouble();
        
        laptop = laptop * jumlah1;
        bukuTulis = bukuTulis * jumlah2;
        kotakPensil = kotakPensil * jumlah3;
        smartphone = smartphone * jumlah4;
        berat = laptop + bukuTulis + kotakPensil + smartphone;
        
        if (berat < 0 || jumlah1 < 0 || jumlah2 < 0 || jumlah3 < 0 || jumlah4 < 0) {
            System.err.println("ERROR - Tidak diperkenankan bilangan negatif!");
        } else if (berat > 2000) {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 5");
            System.err.println("Bawaan barang melebihi batas ketentuan");
        } else if (berat >= 1500 && berat <= 2000) {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 4");
            System.out.println("Bawaan barang tidak melebihi ketentuan, amannn...");
        } else if (berat >= 1000 && berat < 1500) {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 3");
            System.out.println("Bawaan barang tidak melebihi ketentuan, amannn...");
        } else if (berat >= 500 && berat < 1000) {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 2");
            System.out.println("Bawaan barang tidak melebihi ketentuan, amannn...");
        } else if (berat > 0 && berat < 500) {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 1");
            System.out.println("Bawaan barang tidak melebihi ketentuan, amannn...");
        } else {
            System.out.println("=========================================");
            System.out.println("Indeks Berat Barang : 0");
            System.out.println("Anda tidak membawa barang :) ");
            
        }
        
    }
}
