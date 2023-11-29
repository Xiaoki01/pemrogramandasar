package pemrogramandasar;

import java.util.Scanner;

public class Praktikum4_4 {

    public static void main(String[] args) {
        String unsur;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Salah satu unsur penting dalam membuat sejarah adalah : ");
        unsur = keyboard.nextLine();

        switch (unsur) {
            case "manusia":
            case "ruang":
            case "waktu":
                System.out.println(unsur + " merupakan salah satu unsur penting pembentuk sejarah");
                break;
            default:
                System.out.println(unsur + " bukanlah salah satu unsur penting pembentuk sejarah");
        }
    }
}
