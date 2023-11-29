package pemrogramandasar;

import java.util.Scanner;

public class UTP {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String username, pass;
        float data = (float) 5.3, pulsa = 28000;
        int menu, menuD, menuP, benar, custom;

        System.out.println("\t" + "    Selamat datang di portal admin terkonslet ");
        System.out.println("===============================================================");
        System.out.println("Silahkan melakukan login terlebih dahulu");
        System.out.print("Nama : ");
        username = keyboard.nextLine();
        System.out.print("NIM : ");
        pass = keyboard.nextLine();

        if ("rizki maulana zulyadaini".equals(username) && "2311016210027".equals(pass)) {
            System.out.println("===============================================================");
            System.out.println("Selamat datang " + username + " !");
            System.out.println("1. Cek data dan pulsa" + "\t" + "2. Isi data" + "\t" + "3. Isi pulsa");
            System.out.print("Silahkan pilih menu : ");
            menu = keyboard.nextInt();
            System.out.println("================================================================");

            switch (menu) {
                case 1:
                    System.out.println("Data : " + data + " Gb");
                    System.out.println("Pulsa : " + pulsa);
                    System.out.println("Terima Kasih !");
                    break;

                case 2:
                    System.out.println("Data anda sekarang : " + data);
                    System.out.println("Berapa nominal yang ingin anda isi ?");
                    System.out.println("1. 5Gb" + "\t" + "2. 13Gb" + "\t" + "3. 22Gb" + "\t" + "4. Pengisian diatas 25Gb");
                    System.out.print("Pilih : ");
                    menuD = keyboard.nextInt();
                    System.out.println("===============================================================");
                    switch (menuD) {
                        case 1:
                            System.out.println("Anda akan mengisi data sebanyak 5 Gb");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                data = data + 5;
                                System.out.println("Data anda sekarang : " + data + " Gb");
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;

                        case 2:
                            System.out.println("Anda akan mengisi data sebanyak 13 Gb");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                data = data + 13;
                                System.out.println("Data anda sekarang : " + data + " Gb");
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;

                        case 3:
                            System.out.println("Anda akan mengisi data sebanyak 22 Gb");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                data = data + 22;
                                System.out.println("Data anda sekarang : " + data + " Gb");
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;

                        case 4:
                            System.out.println("Anda akan mengisi data diatas 25Gb (maksimal 50Gb (dengan kelipatan 5))");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.print("Silahkan input berapa data yang ingin anda isi : ");
                                custom = keyboard.nextInt();
                                data = data + custom;
                                if (custom >= 25 && custom <= 50 && custom % 5 == 0) {
                                    System.out.println("Data anda sekarang : " + data + " Gb");
                                } else {
                                    System.err.println("Nilai yang anda inputkan tidak valid !");
                                }
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;
                        default:
                            System.out.println("Silahkan pilih menu 1, 2, 3 atau 4");
                    }
                        break ;
                    
                case 3:
                    System.out.println("Pulsa anda sekarang : " + pulsa);
                    System.out.println("Berapakah nominal yang ingin anda isi ?");
                    System.out.println("1. 25000" + "\t" + "2. 50000" + "\t" + "3. 100000" + "\t" + "4. Pengisian diatas 150000");
                    System.out.print("Pilih :");
                    menuP = keyboard.nextInt();
                    
                    switch (menuP) {
                        case 1:
                            System.out.println("Anda akan mengisi pulsa sebanyak 25000");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                pulsa = pulsa + 25000;
                                System.out.println("Pulsa anda sekarang : " + pulsa);
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;
                            
                        case 2:
                            System.out.println("Anda akan mengisi pulsa sebanyak 50000");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                pulsa = pulsa + 50000;
                                System.out.println("Pulsa anda sekarang : " + pulsa);
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;
                            
                        case 3:
                            System.out.println("Anda akan mengisi pulsa sebanyak 100000");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.println("Terima kasih !");
                                pulsa = pulsa + 100000;
                                System.out.println("Pulsa anda sekarang : " + pulsa);
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;
                            
                        case 4:
                            System.out.println("Anda akan mengisi pulsa diatas 150000 (maksimal 750000 (dengan kelipatan 50000))");
                            System.out.print("Ketik \"1\" untuk melanjutkan : ");
                            benar = keyboard.nextInt();
                            if (benar == 1) {
                                System.out.print("Silahkan input berapa pulsa yang ingin anda isi : ");
                                custom = keyboard.nextInt();
                                pulsa = pulsa + custom;
                                if (custom >= 150000 && custom <= 750000 && custom % 50000 == 0) {
                                    System.out.println("Data anda sekarang : " + pulsa);
                                } else {
                                    System.err.println("Nilai yang anda inputkan tidak valid !");
                                }
                            } else {
                                System.out.println("Terima kasih, anda akan otomatis log out");
                            }
                            break;
                        default:
                            System.out.println("Silahkan pilih menu 1, 2, 3 atau 4");
                            
                    }
                break ;
                default:
                    System.out.println("Silahkan pilih menu 1, 2, atau 3");
            }

        } else {
            System.err.println("Username atau password salah !");
        }
    }
}
