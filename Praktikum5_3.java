package pemrogramandasar;

public class Praktikum5_3 {
    public static void main(String[] args) {        
for (int i = 1; i <= 25; i++) {
           if ( i % 2 == 0 && i % 5 == 0 ) {
               System.out.println(i + " Adalah kelipatan dua dan lima");
           } else if ( i % 2 == 0 && i % 3 == 0) {
               System.out.println(i + " Adalah kelipatan dua dan tiga");
           } else if ( i % 3 == 0 && i % 5 == 0) {
               System.out.println(i + " Adalah kelipatan tiga dan lima");
           } else if ( i % 2 == 0) {
               System.out.println(i + " Adalah kelipatan dua");
           } else if ( i % 3 == 0) {
               System.out.println(i + " Adalah kelipatan tiga");
           } else if ( i % 5 == 0) {
               System.out.println(i + " Adalah kelipatan lima");
           } else {
               System.out.println(i);
           }
        }
    }
}