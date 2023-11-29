package pemrogramandasar;

import java.util.Scanner;

public class Praktikum1_1{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String namaLengkap, nim, programStudi;
        
        System.out.println("-----Selamat Datang di ULM-----");
        System.out.println("---Silahkan Input Data Anda---"); 
       
        System.out.print("Nama Lengkap : ");
        namaLengkap = keyboard.nextLine();
        System.out.print("NIM : ");
        nim = keyboard.nextLine();
        System.out.print("Program Studi : ");
        programStudi = keyboard.nextLine();
        
        System.out.println("---Terima Kasih Telah Menginput---");
        System.out.println("Halo");
        System.out.println("Nama : " + namaLengkap);
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : "+ programStudi);
        
        
    }
}
