package pemrogramandasar;

import java.util.Scanner;

public class Praktikum2_1 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double panjang, lebar, tinggi, hasil;
        
        System.out.println("---Program menghitung Volume Balok---");
        
        System.out.print("Panjang : ");
        panjang = keyboard.nextDouble();
        System.out.print("Lebar : ");
        lebar = keyboard.nextDouble();
        System.out.println("Tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = panjang * lebar * tinggi;
        
        System.out.println("---Hasil Volume Balok");
        System.out.println(hasil);

    }
}
