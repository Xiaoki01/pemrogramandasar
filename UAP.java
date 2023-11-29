package pemrogramandasar;

import java.util.Scanner;

public class UAP {

    static String username, password, cekUser, cekPass;
    static double uts, uas, rata, bobot, nilai, latihan;
    static int pilih;

    public static void main(String[] args) {
        int lanjut = 1;
        double cekBobot = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("==============================================================");
        do {
            System.out.println("Selamat datang di portal pengisian nilai SMAN 1 Mangkurat");
            System.out.println("1. Login\t2. Daftar\t3. Keluar");
            System.out.print("Pilih: ");
            pilih = keyboard.nextInt();
            switch (pilih) {
                case 1:
                    if (username == null && password == null) {
                        System.out.println("Anda belum mendaftar, silahkan mendaftar terlebih dahulu ");
                        System.out.println("==============================================================");
                        break;
                    } else {
                        login();
                        if (validLogin()) {
                            lanjut = 2;
                            System.out.println("Login Sukses! ");
                            do {
                                lobby();
                                switch (pilih) {
                                    case 1:
                                        System.out.println("==============================================================");
                                        System.out.println("Input nilai dari bobot, dan rata-rata nilai yang diperoleh selama 1 semester");
                                        do {
                                            lanjut = 3;
                                            System.out.println("1. UTS  2. UAS  3. Latihan dan kehadiran  4. Cek nilai  5. Ulang  6. Keluar");
                                            System.out.print("Pilih: ");
                                            pilih = keyboard.nextInt();

                                            switch (pilih) {
                                                case 1:
                                                    inputNilai();
                                                    if (cekNilai()) {
                                                        System.out.println("Inputan melebihi batas yang ditentukan, inputan akan diulang");
                                                    } else {
                                                        uts = jumlah();
                                                        System.out.println("Berhasil menginput");
                                                    }
                                                    break;
                                                case 2:
                                                    inputNilai();
                                                    if (cekNilai()) {
                                                        System.out.println("Inputan melebihi batas yang ditentukan, inputan akan diulang");
                                                    } else {
                                                        System.out.println("Berhasil menginput");
                                                        uas = jumlah();
                                                    }
                                                    break;
                                                case 3:
                                                    inputNilai();
                                                    if (cekNilai()) {
                                                        System.out.println("Inputan melebihi batas yang ditentukan, inputan akan diulang");
                                                    } else {
                                                        System.out.println("Berhasil menginput");
                                                        latihan = jumlah();
                                                    }
                                                    break;
                                                case 4:
                                                    if (uts == 0 || uas == 0 || latihan == 0) {
                                                        System.out.println("Silahkan lengkapi pengisian nilai terlebih dahulu");
                                                        bobot = 0;
                                                    } else {
                                                        System.out.println("Total nilai: " + rata());
                                                        bobot = 0;
                                                    }
                                                    break;
                                                case 5:
                                                    reset();
                                                    System.out.println("Semua inputan nilai telah dihapus");
                                                    cekBobot = 0;
                                                    break;
                                                case 6:
                                                    lanjut = 2;
                                                    System.out.println("Berhasil keluar menu");
                                                    bobot = 0;
                                                    break;
                                                default:
                                                    System.out.println("Menu tidak ada!");
                                                    bobot = 0;
                                                    break;
                                            }
                                            cekBobot += bobot;
                                            if (cekBobot < 0 || cekBobot > 100) {
                                                reset();
                                                cekBobot = 0;
                                                System.out.println("Inputan melebihi batas yang ditentukan, semua inputan akan diulang");
                                            }
                                        } while (lanjut > 2);
                                        break;
                                    case 2:
                                        if (uts == 0 || uas == 0 || latihan == 0) {
                                            System.out.println("Silahkan lengkapi pengisian nilai terlebih dahulu");
                                        } else {
                                            System.out.println("Total nilai: " + remed());
                                            System.out.print("Tambah nilai? (y/n): ");
                                            char ok = keyboard.next().charAt(0);
                                            if (ok == 'y' || ok == 'Y') {
                                                tambahNilai();
                                            } else {
                                                System.out.println("Anda akan dikembalikan ke menu");
                                            }
                                        }

                                        break;
                                    case 3:
                                        if (uts == 0 || uas == 0 || latihan == 0) {
                                            System.out.println("Silahkan lengkapi pengisian nilai terlebih dahulu");
                                        } else {
                                            System.out.println("Total nilai: " + remed());
                                            System.out.println("Grade Point Average: " + gpa() + " atau: " + indeksGpa());
                                        }
                                        break;
                                    case 4:
                                        lanjut = 1;
                                        System.out.println("Anda telah Logout");
                                        System.out.println("==============================================================");
                                        break;
                                    default:
                                        System.out.println("Menu tidak ada!");
                                        break;
                                }

                            } while (lanjut > 1);
                        } else {
                            System.out.println("Username atau password salah, login Gagal! ");
                            System.out.println("==============================================================");
                        }
                        break;
                    }
                case 2:
                    daftar();
                    break;
                case 3:
                    lanjut = 0;
                    System.out.println("Program berhenti");
                    break;
                default:
                    System.out.println("Menu tidak tersedia! ");
                    break;
            }
        } while (lanjut > 0);
    }

    static void daftar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("Username dan Password tersimpan, silahkan login");
        System.out.println("==============================================================");
    }

    static void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        cekUser = scan.nextLine();
        System.out.print("Password: ");
        cekPass = scan.nextLine();

    }

    static void lobby() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Selamat datang, " + username);
        System.out.println("Silahkan pilih menu");
        System.out.println("1. Input nilai\t2. Penambahan nilai\t3. Cek GPA\t4. Logout");
        System.out.print("Pilih: ");
        pilih = keyboard.nextInt();
    }

    static void inputNilai() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bobot nilai (dari 100%):  ");
        bobot = scan.nextDouble();
        System.out.print("Nilai: ");
        nilai = scan.nextDouble();
    }

    static void reset() {
        uas = 0;
        uts = 0;
        latihan = 0;
    }

    static void tambahNilai() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nilai saat ini: " + remed());
        System.out.print("Nilai Tambahan: ");
        rata = scan.nextDouble();
        System.out.println("Total nilai sekarang adalah: " + remed());

    }

    public static boolean validLogin() {
        return cekUser.equals(username) && cekPass.equals(password);
    }

    public static boolean cekNilai() {
        return (bobot <= 0 || bobot > 100) || (nilai < 0 || nilai > 100);
    }

    public static double jumlah() {
        return nilai * (bobot / 100);
    }

    public static double rata() {
        return uts + uas + latihan;
    }

    public static double remed() {
        return rata + rata();
    }

    public static double gpa() {
        return (remed()  / 20) - 1;
    }

    public static String indeksGpa() {
        if (gpa() <= 4 && gpa() > 3.7) {
            return "A+";
        } else if (gpa() > 3.5){
            return "A";
        } else if (gpa() > 3.2) {
            return "A-";
        } else if (gpa() > 3.0) {
            return "B+";
        } else if (gpa() > 2.7) {
            return "B";
        } else if (gpa() > 2.3) {
            return "B-";
        } else if (gpa() > 2) {
            return "C";
        } else {
            return "D";
        }
    }

}
