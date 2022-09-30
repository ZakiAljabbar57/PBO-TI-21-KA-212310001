// Zaki Aljabbar - 212310001 - TI-21-KA

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Latihan04 func = new Latihan04();

        System.out.println("Faktorisasi Bilangan");
        System.out.println("1. ASC");
        System.out.println("2. DESC");
        System.out.print("Pilih menu : ");
        int menu = input.nextInt();

        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();

        switch (menu) {
            case 1:
                func.ascFaktorisasi(bil);
                break;

            case 2:
                func.descFaktorisasi(bil);
                break;

            default:
                break;
        }

        input.close();
    }

    void ascFaktorisasi(int bilangan) {
        if (bilangan < 20) {
            System.out.println("Maaf bilangan kurang dari 20");
        } else {
            int n = 0;
            for (int i = 0; i <= bilangan; i++) {
                n++;
                if (bilangan % n == 0) {
                    System.out.print(n + " ");
                }
            }
        }
    }

    void descFaktorisasi(int bilangan) {
        if (bilangan < 20) {
            System.out.println("Maaf bilangan kurang dari 20");
        } else {
            int n = bilangan;
            for (int i = bilangan; i >= 1; i--) {
                if (bilangan % n == 0) {
                    System.out.print(n + " ");
                }
                n--;
            }
        }
    }
}
