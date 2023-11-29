package pemrogramandasar;

import java.util.Scanner;

public class Praktikum8_1 {

    public static void main(String[] args) {
        int tahun, umur;
        String nama;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("Tahun lahir : ");
        tahun = keyboard.nextInt();

        System.out.println(printNama(nama, umur = 2023 - tahun));
    }

    public static String printNama(String nama, int umur) {
        return "\nUmur " + nama + " adalah " + umur + " tahun";
    }
}
