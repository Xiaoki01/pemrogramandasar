package pemrogramandasar;

import java.util.Scanner;

public class Praktikum8_4 {

    public static void main(String[] args) {
        String kalimat = "";
        int a = 0;
        char lanjut = 'y';
        Scanner keyboard = new Scanner(System.in);

        while (a <= 1) {
            switch (lanjut) {
                case 'y':
                    kalimat = kalimat1(kalimat);
                    System.out.print("Apakah Lanjut ? (y/n) ");
                    lanjut = keyboard.next().charAt(0);
                    kalimat = kalimat + " ";
                    break;
                case 'n':
                    System.out.println("Kalimat Akhir : ");
                    System.out.println(kalimat);
                    System.out.println("Program Berhenti");
                    a = 2;
                    break;
                default:
                    System.out.println("Inputan Tidak Valid, Program Berhenti");
                    break;
            }
        }

    }

    public static String kalimat1(String kalimat) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Kalimat : ");
        System.out.print(kalimat);
        return kalimat + scan.nextLine();

    }

}
