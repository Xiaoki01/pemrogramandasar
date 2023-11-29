package pemrogramandasar;

import java.util.Scanner;

public class Praktikum8_3 {

    public static void main(String[] args) {
        int a, r, n, hasil;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input a : ");
        a = keyboard.nextInt();
        System.out.print("Input r : ");
        r = keyboard.nextInt();
        System.out.print("Input n : ");
        n = keyboard.nextInt();

        if ( r > 1) {
            System.out.println("");
            hasil = deretGeo1(a,r,n);
            System.out.println("Jumlah " + n + " Suku Pertama Adalah " + hasil);
        } else {
            System.out.println("");
            hasil = deretGeo2(a,r,n);
            System.out.println("Jumlah " + n + " Suku Pertama Adalah " + hasil);
        }
    }

    public static int deretGeo1(int a, int r, int n) {
        return (int) (a * ((Math.pow(r, n)) - 1) / (r - 1));
    }

    public static int deretGeo2(int a, int r, int n) {
        return (int) (a * (1 - (Math.pow(r, n))) / (r - 1));
    }
}
