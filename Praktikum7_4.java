package pemrogramandasar;

import java.util.Scanner;

public class Praktikum7_4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radius = 0, sisi = 0;
        final double PI = 3.14;
        int lanjut = 0;
        do {
            System.out.println("Silahkan pilih menu : ");
            System.out.println("1. Input nilai radius dan panjang sisi");
            System.out.println("2. Hitung luas dan keliling lingkaran");
            System.out.println("3. Hitung luas dan keliling segitiga sama kaki");
            System.out.println("4. Hitung panjang L");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            int pilih = keyboard.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Radius : ");
                    radius = keyboard.nextDouble();
                    System.out.print("Sisi : ");
                    sisi = keyboard.nextDouble();
                    break;
                case 2:
                    if (radius == 0 && sisi == 0) {
                        System.out.println("Silahkan mengisi radius dan panjang sisi terlebih dahulu !");
                    } else {
                        lingkaran(radius, PI);
                    }
                    break;
                case 3:
                    if (radius == 0 && sisi == 0) {
                        System.out.println("Silahkan mengisi radius dan panjang sisi terlebih dahulu !");
                    } else {
                        segitiga(radius, sisi);
                    }
                    break;
                case 4:
                    if (radius == 0 && sisi == 0) {
                        System.out.println("Silahkan mengisi radius dan panjang sisi terlebih dahulu !");
                    } else {
                        panjang(radius, sisi);
                    }
                    break;
                case 5:
                    lanjut = 1;
                    System.out.println("Program berhenti !");
                default:

            }

        } while (lanjut < 1);
    }

    static void lingkaran(double radius, final double PI) {
        String kondisi = null;
        double hasil = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Keliling\t 2. Luas");
        System.out.print("Pilih : ");
        int pilih = keyboard.nextInt();
        switch (pilih) {
            case 1:
                hasil = 2 * PI * radius;
                kondisi = "Keliling";
                break;
            case 2:
                hasil = PI * radius * radius;
                kondisi = "Luas";
                break;
            default:

        }
        System.out.println(kondisi + " lingkaran adalah " + hasil);
    }

    static void segitiga(double radius, double sisi) {
        String kondisi = null;
        double hasil = 0, diameter = radius * 2, alas = sisi * 0.5;
        double miring = Math.sqrt(Math.pow(alas,2) + Math.pow(diameter,2));
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Keliling\t2. Luas");
        System.out.print("Pilih : ");
        int pilih = keyboard.nextInt();
        switch (pilih) {
            case 1:
                hasil = sisi + miring + miring;
                kondisi = "Keliling";
                break;
            case 2:
                hasil = diameter * sisi * 0.5;
                kondisi = "Luas";
                break;
            default:
        }
        System.out.println(kondisi + " segitiga adalah " + hasil);
    }

    static void panjang(double radius, double sisi) {
        double diameter = radius * 2;
        double hasil = diameter + diameter + sisi;
        System.out.println("Panjang L adalah : " + hasil);
    }

}
