package pemrogramandasar;

import java.util.Scanner;

public class Praktikum4_3 {

    public static void main(String[] args) {
        String bulan, hari;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Mencari Jumlah Hari Bulan Pada Kalender Islam");
        System.out.print("Inputkan Nama Bulan : ");
        bulan = keyboard.nextLine();

        switch (bulan) {
            case "muharram":
            case "rabiul awal":
            case "jumadil awal":
            case "rajab":
            case "zulkaidah":
                hari = "29";
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah " + hari + " hari");
                break;
            case "safar":
            case "rabiul akhir":
            case "jumadil akhir":
            case "syaban":
            case "ramadhan":
            case "syawal":
                hari = "30";
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah " + hari + " hari");
                break;
            case "zulhijjah":
                hari = "29 / 30";
                System.out.println("Jumlah hari pada bulan " + bulan + " adalah " + hari + " hari");
                break;
            default:
                System.out.println("Inputan tidak sesuai");
        }

    }
}
