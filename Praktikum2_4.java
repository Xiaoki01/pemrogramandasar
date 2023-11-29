package pemrogramandasar;

import java.util.Scanner;

public class Praktikum2_4 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        final double PI = 3.141592;
        double jariJari ;
        int luasLing; 
        
        System.out.println("---Operasi Hitung Luas Lingkaran---");
        System.out.print("Silahkan input jari jari Lingkaran : ");
        jariJari = keyboard.nextDouble();
        
        luasLing = (int) (jariJari * jariJari * PI);
        
        System.out.println("Hasil Perhitungan Luas Lingkaran Anda : " + luasLing);      
        
    }
}
