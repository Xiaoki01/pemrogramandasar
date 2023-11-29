package pemrogramandasar;

import java.util.Scanner;

public class Praktikum3_1 {
    public static void main(String[] args) {
        int nilai;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan Nilai : ");
        nilai = keyboard.nextInt();
        
        if (nilai % 5 == 0 && nilai % 2 != 0) {
            System.out.println("Program Started");
        } else{
            System.out.println("Program Halted");
        }
        
    }
}