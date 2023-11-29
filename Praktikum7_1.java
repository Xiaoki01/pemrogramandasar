package pemrogramandasar;

import java.util.Scanner;

public class Praktikum7_1 {
     static void tambahKurang (double a, double b) {
        String kondisi;
        double hasil = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Penambahan\t2. Pengurangan");
        System.out.print("Pilih : ");
        int pilih = keyboard.nextInt();
        switch (pilih) {
            case 1 :
                kondisi = "Penambahan";
                hasil = a + b;
                break;
            case 2 :
                kondisi = "Pengurangan";
                hasil = a + b;
                break;
            default :
                kondisi = "tes";
            }
        System.out.println("Hasil " + kondisi + " dari " + a + " dan " + b + " adalah " + hasil);
    }
    
    static void ganjilGenap (double a, double b) {
        if (a % 2 == 0) {
            System.out.println("Nilai " + a + " adalah genap");
        } else {
            System.out.println("Nilai " + a + " adalah ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Nilai " + b + " adalah genap");
        } else {
            System.out.println("Nilai " + b + " adalah ganjil");
        }
    }
    
    static void positifNegatif (double a, double b) {
        if (a < 0 && a != 0) {
            System.out.println("Nilai " + a + " adalah negatif");
        } else {
            if (a != 0) {
            System.out.println("Nilai " + a + " adalah positif");
            }
        }
        if (b < 0 && b != 0) {
            System.out.println("Nilai " + b + "adalah negatif");
        } else {
            if (b != 0) {
            System.out.println("Nilai " + b + " adalah positif");
            }
        }
        if (a == 0) {
            System.out.println("Nilai " + a + " adalah nol");
        }
        if ( b == 0) {
            System.out.println("Nilai " + b + " adalah nol");
        }
    }
    
    public static void main(String[] args) {
        int lanjut, pilih;
        double a, b;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan Angka Pertama : ");
        a = keyboard.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        b = keyboard.nextInt();
        
        do {
            lanjut = 0;
            System.out.println("Silahkan pilih menu : ");
            System.out.println("1. Penambahan dan Pengurangan");
            System.out.println("2. Cek Genap atau Ganjil");
            System.out.println("3. Cek Positif, Negatif atau Nol");
            System.out.println("4. Berhenti");
            System.out.print("Pilih : ");
            pilih = keyboard.nextInt();
            switch (pilih) {
                case 1 : 
                    tambahKurang (a,b);
                    break;
                case 2 :
                    ganjilGenap (a,b);
                    break;
                case 3 :
                    positifNegatif (a,b);
                    break;
                case 4 :
                    lanjut = 1;
                    System.out.println("Program berhenti !");
                    break;
                default :
                    
                    
            }
            
        } while (lanjut < 1);
    }
}
