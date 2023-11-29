package pemrogramandasar;

import java.util.Scanner;

public class Praktikum1_3 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String fact, noFact;
        
        System.out.println("Sebutkan Apa Yang Anda Sukai : ");
        fact = keyboard.nextLine();
        System.out.println("Sebutkan Apa Yang Anda Tidak Sukai : ");
        noFact = keyboard.nextLine();
        
        System.out.println("Anda suka : " + "\"" + fact + "\"");
        System.out.println("Anda Tidak Suka : " + "\"" + noFact + "\"");
         
    }
    
}
