package pemrogramandasar;

import java.util.Scanner;

public class Praktikum6_1 {
   public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int pilih, coba = 3, sisa = 1;
        String nama, nim, cekn = null, cekm = null;
        
        do {
            System.out.println("Silahkan Pilih Menu ");
            System.out.println("1. Daftar\t2. Login");
            System.out.print("Pilih : ");
            pilih = keyboard.nextInt();
            if (pilih == 2 ) {
                if (cekn == null || cekm == null) {
                    System.out.println("Anda belum Mendaftar !");
                } else {
                    System.out.print("Masukan nama : ");
                    nama = keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = keyboard.nextLine();
                     if (nama.equals(cekn) && nim.equals(cekm)) {
                        System.out.println("Login berhasil !");
                        
                   for (coba = 3; coba > 0; coba-- ) ;
                   } else {
                        coba--;
                         if (coba == 0) {
                            System.out.println("Anda salah 3x anda akan diblokir");
                        } else {
                        System.out.println("Anda salah " + sisa + "x  Silahkan coba lagi, kesempatan " + coba + "x");
                        sisa++;
                         }
                    }
                }
            } else if (pilih == 1) {
                System.out.print("Masukan nama : ");
                cekn = keyboard.nextLine();
                keyboard.nextLine();
                System.out.print("Masukan NIM : ");
                cekm = keyboard.nextLine();
                System.out.println("Pendaftaran berhasil ! ");
                
            }
            
        } while (coba != 0) ;
    }
}