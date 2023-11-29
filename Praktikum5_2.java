package pemrogramandasar;

import java.util.Scanner;

public class Praktikum5_2 {

    public static void main(String[] args) {
        int inp, spasi, bintang = 1;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukan tinggi segitiga : ");
        inp = keyboard.nextInt();
        spasi = inp - 1;
        for (int i = 1; i <= inp; i++) {
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < bintang; k++) {
                System.out.print("*");
            }
            bintang += 2;
            spasi--;
            System.out.println("");

        }
    }
}
