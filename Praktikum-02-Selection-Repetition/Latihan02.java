// Zaki Aljabbar - 212310001 - TI-21-KA

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NPM : ");
        int npm = input.nextInt();

        int bil = 0;
        for (int i = 1; i <= npm; i++) {
            if (npm % i == 0) {
                bil = bil + 1;
            }
        }

        String prima = (bil == 2) ? "Termasuk Bilangan PRIMA"
                : "Bukan Termasuk Bilangan Prima karena dapat dibagi dengan 2";
        System.out.println(prima);

        input.close();
    }
}
