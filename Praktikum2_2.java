package pemrogramandasar;

import java.util.Scanner;

public class Praktikum2_2 {
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Inputkan angka "); 
        int x = keyboard.nextInt();
        
        String kondisi = x % 2 == 0 ? "Genap" : "Ganjil";
        System.err.println(x +" merupakan bilangan " + kondisi);
         
    }
}
