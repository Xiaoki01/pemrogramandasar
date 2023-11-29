package pemrogramandasar;

import java.util.Scanner;

public class Praktikum7_2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int bilangan, kondisi = 0;

        System.out.println("Menentukan bilangan prima dan fibonacci");
        System.out.print("Silakan masukkan bilangan : ");
        bilangan = keyboard.nextInt();

        for (int i = 2; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                kondisi++;
            }
        }

        if (kondisi != 1) {
            System.out.print(bilangan + " Bukan bilangan prima dan ");
        } else {
            System.out.print(bilangan + " Adalah Bilangan Prima dan ");
        }
        fibonacci(bilangan);
    }

    public static void fibonacci(int bilangan) {
        int nilai1 = 1;
        int nilai2 = 1;
        if (bilangan == 1) {
            System.out.println("Bukan bilangan fibonacci");
            return;
        }
        int fibonacci = nilai1 + nilai2;
        while (fibonacci <= bilangan) {
            if (fibonacci == bilangan) {
                System.out.print("Merupakan bilangan fibonacci");
                return;
            }
            nilai1 = nilai2;
            nilai2 = fibonacci;
            fibonacci = nilai1 + nilai2;
        }
        System.out.print(" Bukan bilangan fibonacci");
    }
}