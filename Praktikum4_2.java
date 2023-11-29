package pemrogramandasar;

import java.util.Scanner;

public class Praktikum4_2 {
    public static void main(String[] args) {
        String pilih;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Soal No.1");
        System.out.println("Apakah Kamu Suka Ngoding ?");
        System.out.println("a. Suka");
        System.out.println("b. Suka sekali");
        System.out.println("c. Sangat Suka");
        System.out.println("d. Sebenarnya saya suka tapi saya malas");
        pilih = keyboard.nextLine();
        
        switch (pilih) {
            case "a", "A":
                System.out.println("Salah");
                break;
            case "b", "B":
                System.out.println("Salah");
                break;
            case "c", "C":
                System.out.println("Salah");
                break;
            case "d", "D":
                System.out.println("Benar"); 
                break;
            default: 
                System.out.println("Silahkan Input dengan Menggunakan a, b, c atau d");
        }
    }
}
