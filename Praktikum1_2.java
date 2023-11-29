package pemrogramandasar;

import java.util.Scanner; 

public class Praktikum1_2{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String a, b, c;
        
        System.out.println("---Jawab dengan kalimat :)---");
        
        System.out.print("Apakah anda suka kucing? : ");
        a = keyboard.nextLine();
        System.out.print("Apakah anda suka anjing? : ");
        b = keyboard.nextLine();
        System.out.print("Apakah anda suka ngoding? :");
        c = keyboard.nextLine();
        
        
        System.out.println("\n" + "Output dengan baris baru, dan yang terakhir memakai jarak (tab)");
        System.out.println( "\n" + a + "\n" + b + "\n" + "\t" + c);
       
    }
}