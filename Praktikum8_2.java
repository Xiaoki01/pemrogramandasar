package pemrogramandasar;

import java.util.Scanner;

public class Praktikum8_2 {

    public static void main(String[] args) {
        int pilih, lanjut = 0;
        double jari = 0, tinggi = 0, luas;
        final double PI = 3.14;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Menu :");
            System.out.println("1. Input jari-jari");
            System.out.println("2. Input tinggi");
            System.out.println("3. Hitung Luas Lingkaran");
            System.out.println("4. Hitung Luas Selimut Tabung");
            System.out.println("5. Hitung Luas Permukaan Tabung");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            pilih = keyboard.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukan Nilai Jari-jari : ");
                    jari = keyboard.nextDouble();
                    break;
                case 2:
                    System.out.print("Masukan Nilai Tinggi : ");
                    tinggi = keyboard.nextDouble();
                    break;
                case 3:
                    if (jari == 0) {
                        System.out.println("Anda Belum Menginput Nilai Jari-jari !");
                    } else {
                        luas = luasLing(jari, PI);
                        System.out.println("Luas Lingkaran Dengan Jari-jari " + jari + " Adalah " + luas);
                    }
                    break;
                case 4:
                    if (jari == 0 || tinggi == 0) {
                        System.out.println("Anda Belum Menginput Nilai Jari-jari atau Tinggi !");
                    } else {
                        luas = luasSelimut(jari, PI, tinggi);
                        System.out.println("Luas Selimut Tabung Dengan Jari-jari " + jari + " dan Tinggi " + tinggi + " Adalah " + luas);
                    }
                    break;
                case 5:
                    if (jari == 0 || tinggi == 0) {
                        System.out.println("Anda Belum Menginput Nilai Jari-jari atau Tinggi !");
                    } else {
                        luas = luasPermukaan(jari, PI, tinggi);
                        System.out.println("Luas Permukaan Tabung Dengan Jari-jari " + jari + " dan Tinggi " + tinggi + " Adalah " + luas);
                    }
                    break;
                case 6:
                    lanjut = 2;
                    System.out.println("Program Berhenti");
                    break;
                default:
                    System.out.println("Menu Tidak Ada !");
                    break;

            }

        } while (lanjut < 2);

    }

    public static double luasLing(double jari, double PI) {
        return PI * jari * jari;
    }

    public static double luasSelimut(double jari, double PI, double tinggi) {
        return PI * (jari * 2) * tinggi;
    }

    public static double luasPermukaan(double jari, double PI, double tinggi) {
        return (2 * luasLing(jari, PI)) + luasSelimut(jari, PI, tinggi);
    }
}
