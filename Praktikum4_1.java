package pemrogramandasar;

import java.util.Scanner;

public class Praktikum4_1 {

    public static void main(String[] args) {
        int pilih;
        double a, b, c, hasil;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("===========Mencari segitiga===========");
        System.out.println("Ketik 1 Untuk Mencari Nilai a (Samping)");
        System.out.println("Ketik 2 Untuk Mencari Nilai b (Alas)");
        System.out.println("Ketik 3 untuk Mencari nilai c (Miring)");
        pilih = keyboard.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Inputkan Nilai b : ");
                b = keyboard.nextDouble();
                System.out.print("Inputkan Nilai c : ");
                c = keyboard.nextDouble();
                hasil = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
                System.out.println("Nilai a adalah : " + hasil);
                break;
            case 2:
                System.out.print("Inputkan Nilai a : ");
                a = keyboard.nextDouble();
                System.out.print("Inputkan Nilai c : ");
                c = keyboard.nextDouble();
                hasil = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
                System.out.println("Nilai b adalah : " + hasil);
                break;
            case 3:
                System.out.print("Inputkan Nilai a : ");
                a = keyboard.nextDouble();
                System.out.print("Inputkan Nilai b : ");
                b = keyboard.nextDouble();
                hasil = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                System.out.println("Nilai c adalah : " + hasil);
                break;
            default:
                System.out.println("Silahkan Ketik 1, 2 atau 3");
        }

    }

}
