package pemrogramandasar;

import java.util.Scanner;

public class Praktikum5_4 {
    public static void main(String[] args) {
        int inp, a = 0, b = 1, c;
        Scanner keyboard =  new Scanner (System.in);
        
        System.out.print("Banyak bilangan fibonacci : ");
        inp = keyboard.nextInt();
        
        for ( int i = 1; i <= inp; ++i) {
        System.out.print(a + " ");
        c = a + b;
        a = b;
        b = c;
        }
    }
}
