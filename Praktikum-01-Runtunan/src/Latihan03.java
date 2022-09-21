import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {
        double phi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Hitung Luas Permukaan & Volume Bangun Ruang");
        System.out.println("===========================================");
        System.out.println("1. Kerucut");
        System.out.println("2. Tabung");
        System.out.println("Pilih Bangun Ruang (1/2) :");
        int bangun = input.nextInt();

        if (bangun == 1) {
            System.out.println("==================");
            System.out.println("Menghitung Kerucut");
            System.out.print("Masukkan jari - jari: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();

            System.out.println("=========================");

            double volume = volumeKerucut(phi, r, t);
            System.out.println("Hasil Volume = " + volume);

            double lp = lpKerucut(phi, r, t);
            System.out.println("Hasil Luas Permukaan = " + lp);
        } else if (bangun == 2) {
            System.out.println("=================");
            System.out.println("Menghitung Tabung");
            System.out.print("Masukkan jari - jari: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();

            System.out.println("=========================");

            double volume = volumeTabung(phi, r, t);
            System.out.println("Hasil Volume = " + volume);

            double lp = lpTabung(phi, r, t);
            System.out.println("Hasil Luas Permukaan = " + lp);
        } else {
            System.out.println("Maaf kode salah");
        }
        input.close();
    }

    static double volumeTabung(double phi, double r, double t) {
        double volume = (phi * r * r) * t;
        return volume;
    }

    static double lpTabung(double phi, double r, double t) {
        double lp = (2 * phi * r) * (r + t);
        return lp;
    }

    static double volumeKerucut(double phi, double r, double t) {
        double volume = phi * (r * r) * t / 3;
        return volume;
    }

    static double lpKerucut(double phi, double r, double t) {
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(t, 2));
        double lp = (phi * r) * (r + s);
        return lp;
    }
}
